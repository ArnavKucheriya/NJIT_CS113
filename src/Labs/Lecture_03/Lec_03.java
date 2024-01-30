package Labs.Lecture_03;
import java.sql.SQLOutput;
import java.util.*;
public class Lec_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the miles driven by the car: ");
        double miles = input.nextDouble();
        System.out.print("Enter the gallons of fuel in the car: ");
        double gallons = input.nextDouble();

        double mpg = (miles/gallons);
        System.out.println("The Miles per Gallon (MPG) is: "+mpg);
    }
}
