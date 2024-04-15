// Objective: calculate and print the area of a circle basead in radius entered by the user (formule: area = π * radius * radius);

import java.util.Scanner;

public class e5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a radius to get a area of a circle:");

        float radius = Float.parseFloat(scan.nextLine());

        double area = Math.PI * radius * radius;

        System.out.println("The area of a circle whose radius is " + radius + " is equal to " + area + ".");
    }
}