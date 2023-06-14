package com.example.springApp.springApp.Business;

import java.util.List;

import com.example.springApp.springApp.Entities.teams;

public interface ITeamsService {
	
	List<teams> getAll();
	void add(teams teams);
	void update(teams teams);
	void delete(teams teams);
	teams getById(int id);
	
}
