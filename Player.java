/**
 * James Soto
 * SNHU CS-230
 * The Gaming Room Project
 */

package com.gamingroom;


// Player class extends from Entity
public class Player  extends Entity{
	
	// Constructor for player that contains identifier and name
	public Player(long id, String name) {
		super(id, name);
	}
		
	@Override
	public String toString() {
		return "Player [id = " + super.getId() + ", name = " + super.getName() +  "]";
	}
}
