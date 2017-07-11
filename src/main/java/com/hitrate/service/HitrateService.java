package com.hitrate.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitrate.dao.IHitrateDAO;
import com.hitrate.entity.Hitrate;

@Service
public class HitrateService implements IHitrateService {
	@Autowired
	private IHitrateDAO hitrateDAO;

//	@Override
//	public Hitrate getHitrateById(int pid) {
//		Hitrate obj = hitrateDAO.getWineById(pid);
//		return obj;
//	}

	@Override
	public List<Hitrate> getAllHitrates() {
		return hitrateDAO.getAllHitrates();
	}

	@Override
	public List<Hitrate> searchHitrates(String visitDate) throws Exception {
		return hitrateDAO.searchHitrates(visitDate);
	}

//	@Override
//	public synchronized boolean addWine(Hitrate wine) {
//		if (hitrateDAO.wineExists(wine.getName(), wine.getLocation())) {
//			return false;
//		} else {
//			hitrateDAO.addWine(wine);
//			return true;
//		}
//	}
//
//	@Override
//	public void updateWine(Hitrate wine) {
//		hitrateDAO.updateWine(wine);
//	}
//
//	@Override
//	public void deleteWine(int pid) {
//		hitrateDAO.deleteWine(pid);
//	}
}
