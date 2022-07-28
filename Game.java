/**
 * James Soto
 * SNHU CS-230
 * The Gaming Room Project
 */

package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Game class extends from Entity
public class Game extends Entity {
	
	//Array list of the active teams
	private static List<Team> teams = new ArrayList<Team>();
	

	public Game(long id, String name) {
		super(id, name);
	}
	
	public Team addTeam(String name) {
		Team team = null;
		
		//Instance iterator as required
		Iterator<Team> teamIterator = teams.iterator();
		
		// while loop to iterate over the teams list
		while(teamIterator.hasNext()) {
			team = teamIterator.next();
			if(team.getName().equals(name)) {
				break;
			}
			
			team = null;
		}
		
		// if statement that adds a new team instance if no team is found
		if(team == null) {
			team = new Team(teams.size()+1,name);
			teams.add(team);
		}
		
		// return team
		return team;
		
	}
			
	@Override
	public String toString() {
		
		return "Game [id = " + super.getId() + ", name = " + super.getName() +  "]";
	}

} 
