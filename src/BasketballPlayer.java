// Class: BasketballPlayer
// This class represents a basketball player.  The basket player scores points and has a free throw conversion rate.
public class BasketballPlayer {
    // Attributes
    private String basketballPlayerName; // Basketball player's name
    private int pointsScored; // Basketball player's points scored
    private double freeThrowConversion; // Basketball player's free throw conversion rate

    // Constructor
    public BasketballPlayer(String basketballPlayerName, int pointsScored, double freeThrowConversion){
        this.basketballPlayerName = basketballPlayerName;
        this.pointsScored = pointsScored;
        this.freeThrowConversion = freeThrowConversion;
    }

    // Overload Constructor
    // Sets player attributes to null and zero.
    public BasketballPlayer(){
        this.basketballPlayerName = null;
        this.pointsScored = 0;
        this.freeThrowConversion = 0.0;
    }

    // Getters and Setters
    public String getBasketballPlayerName() {
        return basketballPlayerName;
    }
    public void setBasketballPlayerName(String basketballPlayerName) {
        this.basketballPlayerName = basketballPlayerName;
    }
    public int getPointsScored() {
        return pointsScored;
    }
    public void setPointsScored(int pointsScored) {
        this.pointsScored = pointsScored;
    }
    public double getFreeThrowConversion() {
        return freeThrowConversion;
    }
    public void setFreeThrowConversion(double freeThrowConversion) {
        this.freeThrowConversion = freeThrowConversion;
    }

    // Custom Methods
    // Adds one point to player's points scored and prints message.
    public void scoreFreeThrow(){
        this.pointsScored++;
        System.out.println(this.basketballPlayerName + " made a free throw.");
    }
    // Adds two points to player's points scored and prints message.
    public void scoreTwo(){
        this.pointsScored = this.pointsScored + 2;
        System.out.println(this.basketballPlayerName + " scored 2 points.");
    }
    // Adds three points to player's points scored and prints message.
    public void scoreThree(){
        this.pointsScored = this.pointsScored + 3;
        System.out.println(this.basketballPlayerName + " scored 3 points.");
    }

    // Print Details
    // Prints player's name, points scored, and free throw conversion rate.
    public void printDetails(){
        System.out.println("Basketball Player: " + basketballPlayerName + " has scored "+ pointsScored +" points and has a "+ freeThrowConversion +" free throw conversion rate.");
    }
}
