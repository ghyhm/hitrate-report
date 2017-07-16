package com.hitrate.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.hitrate.entity.Exclusion;
import com.hitrate.entity.Hitrate;

@Transactional
@Repository
public class HitrateDAO implements IHitrateDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private RestTemplate restTemplate;

//	@Override
//	public Hitrate getWineById(int pid) {
//		return hibernateTemplate.get(Hitrate.class, pid);
//	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hitrate> getAllHitrates() {
		String hql = "FROM Hitrate as p ORDER BY p.id";
		return (List<Hitrate>) hibernateTemplate.find(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hitrate> searchHitrates(String visitDate) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String[] excludedWebsites = getExcludedWebsites(formatter.parse(visitDate));
		
		StringBuffer hql = new StringBuffer("FROM Hitrate as p WHERE p.visitDate = :visitDate");
		List<String> paramNames = new ArrayList<String>();
		List<Object> paramValues = new ArrayList<Object>();
		paramNames.add("visitDate");
		paramValues.add(formatter.parse(visitDate));
		if (excludedWebsites.length > 0) {
			hql.append(" and p.website not in (:websites)");
			paramNames.add("websites");
			paramValues.add(excludedWebsites);
		}
		hql.append(" ORDER BY p.visits desc");
		hibernateTemplate.setMaxResults(5);
		return (List<Hitrate>) hibernateTemplate.findByNamedParam(hql.toString(), paramNames.toArray(new String[0]), paramValues.toArray());
	}

	private String[] getExcludedWebsites(Date visitDate) {
		ResponseEntity<Exclusion[]> responseEntity = restTemplate.getForEntity("http://private-1de182-mamtrialrankingadjustments4.apiary-mock.com/exclusions", Exclusion[].class);
		Exclusion[] exclusions = responseEntity.getBody();
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		String[] excludedWebsites = Arrays.stream(exclusions).filter(x -> !visitDate.before(x.getExcludedSince()) && !visitDate.after(x.getExcludedTill())).map(d -> d.getHost()).toArray(String[]::new);
		
		for (String h : excludedWebsites) {
			System.out.println(h);
		}

		return excludedWebsites;
	}
}
