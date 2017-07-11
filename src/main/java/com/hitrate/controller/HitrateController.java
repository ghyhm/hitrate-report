package com.hitrate.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

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

//	@RequestMapping(value = "/hitrate/{id}", method = RequestMethod.GET)
//	public ResponseEntity<Hitrate> getHitrateById(@PathVariable("id") Integer id) {
//		Hitrate hitrate = hitrateService.getHitrateById(id);
//		return new ResponseEntity<Hitrate>(hitrate, HttpStatus.OK);
//	}
//
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

//	@RequestMapping(value = "/hitrate", method = RequestMethod.POST)
//	public ResponseEntity<Void> addWine(@RequestBody Hitrate wine, UriComponentsBuilder builder) {
//		boolean flag = hitrateService.addWine(wine);
//		if (flag == false) {
//			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//		}
//		HttpHeaders headers = new HttpHeaders();
//		headers.setLocation(builder.path("/wine/{id}").buildAndExpand(wine.getPid()).toUri());
//		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//	}
//
//	@RequestMapping(value = "/wine/{id}", method = RequestMethod.PUT)
//	public ResponseEntity<Hitrate> updateWine(@RequestBody Hitrate wine) {
//		hitrateService.updateWine(wine);
//		return new ResponseEntity<Hitrate>(wine, HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "/wine/{id}", method = RequestMethod.DELETE)
//	public ResponseEntity<Void> deleteWine(@PathVariable("id") Integer id) {
//		hitrateService.deleteWine(id);
//		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//	}

	@RequestMapping("/templates/hitrate-list")
	public String hitrateList() {
		return "templates/hitrate-list";
	}

//	@RequestMapping("/templates/wine-details")
//	public String wineDetails() {
//		return "templates/wine-details";
//	}
//
//	@RequestMapping(value = "/templates/wine-details/{id}", method = RequestMethod.GET)
//	public String wineDetails(@PathVariable("id") String id) {
//		return "templates/wine-details";
//	}
}