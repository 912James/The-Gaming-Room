/**
 * James Soto
 * SNHU CS-230
 * The Gaming Room Project
 */

package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GameService {

	private static List<Game> games = new ArrayList<Game>();

	
	private static long nextGameId = 1;
	
	// Holds the next player identifier
	private static long nextPlayerId = 1;

	 
	// Holds the next team identifier
	private static long nextTeamId = 1;
	
	
	private static GameService instance;
	
	
	
	public static GameService getInstance() {
		// Return instance to Singleton Game Service
		// Checks if instance is already use. If instance is already set, return instance
		// If the instance does not exists, create a new GameService and return
		// This singleton pattern implementation will ensure only one instance of the GameService class will exist in our application.
		
		if(instance == null) {
			instance = new GameService();
		}
		
		return instance;
}

	public Game addGame(String name) {

		// a local game instance
		Game game = null;
		
		//Instance iterator as required
		Iterator<Game> gamesIterator = games.iterator();
		
		// while loop to iterate over the games list
		while(gamesIterator.hasNext()) {
			game = gamesIterator.next();
			if(game.getName().equalsIgnoreCase(name)) {
				break;
	
			}
			game = null;
		}

		// if statement that adds a new game instance if no game is found
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return game
		return game;
	}

	
	Game getGame(int index) {
		return games.get(index);
	}
	

	public Game getGame(long id) {

		Game game = null;

		//Instance iterator as required
		Iterator<Game> gamesIterator = games.iterator();
		
		//while loop to iterate over ID
		while(gamesIterator.hasNext()) {
			game = gamesIterator.next();
			if(game.getId() == id)
				return game;
		}
		
		return null;
		
	}
	
	public Game getGame(String name) {

		
		Game game = null;
		
		//Instance iterator as required
		Iterator<Game> gamesIterator = games.iterator();
		
		//while loop to iterate over name
		while(gamesIterator.hasNext()) {
			game = gamesIterator.next();
			if(game.getName().equals(name))
				return game;
		}
		
		return null;
	}

	
	public int getGameCount() {
		return games.size();
	}
	
	// returns the player who is next
	public long getNextPlayerId() {
		return nextPlayerId;
	}
	
	// returns the team who is next
	public long getNextTeamId() {
		return nextTeamId;
		
	}
}
