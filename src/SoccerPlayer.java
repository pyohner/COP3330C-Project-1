// Class: SoccerPlayer
// This class represents a soccer player.  The soccer player has a number, position, and can commit a foul.
public class SoccerPlayer {
    // Attributes
    private String soccerPlayerName; // Soccer player's name
    private int soccerPlayerNumber; // Soccer player's jersey number
    private String soccerPlayerPosition; // Soccer player's position
    private int foulCount; // Soccer player's number of fouls

    // Constructor
    public SoccerPlayer(String soccerPlayerName, int soccerPlayerNumber, String soccerPlayerPosition, int foulCount) {
        this.soccerPlayerName = soccerPlayerName;
        this.soccerPlayerNumber = soccerPlayerNumber;
        this.soccerPlayerPosition = soccerPlayerPosition;
        this.foulCount = foulCount;
    }

    // Overload Constructor
    // Sets player attributes to null and zero.
    public SoccerPlayer() {
        this.soccerPlayerName = null;
        this.soccerPlayerNumber = 0;
        this.soccerPlayerPosition = null;
        this.foulCount = 0;
    }

    // Getters and Setters
    public String getSoccerPlayerName() {
        return soccerPlayerName;
    }
    public void setSoccerPlayerName(String soccerPlayerName) {
        this.soccerPlayerName = soccerPlayerName;
    }
    public int getSoccerPlayerNumber() {
        return soccerPlayerNumber;
    }
    public void setSoccerPlayerNumber(int soccerPlayerNumber) {
        this.soccerPlayerNumber = soccerPlayerNumber;
    }
    public String getSoccerPlayerPosition() {
        return soccerPlayerPosition;
    }
    public void setSoccerPlayerPosition(String soccerPlayerPosition) {
        this.soccerPlayerPosition = soccerPlayerPosition;
    }
    public int getFoulCount() {
        return foulCount;
    }
    public void setFoulCount(int foulCount) {
        this.foulCount = foulCount;
    }

    // Custom Method: Adds a foul committed and prints a message.
    public void foulCommitted () {
        this.foulCount++;
        System.out.println(soccerPlayerName + " committed a foul.");
    }

    // Print Details
    // Prints player's name, number, position, and fouls committed.
    public void printDetails(){
        System.out.println("Soccer Player: " + soccerPlayerName + " ("+ soccerPlayerNumber +", "+ soccerPlayerPosition +") has committed " + foulCount + " fouls.");
    }
}