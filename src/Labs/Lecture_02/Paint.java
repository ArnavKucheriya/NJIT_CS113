package Labs.Lecture_02;
// Arnav Kucheriya - CS 113 - Spring 2024 - NJIT

import java.util.*;
public class Paint {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        int doorHeight=0, doorWidth = 0, windowHeight=0, windowWidth=0;

        System.out.print("Enter the lenght of the room: ");
        int length = input.nextInt();
        System.out.print("Enter the width of the room: ");
        int width = input.nextInt();
        System.out.print("Enter the height of the room: ");
        int height = input.nextInt();

        System.out.print("Enter the number of doors in the room: ");
        int doors = input.nextInt();
        if (doors>0) {
            System.out.print("Enter the height and width of the doors: ");
            doorHeight = input.nextInt();
            doorWidth = input.nextInt();
        }

        System.out.print("Enter the number of windows in the room: ");
        int windows = input.nextInt();
        if(windows>0){
            System.out.print("Enter the height and width of the window: ");
            windowHeight = input.nextInt();
            windowWidth = input.nextInt();
        }

        /*
        // 2 (length * height) + 2 (width * height)

        int length = 10;
        int width = 20;
        int height = 15;
         */

        double doorSqFt = doors*(doorWidth*doorHeight);
        double windowSqFt = windows*(windowHeight*windowWidth);

        //System.out.println(doorSqFt + "\s" + windowSqFt);

        double totalSqFt = (2*(length * height))+(2*(width * height))-(doorSqFt+windowSqFt);
        double paintNeeded = totalSqFt / COVERAGE;

        System.out.println();
        System.out.println("The amount of paint needed is: "+paintNeeded+" gal"+
                "\nThe length of the room is: "+length+
                "\nThe width of the room is "+width+
                "\nThe height of the room is: "+height);
    }
}
