package com.hitrate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitrate.dao.IHitrateDAO;
import com.hitrate.entity.Hitrate;

@Service
public class HitrateService implements IHitrateService {
	@Autowired
	private IHitrateDAO hitrateDAO;

	@Override
	public List<Hitrate> getAllHitrates() {
		return hitrateDAO.getAllHitrates();
	}

	@Override
	public List<Hitrate> searchHitrates(String visitDate) throws Exception {
		return hitrateDAO.searchHitrates(visitDate);
	}
}
