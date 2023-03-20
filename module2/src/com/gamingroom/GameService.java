package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	private static long nextPlayerId = 1;	// variable to give a unique player id no matter what instance it is in
	private static long nextTeamId = 1;					// variable to give a unique team id no matter what instance it is in
	
	// getter for nextPlayerId
	public static long getNextPlayerId() {
		return nextPlayerId++;
	}
	// getter for nextTeamId
	public static long getNextTeamId() {
		return nextTeamId++;
	}
	
	// FIXME: Add missing pieces to turn this class a singleton 
	/*
	 * create a variable for an instance of GameService
	 * the simgleton pattern ensures that only one instance of the object can exist at a time
	 */
	private static GameService instance = new GameService();

	/*
	 * make the constructor private so that this class cannot be instantiated
	 */
	private GameService(){}
	   
	/*
	 * Get the only object available
	 */
	public static GameService getInstance(){
	   return instance;
	}
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		Iterator<Game> myIterator = games.iterator();	// create an iterator for the games arraylist
		while (myIterator.hasNext()) {	// while games has a next element
			Game nextGame = myIterator.next();	// nextGame is set to the next game in games
        	if (nextGame.getName() == name) {	// if the game name is the same as the parameter return that instance of game so a new one is not created
        		game = nextGame;
        		return game;
        	}
        }
        
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	/*Game getGame(int index) {
		return games.get(index);
	}*/
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	
	
	
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		// the iterator design pattern is made to provide navigation without exposing the structure of an object
		
		// instantiate iterator
		Iterator<Game> myIterator = games.iterator();	// create an iterator for the games arraylist
		while (myIterator.hasNext()) {	// while games has a next element
			Game nextGame = myIterator.next();	// nextGame is set to the next game in games
			if (nextGame.getId() == id) {	// if the game id is the same as the parameter return that instance of game
        		System.out.println(nextGame.getId());
				game = nextGame;
        		return game;
        	}
        }
			
			
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
		Iterator<Game> myIterator = games.iterator();	// create an iterator for the games arraylist
		while (myIterator.hasNext()) {	// while games has a next element
			Game nextGame = myIterator.next();	// nextGame is set to the next game in games
        	if (nextGame.getName() == name) {	// if the game name is the same as the parameter return that instance of game 
        		game = nextGame;
        		return game;
        	}
        }
		
		
		return game;
	}
	public void printAllGames() {	// this is for printing all games in the service for testing
		Iterator<Game> myIterator = games.iterator();	// create an iterator for the games arraylist
		while (myIterator.hasNext()) {	// while games has a next element
			Game nextGame = myIterator.next();	// nextGame is set to the next game in games
			System.out.println(nextGame);		// print the game
			nextGame.printAllTeams();			// call to function to print teams in the game
		}
	}

	private char[] printAllTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
