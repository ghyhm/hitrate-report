package com.hitrate.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hitrate.entity.Hitrate;

@Transactional
@Repository
public class HitrateDAO implements IHitrateDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

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
//		String hql = "FROM Hitrate as p where p.visitDate = :visitDate ORDER BY p.id";
//		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd", Locale.ENGLISH);
//		return (List<Hitrate>) hibernateTemplate.findByNamedParam(hql, "visitDate", dateFormat.parse(visitDate));
		String hql = "FROM Hitrate as p WHERE p.visitDate = '" + visitDate + "' ORDER BY p.id";
		return (List<Hitrate>) hibernateTemplate.find(hql);
	}

//	@Override
//	public void addWine(Hitrate wine) {
//		hibernateTemplate.save(wine);
//	}
//
//	@Override
//	public void updateWine(Hitrate wine) {
//		Hitrate p = getWineById(wine.getPid());
//		p.setName(wine.getName());
//		p.setLocation(wine.getLocation());
//		hibernateTemplate.update(p);
//	}
//
//	@Override
//	public void deleteWine(int pid) {
//		hibernateTemplate.delete(getWineById(pid));
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public boolean wineExists(String name, String location) {
//		String hql = "FROM Wine as p WHERE p.name = ? and p.location = ?";
//		List<Hitrate> wines = (List<Hitrate>) hibernateTemplate.find(hql, name, location);
//		return wines.size() > 0 ? true : false;
//	}
}
