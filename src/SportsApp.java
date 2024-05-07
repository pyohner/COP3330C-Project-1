/*
Phillip Yohner
COP 3330C - CRN 24680
January 13, 2024

The purpose of this program - Sports App - is to create soccer and basketball players and record details of each.
Soccer players will have a name, a number for their jersey, a position, and number of fouls committed.
 - The player's name, number, position, and fouls committed can be set upon creation or left empty.
 - Once created, the player's name, number, position, and number of fouls can be edited.
 - When a player commits a foul, their foul count increments and a message is output.
Basketball players will have a name, the number of points scored, and a free throw conversion rate.
 - The player's name, number of points scored, and free throw conversion rate can be upon creation or left empty.
 - Once created, the player's name, number of points scored, and free throw conversion rate can be edited.
 - A player can score a free throw, two points, or three points to add to their number of points scored.
 - When a player scores, a message confirms the number of points scored.
*/

import java.util.Scanner;

// Class: SportsApp (main class)
// Instantiates/Creates a soccer player and basketball player.
//  - Details of each player are printed, updated, and printed again.
public class SportsApp {
    public static void main(String[] args){

        // Create soccer and basketball players
        SoccerPlayer mauricio = new SoccerPlayer("Mauricio",10, "Attacking Central Midfielder", 1);
        BasketballPlayer cole = new BasketballPlayer("Cole", 30, 0.8);

        // Print player details
        mauricio.printDetails();
        cole.printDetails();

        // Soccer player commits foul
        mauricio.foulCommitted();
        // Basketball player scores a free throw, two pointer, and three pointer
        cole.scoreFreeThrow();
        cole.scoreTwo();
        cole.scoreThree();

        // Print player details
        mauricio.printDetails();
        cole.printDetails();

    }
}
