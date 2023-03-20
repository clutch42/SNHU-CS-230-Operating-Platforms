package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// FIXME: obtain reference to the singleton instance
		GameService service = GameService.getInstance(); // replace null with the method getInstance
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		Game game3 = service.addGame("Game #2");
		System.out.println(game3);
		Game game4 = service.addGame("Game #4");
		System.out.println(game4);
		Team team1 = game4.addTeam("Team #1");
		System.out.println(team1);
		Team team2 = game1.addTeam("Team #1");
		System.out.println(team2);
		Team team3 = game1.addTeam("Team #1");
		System.out.println(team3);
		Team team4 = game1.addTeam("Team #2");
		System.out.println(team4);
		Team team5 = game4.addTeam("Team #2");
		System.out.println(team5);
		Player player1 = team2.addPlayer("1");
		System.out.println(player1);
		Player player2 = team2.addPlayer("2");
		System.out.println(player2);
		Player player3 = team1.addPlayer("2");
		System.out.println(player3);
		System.out.println();
		//System.out.println(service.getGame(4));
		service.printAllGames();
		
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
		
	}
}
