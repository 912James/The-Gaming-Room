/**
 * James Soto
 * SNHU CS-230
 * The Gaming Room Project
 */ 

package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// Team class extends from Entity
public class Team extends Entity {
	
	// Array list of the active players in the game
	private List<Player> players = new ArrayList<Player>();
	
			
	public Team(long id, String name) {
		super(id, name);
	}
	
public Player addPlayer(String name) {
		
		// local player instance
		Player player = null;
		
		//Instance iterator as required
		Iterator<Player> playerIterator = players.iterator();
		
		// while loop to iterate over the player list
		while(playerIterator.hasNext()) {
			player = playerIterator.next();
			if(player.getName().equals(name)) {
				break;
			}
			
			player = null;
		}
		
		// if statement that adds new player instance if no player is found
		if(player == null) {
			player = new Player(players.size()+1,name);
			players.add(player);
		}
		
		// returns player
		return player;
		
	}
		
	@Override
	public String toString() {
		return "Team [id = " + super.getId() +  ", name = " + super.getName() +  "]";
	}
}
