package com.hitrate.dao;

import java.util.Date;
import java.util.List;

import com.hitrate.entity.Hitrate;

public interface IHitrateDAO {
	List<Hitrate> getAllHitrates();
	
	List<Hitrate> searchHitrates(String visitDate) throws Exception;

//	Hitrate getWineById(int pid);
//
//	void addWine(Hitrate wine);
//
//	void updateWine(Hitrate wine);
//
//	void deleteWine(int pid);
//
//	boolean wineExists(String name, String location);
}
