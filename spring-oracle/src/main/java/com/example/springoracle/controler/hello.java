package com.example.springoracle.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springoracle.model.Team;
import com.example.springoracle.repository.TeamRepository;



@RestController
public class hello {
@Autowired
TeamRepository te;
	@GetMapping("/hello")
	public Optional<Team> teams(){
		Iterable<Team> t=new ArrayList<Team>();
		System.out.println(te.findAll());
		return te.findById(1L);
	}
	
}
