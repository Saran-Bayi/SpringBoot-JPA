package com.euphoric.demo.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.euphoric.demo.model.Alien;

public interface AlienInfo extends JpaRepository<Alien, Integer> {
	
	public Alien findByName(String Name);

}
