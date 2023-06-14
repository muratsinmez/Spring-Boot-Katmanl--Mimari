package com.example.springApp.springApp.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.*;


import com.example.springApp.springApp.Entities.teams;

public class HibernateTeamsDal implements ITeamsDal {
	
	
	private EntityManager entityManager;
	
	
	@Autowired
	public HibernateTeamsDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
// AOP - Aspect Oriented Programming -- kod çalıştığında session oto açıp kapatıcak.
	@Override
	@Transactional
	//listeleme tamam
	public List<teams> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<teams> teams = session.createQuery("from teams", teams.class).getResultList();
		return teams;
	}

	//id verilirse verilen bilgiyi günceller 
	@SuppressWarnings("deprecation")
	//id verilmezse kendi id ekler ve ekler
	@Override
	public void add(teams teams) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(teams);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void update(teams teams) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(teams);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void delete(teams teams) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(teams);
		
	}
	@Override
	public teams getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		teams teams = session.get(teams.class, id);
		return teams;		
	}
	
}
