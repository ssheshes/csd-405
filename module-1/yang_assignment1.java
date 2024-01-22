
/*Alexis Yang
*CSD405 Assignment 1
*14 January 2024*/
import java.util.*;

public class yang_assignment1 {

    private static final int FAST = 3;
    private static final int MEDIUM = 2;
    private static final int SLOW = 1;

    public static void main(String[] args) {

        // create collection of fan instances
        Fan myFans[] = new Fan[4];
        Fan randomFans[] = new Fan[5];

        // create fan instance
        Fan defaultFan = new Fan();
        Fan secondFan = new Fan(MEDIUM, 6, true, "black");

        // initializing elements
        myFans[0] = new Fan(SLOW, 12, true, "pink");
        myFans[1] = new Fan(MEDIUM, 5, true, "yellow");
        myFans[2] = new Fan(FAST, 4, true, "gray");
        myFans[3] = new Fan(MEDIUM, 9, true, "black");

        // print fans using toString
        System.out.println("[Default Fan]\n" + defaultFan.toString());
        System.out.println();
        System.out.println("[Second Fan]\n" + secondFan.toString());
        System.out.println();

        // print collection of fan using for loop
        System.out.println("==PRINT FAN COLLECTION USING FOR LOOP==");
        for (int i = 0; i < myFans.length; i++)
            System.out.println("[Fan " + (i + 1) + "]\n" + myFans[i] + "\n");

        // print single instance of array
        System.out.println("==PRINT SINGLE INSTANCE OF ARRAY==");
        System.out.println("[Fan 2]");
        System.out.println(myFans[1]);
        System.out.println();

        // prints collection of random fans
        System.out.println("==PRINT COLLECTION OF RANDOM FANS==");
        Random power = new Random();

        // code creates collection of fans and displays collection
        for (int i = 0; i < randomFans.length; ++i) {

            String[] colors = { "white", "red", "blue", "black", "gray", "yellow", "pink", "orange",
                    "purple" };
            Random randomColor = new Random();
            int numberOfAnswers = colors.length;
            int pick = randomColor.nextInt(numberOfAnswers);
            String fanColor = colors[pick];
            randomFans[i] = new Fan((int) (Math.random() * 4), (int) (Math.random() * (20) + 1), power.nextBoolean(),
                    fanColor);
            System.out.println("[Fan " + (i + 1) + "]\n" + randomFans[i] + "\n");

        }

    }
}

class Fan {

    // constants
    int STOPPED = 0;
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;

    // setters
    int speed;
    int radius;
    boolean powerOn;
    String color;

    // constructor for instances with arguments
    public Fan(int speed, int radius, boolean powerOn, String color) {
        this.speed = speed;
        this.radius = radius;
        this.powerOn = powerOn;
        this.color = color;
    }

    // constructor for default instance
    public Fan() {
        speed = STOPPED;
        radius = 6;
        powerOn = false;
        color = "white";
    }

    // overwritten toString method
    public String toString() {
        return "\tColor: " + color + "\n\tRadius: " + radius
                + "\n\tPower on? " + powerOn + "\n\tSpeed: " + speed;
    }

    // public getters
    public int getSpeed() {
        return this.speed;
    }

    public int getRadius() {
        return this.radius;
    }

    public boolean getPowerOn() {
        return this.powerOn;
    }

    public String getColor() {
        return this.color;
    }

}
