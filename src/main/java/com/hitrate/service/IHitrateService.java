package com.hitrate.service;

import java.util.List;

import com.hitrate.entity.Hitrate;

public interface IHitrateService {
	List<Hitrate> getAllHitrates();

	List<Hitrate> searchHitrates(String visitDate) throws Exception;
}
