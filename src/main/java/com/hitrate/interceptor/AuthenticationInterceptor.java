package com.hitrate.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hitrate.entity.User;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("AuthenticationInterceptor");
		User user = (User) request.getSession().getAttribute("CURRENT_USER");
		if (user == null) {
			response.sendRedirect("/hitrate-report/login");
			return false;
		}
		return true;
	}
}
