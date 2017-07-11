package com.hitrate.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hitrate.entity.User;
import com.hitrate.service.ILoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private ILoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
    public String loginForm() {
        return "login";
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public void login(@RequestParam("name") String name, @RequestParam("password") String password, HttpServletRequest request, HttpServletResponse response) throws IOException {
		User user = new User(name, password);
		loginService.login(user);
		request.getSession().setAttribute("CURRENT_USER", user);
		response.sendRedirect("/hitrate-report/#!list");
    }
}