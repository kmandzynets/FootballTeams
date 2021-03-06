package com.lits.FootballTeams;

public class Team {
	
	private String coach;
	private String location;
	private int establishedYear;
	
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getEstablishedYear() {
		return establishedYear;
	}
	public void setEstablishedYear(int establishedYear) {
		this.establishedYear = establishedYear;
	}
	public String toString() {
		return String.format("%-16s\t%-8s\t%d", coach, location, establishedYear);
	}
}
