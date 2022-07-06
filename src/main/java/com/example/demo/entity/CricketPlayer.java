package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CricketPlayer {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int runscored;
	private String playertype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRunscored() {
		return runscored;
	}
	public void setRunscored(int runscored) {
		this.runscored = runscored;
	}
	public String getPlayertype() {
		return playertype;
	}
	public void setPlayertype(String playertype) {
		this.playertype = playertype;
	}
	public CricketPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CricketPlayer(int id, String name, int runscored, String playertype) {
		super();
		this.id = id;
		this.name = name;
		this.runscored = runscored;
		this.playertype = playertype;
	}
	

}
