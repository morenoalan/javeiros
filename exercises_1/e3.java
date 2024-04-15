// Objective: Checking whether a positive integer number is a prime number.

import java.util.Scanner;

public class e3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer number to check if it is prime:");

        int num = Integer.parseInt(scan.nextLine());

        String isPrimeOrNot = "";

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrimeOrNot = " isn't a prime number.";
                break;
            }else{
                isPrimeOrNot = " is a prime number.";
            }
        }

        System.out.println(num + isPrimeOrNot);
    }
}