package com.example.springApp.springApp.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class teams {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idteams;
	
	@Column(name="teamname")
	private String teamname;
	
	public teams(int idteams, String teamname) {
		super();
		this.idteams = idteams;
		this.teamname = teamname;
	}
	public int getIdteams() {
		return idteams;
	}
	public void setIdteams(int idteams) {
		this.idteams = idteams;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	
}
