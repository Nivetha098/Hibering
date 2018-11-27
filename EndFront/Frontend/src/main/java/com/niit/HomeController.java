package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	
	
	@RequestMapping(value="/Home")
	public String homepage()
	{
		return "Home";
		
	}
	@RequestMapping(value="/all/Admin")
	public String adminpage()
	{
		return "Admin";
		
	}
	@RequestMapping(value="/all/Header")
	public String getHeader()
	{
		return "Header";
	}
	@RequestMapping(value="/all/Footer")
	public String getFooter()
	{
		return "Footer";
	}
	@RequestMapping(value="/all/AboutUs")
	public String getAboutUs()
	{
		return "Aboutus";
	}
	
	@RequestMapping(value="/Login")
	public String loginPage()
	{
		return "Login";
	}
	@RequestMapping(value="/loginerror")
	
	public String loginFailed(Model model){
		model.addAttribute("error","Invalid credentials..");
		return "Login";
	}
	@RequestMapping(value="/logout")
	public String logout(Model model){
		model.addAttribute("msg","Loggedout successfully...");
		return "Login";
	}
	
}