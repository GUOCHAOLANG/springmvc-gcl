package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AbcController {

	@RequestMapping(value="/hello")
	public String hello(){
		System.out.println("spring mvc hello gcl");
		return "hello";
	}
	
	/*
	 * 1客户端->服务端get方式的参数传递-url
	 * 2url的参数必须是跟对应的请求方式的参数一致
	 */
	//1
	@RequestMapping(value="/ok")
	public String ok(@RequestParam("userid")int id){
		System.out.println(id);
		return "ok";
	}
	//2
	@RequestMapping(value="/ok1")
	public String ok1(@RequestParam int id){
		System.out.println(id);
		return "ok";
	}
	//3
	@RequestMapping(value="/ok2")
	public String ok2(int id,int age){
		System.out.println(id);
		System.out.println(age);
		return "ok";
	}
	/*
	 * 服务器端->客户端 参数传递方式
	 */
	//1
	@RequestMapping(value="/ok3")
	public String ok3(Map<String,Object> map){
		map.put("hello", "guobo");
		return "ok";
	}
	//2 推荐方式
	@RequestMapping(value="/ok4")
	public String ok4(Model model){
		model.addAttribute("hello","gcl");
		model.addAttribute("world");	//key为value的类型
		return "ok";
	}
	
	//获取req,resp
	@RequestMapping(value="req")
	public String req(HttpServletRequest req, HttpServletResponse resp){
		System.out.println(req.getParameter("id"));
		return "ok";
	}
	
}
