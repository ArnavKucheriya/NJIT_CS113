import java.util.*;

public class Paint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        int doorHeight = 0, doorWidth = 0, windowHeight = 0, windowWidth = 0;

        // Taking input from the user to determine the area of the room to be covered in paint.
        System.out.print("Enter the lenght of the room: ");
        int length = input.nextInt();
        System.out.print("Enter the width of the room: ");
        int width = input.nextInt();
        System.out.print("Enter the height of the room: ");
        int height = input.nextInt();

        // Taking the input from the user to determine the area of the room to be excluded (Doors).
        System.out.print("Enter the number of doors in the room: ");
        int doors = input.nextInt();
        if (doors > 0) {
            System.out.print("Enter the height of the doors: ");
            doorHeight = input.nextInt();
            System.out.print("Enter the width of the Doors: ");
            doorWidth = input.nextInt();
        }

        // Taking the input from the user to determine the area of the room to be excluded (Windows).
        System.out.print("Enter the number of windows in the room: ");
        int windows = input.nextInt();
        if (windows > 0) {
            System.out.print("Enter the height of the Window: ");
            windowHeight = input.nextInt();
            System.out.print("Enter the width of the Window: ");
            windowWidth = input.nextInt();
        }

        // Computing the area of exclusion from the room (Doors and Windows).
        double doorSqFt = doors * (doorWidth * doorHeight);
        double windowSqFt = windows * (windowHeight * windowWidth);

        //System.out.println(doorSqFt + "\s" + windowSqFt);

        // Calculating the total area of the room to be covered.
        double totalSqFt = (2 * (length * height)) + (2 * (width * height)) - (doorSqFt + windowSqFt);
        // Calculating the gallons of paint required to cover the room.
        double paintNeeded = totalSqFt / COVERAGE;

        System.out.println();
        System.out.println("The total SqFt: " + totalSqFt +
                "\nThe amount of paint needed is: " + paintNeeded + " gal" +
                "\nThe length of the room is: " + length +
                "\nThe width of the room is " + width +
                "\nThe height of the room is: " + height +
                "\nNumber of Doors: " + doors +
                "\nNumber of Windows: " + windows);
    }
}
