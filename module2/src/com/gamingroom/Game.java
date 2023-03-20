package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity{	// Game extends the Entity class
	private List<Team> teams = new ArrayList<Team>();	// arraylist of teams for each instance of Game

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);	// passes the constructor to the constructor for Entity
	}

	
	public Team addTeam(String name) {

		// a local team instance
		Team team = null;

		Iterator<Team> myIterator = teams.iterator();	// create an iterator for the teams arraylist
		while (myIterator.hasNext()) {	// while teams has a next element
			Team nextTeam = myIterator.next();	// nextTeam is set to the next team in teams
        	if (nextTeam.getName() == name) {	// if the team name is the same as the parameter return that instance of team so a new one is not created
        		team = nextTeam;
        		return team;
        	}
        }
        
		// if not found, make a new team instance and add to list of teams
		if (team == null) {
			long temp = GameService.getNextTeamId();
			team = new Team(temp, name);
			teams.add(team);
		}

		// return the new/existing team instance to the caller
		return team;
	}
	public void printAllTeams() {	// this is to print all teams in the game for testing purposes
		Iterator<Team> myIterator = teams.iterator();	// create an iterator for the teams arraylist
		while (myIterator.hasNext()) {	// while teams has a next element
			Team nextTeam = myIterator.next();	// nextTeam is set to the next team in teams
			System.out.println("\t" + nextTeam);	// print the team
			nextTeam.printAllPlayers();				// call to function to print players on team
		}
	}

	@Override
	public String toString() {
		
		return "Game [id=" + this.getId() + ", name=" + this.getName() + "]";	// print to console
	}

}
