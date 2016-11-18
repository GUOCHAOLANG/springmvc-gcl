package com.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.LoginCheck;

@Controller
public class FirstSpringMVC {
	@RequestMapping("/spring")
	public ModelAndView test() {
		String str = "this is a SpringMVC instance!";
		return new ModelAndView("show", "str", str);
	}

	@RequestMapping("/login")
	public ModelAndView check(HttpServletRequest request) {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		// 调用业务处理LoginCheck
		if (LoginCheck.check(name, password)) {
			return new ModelAndView("success", "username", name);
		}
		return new ModelAndView("error", "username", name);
	}
}
