/**
 * James Soto
 * SNHU CS-230
 * The Gaming Room Project
 */

package com.gamingroom;

//Super Class that serves as our parent class
public class Entity {

	//Private variables
	private long id;
	private String name;
	
	//Default Constructor
	public Entity() {
		
	}
	
	//Parameter constructor for Entity which contains id and name
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		
		return "Entity [id = " + id + ", name = " + name + "]";
	}
	
	

}