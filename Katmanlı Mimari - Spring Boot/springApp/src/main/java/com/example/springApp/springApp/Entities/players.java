package com.example.springApp.springApp.Entities;

import jakarta.persistence.*;

@Table(name ="players")
public class players {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idplayers;
	
	@Column(name="players")
	private String players;
	
	@Column(name="home town")
	private String homeTown;
	public players(int idplayers, String players, String homeTown) {
		super();
		this.idplayers = idplayers;
		this.players = players;
		this.homeTown = homeTown;
	}
	public int getIdplayers() {
		return idplayers;
	}
	public void setIdplayers(int idplayers) {
		this.idplayers = idplayers;
	}
	public String getPlayers() {
		return players;
	}
	public void setPlayers(String players) {
		this.players = players;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	
}
