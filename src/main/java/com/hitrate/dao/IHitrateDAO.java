package com.hitrate.dao;

import java.util.List;

import com.hitrate.entity.Hitrate;

public interface IHitrateDAO {
	List<Hitrate> getAllHitrates();

	List<Hitrate> searchHitrates(String visitDate) throws Exception;
}
