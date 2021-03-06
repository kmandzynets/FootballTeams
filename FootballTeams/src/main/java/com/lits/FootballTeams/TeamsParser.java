package com.lits.FootballTeams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TeamsParser {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		InputStream input = new FileInputStream("src/main/resources/teams.json");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		TypeFactory typeFactory = TypeFactory.defaultInstance();
		List<Team> teams = objectMapper.readValue(input, typeFactory.constructCollectionType(
						ArrayList.class, Team.class));
		System.out.println("List of football teams:\n" + "--------------------------------------------");
		for (Team team : teams) {
			System.out.println(team);
		}
		Collections.sort(teams, new TeamComparator());
		System.out.println("\nSorted list:\n" + "--------------------------------------------");
		for (Team team : teams) {
			System.out.println(team);
		}
	}
}
