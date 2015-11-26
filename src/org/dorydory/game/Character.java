package org.dorydory.game;

import java.util.ArrayList;

public class Character {
	private String name = null;
	private String jobName = null;
	private int job = 0;
	private int hp = 100;
	private int mp = 100;
	private int atk, inteli, def;
	private int gold = 0;
	private ArrayList<String> skillList;
	private ArrayList<String> itemList;
	private ArrayList<String> eqList;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getMp() {
		return mp;
	}
	
	public void setJob(int job) {
		this.job = job;
	}
	
	public int getJob() {
		return job;
	}
	
	public void addGold(int gold) {
		this.gold += gold;
	}
	
	public void useGold(int gold) {
		this.gold -=- gold;
	}
	
	public int getGold() {
		return gold;
	}
	
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public void setStatus(int job) {
		if(job == 1) {
			setJobName("Warrior");
			this.atk = 20;
			this.inteli = 5;
			this.def = 10;
		}
		
		else  if(job == 2) {
			setJobName("Magician");
			this.atk = 5;
			this.inteli = 20;
			this.def = 10;
		}
	}

}
