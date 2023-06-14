package com.example.springApp.springApp.Business;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springApp.springApp.DataAccess.ITeamsDal;
import com.example.springApp.springApp.Entities.teams;


@Service
public class teamsManager implements ITeamsService{
	
	
	private ITeamsDal teamsDal;
	
	@Autowired
	public teamsManager(ITeamsDal teamsDal) {
		this.teamsDal = teamsDal;
	}
	@Override
	@Transactional
	public List<teams> getAll() {
		
		return this.teamsDal.getAll();
	}

	@Override
	@Transactional
	public void add(teams teams) {
		//Burada kurallar yazılır 
		this.teamsDal.add(teams);
	}

	@Override
	@Transactional
	public void update(teams teams) {
		this.teamsDal.update(teams);
		
	}

	@Override
	@Transactional
	public void delete(teams teams) {
		this.teamsDal.delete(teams);
		
	}
	@Override
	@Transactional
	public teams getById(int id) {
		
		return this.teamsDal.getById(id);
	}
	
}
