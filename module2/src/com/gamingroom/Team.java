package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{	// Team extends Entity class
	private List<Player> players = new ArrayList<Player>();	// arraylist of players for each instance of teams
	

	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);	// passes constructor to Entity constructor
	}

	public Player addPlayer(String name) {

		// a local game instance
		Player player = null;

		Iterator<Player> myIterator = players.iterator();	// create an iterator for the players arraylist
		while (myIterator.hasNext()) {	// while players has a next element
			Player nextPlayer = myIterator.next();	// nextPlayer is set to the next player in players
        	if (nextPlayer.getName() == name) {	// if the player name is the same as the parameter return that instance of player so a new one is not created
        		player = nextPlayer;
        		return player;
        	}
        }
        
		// if not found, make a new player instance and add to list of players
		if (player == null) {
			long temp = GameService.getNextPlayerId();
			player = new Player(temp, name);
			players.add(player);
		}

		// return the new/existing player instance to the caller
		return player;
	}
	public void printAllPlayers() {	// prints all players on team for testing purposes
		Iterator<Player> myIterator = players.iterator();	// create an iterator for the players arraylist
		while (myIterator.hasNext()) {	// while players has a next element
			Player nextPlayer = myIterator.next();	// nextPlayer is set to the next player in players
			System.out.println("\t\t" + nextPlayer);	// print player
		}
	}

	@Override
	public String toString() {
		return "Team [id=" + this.getId() + ", name=" + this.getName() + "]";	// print to terminal
	}
}
