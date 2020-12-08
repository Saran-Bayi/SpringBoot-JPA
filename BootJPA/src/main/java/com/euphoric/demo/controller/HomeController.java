package com.euphoric.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.euphoric.demo.impl.ALienInfoIMPL;
import com.euphoric.demo.model.Alien;

@Controller
public class HomeController {
	@Autowired
	private ALienInfoIMPL ai;
	
	
	@RequestMapping(value = "/add" ,method = RequestMethod.GET)
	public String add() {
		return "addAlien";
	}
	@RequestMapping(value = "/add" , method = RequestMethod.POST)
	public String add2(@ModelAttribute("aa") Alien a, Model m) {
		List<Alien> la;
		ai.addAlien(a);
		la = ai.listOfAllAliens();
		m.addAttribute("aliens", la);
		return "viewAlien";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String edit(@RequestParam("id") int id, Model m) {
		Alien s =ai.findAlien(id); 
		m.addAttribute("aliens", s);
		return "editAlien";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit2(@ModelAttribute("aa") Alien a, Model m) {
		List<Alien> la;
		ai.editAlien(a);
		la = ai.listOfAllAliens();
		m.addAttribute("aliens", la);
		return "viewAlien";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("id") int id, Model m) {
		int f = ai.deleteAlien(id);
		if(f==1) {
			List<Alien> la = ai.listOfAllAliens();
			m.addAttribute("aliens", la);
		return "viewAlien";
		}else {
			List<Alien> la = ai.listOfAllAliens();
			m.addAttribute("aliens", la);
			return "viewAlien?message=delete Unsuccessfull";
		}
	}
	@RequestMapping(value = "/view" , method = RequestMethod.GET)
	public String view(Model m) {
		List<Alien> s = ai.listOfAllAliens();
		m.addAttribute("aliens", s);
		return "viewAlien";
	}
	@RequestMapping(value = "/view" , method = RequestMethod.POST)
	public String view2(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("tech") String tech, Model m) {
		List<Alien> s;
		Alien a = new Alien();
		a.setId(id);
		a.setName(name);
		a.setTech(tech);
		ai.editAlien(a);
		s= ai.listOfAllAliens();
		m.addAttribute("aliens", s);
		return "viewAlien";
	}
}
