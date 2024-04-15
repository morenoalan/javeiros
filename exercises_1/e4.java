// Objective: Calculating and print the arithmetic mean of three numbers entered by the user;

import java.util.Scanner;

public class e4 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first of three numbers:");
        float first = Float.parseFloat(scan.nextLine());
        System.out.println("Enter the second of three numbers:");
        float second = Float.parseFloat(scan.nextLine());
        System.out.println("Enter the third of three numbers:");
        float third = Float.parseFloat(scan.nextLine());

        float mean = (first + second + third) / 3;

        System.out.println("The arithmetic mean of " + first + " plus " + second + " plus " + third + " is equal " + mean + ".");
    }
}