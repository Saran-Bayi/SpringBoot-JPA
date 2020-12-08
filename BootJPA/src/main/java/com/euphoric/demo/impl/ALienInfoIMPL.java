package com.euphoric.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euphoric.demo.model.Alien;

@Service
public class ALienInfoIMPL {
	@Autowired
	private AlienInfo ai;

	public Alien addAlien(Alien a) {
		return ai.save(a);
	}

	public Alien editAlien(Alien a) {
		Alien existingAlien = ai.findById(a.getId()).orElse(null);
		existingAlien.setName(a.getName());
		existingAlien.setTech(a.getTech());
		return ai.save(existingAlien);

	}
	
	public Alien findAlien(int id) {
		return ai.findById(id).orElse(null);
	}
	
	public int deleteAlien(int id) {
		Alien existingAlien = ai.findById(id).orElse(null);
		ai.delete(existingAlien);
		return 1;
	}
	
	public List<Alien> listOfAllAliens(){
		return ai.findAll();
	}

}
