package com.lti.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController
{

	@RequestMapping(value="/hola", method=RequestMethod.GET)
	public ModelAndView sayHello()
	{
		ModelAndView model=new ModelAndView("hola");
		
		model.addObject("message","welcome to the Spring mvc");
		
		return model;
	}
	
	@RequestMapping(value="/sayHello", method=RequestMethod.GET)
	public ModelAndView sayHelloToName(@RequestParam("name") String name)
	{
		ModelAndView model=new ModelAndView("sayHello");
		
		model.addObject("name",name);
		
		model.addObject("date", new Date());
		return model;
	}
	
	@RequestMapping(value="/odd", method=RequestMethod.GET)
	public ModelAndView odd(@RequestParam("number") int number)
	{
		ModelAndView model=new ModelAndView("odd");
		
		String dec;
		if(number%2==0)
		{
			dec="Correct";
		}
		
		else
		{
			dec="NOT";
		}
		model.addObject("dec", dec);
		
		return model;
	}
}