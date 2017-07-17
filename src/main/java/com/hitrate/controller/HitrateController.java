package com.hitrate.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.hitrate.entity.Hitrate;
import com.hitrate.service.IHitrateService;

@Controller
public class HitrateController {
	@Autowired
	private IHitrateService hitrateService;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/hitrate", method = RequestMethod.GET)
	public ResponseEntity<List<Hitrate>> getAllHitrates() {
		List<Hitrate> list = hitrateService.getAllHitrates();
		return new ResponseEntity<List<Hitrate>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ResponseEntity<List<Hitrate>> searchHitrates(@RequestParam("visitDate") String visitDate) throws Exception {
		List<Hitrate> list = hitrateService.searchHitrates(visitDate);
		return new ResponseEntity<List<Hitrate>>(list, HttpStatus.OK);
	}

	@RequestMapping("/templates/hitrate-list")
	public String hitrateList() {
		return "templates/hitrate-list";
	}
}
