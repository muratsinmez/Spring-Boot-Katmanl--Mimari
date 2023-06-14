package com.example.springApp.springApp.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springApp.springApp.Business.ITeamsService;
import com.example.springApp.springApp.Entities.teams;

@RestController
@RequestMapping("/api")
public class TeamsController {
	
	private ITeamsService teamsService;
	
	@Autowired
	public TeamsController(ITeamsService teamsService) {
		this.teamsService = teamsService;
	}
	
	
	@PostMapping("/teams")
	public List<teams> get(){
		return teamsService.getAll();
	}
	
	@PostMapping("/teamsAdd")
	public void add(@RequestBody teams teams) {
		teamsService.add(teams);
	}
	
	@PostMapping("/teamsUpdate")
	public void update(@RequestBody teams teams) {
		teamsService.update(teams);
	}
	
	@PostMapping("/teamsDelete")
	public void delete(@RequestBody teams teams) {
		teamsService.delete(teams);
	}
	@GetMapping("/teams/{id}")
	public List<teams> getById(@PathVariable int id){
		return (List<teams>) teamsService.getById(id);
	}
}
