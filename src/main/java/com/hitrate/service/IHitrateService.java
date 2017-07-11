package com.hitrate.service;

import java.util.Date;
import java.util.List;

import com.hitrate.entity.Hitrate;

public interface IHitrateService {
	List<Hitrate> getAllHitrates();

	List<Hitrate> searchHitrates(String visitDate) throws Exception;

//	Hitrate getHitrateById(int pid);
//
//	boolean addWine(Hitrate wine);
//
//	void updateWine(Hitrate wine);
//
//	void deleteWine(int pid);
}
