package com.lits.FootballTeams;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class TeamComparator implements Comparator<Team> {

	public int compare(Team team1, Team team2) {
		return new CompareToBuilder().append(team1.getCoach(), team2.getCoach())
				.append(team1.getLocation(), team2.getLocation())
				.append(team1.getEstablishedYear(), team2.getEstablishedYear()).toComparison();
	}
}
