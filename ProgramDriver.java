/**
 * James Soto
 * SNHU CS-230
 * The Gaming Room Project
 */

package com.gamingroom;



public class ProgramDriver {
	
	
	public static void main(String[] args) {
		
		// replaced null with GameService.getInstance()
		GameService service = GameService.getInstance(); 

		GameService.getInstance();
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		
		Game game3 = service.addGame("James");
		System.out.println(game3);
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();

		System.out.println("\n");
		
		//Expand to test the creation of different teams and by adding players to each team
		//Testing creating teams for the first game in the GameService
		System.out.println("Creating Teams For first Game");
		
		System.out.println(service.getGame(0).addTeam("Red Team"));
		System.out.println(service.getGame(0).addTeam("Blue Team"));
		System.out.println(service.getGame(0).addTeam("White Team"));
		System.out.println(service.getGame(0).addTeam("Black Team"));
		
		
	}
}
