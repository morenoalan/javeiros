/* Objective:
    Receiving an array of integer numbers and a target value;
    The program must return the indexes of two numbers in array that together result in the target value;
    If such a pair of numbers doesn't exist, the program must return null;
*/

import java.util.Scanner;

public class e6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a list of integer numbers separated by space:");
        String input = scan.nextLine();

        String[] parts = input.split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++){
            numbers[i] = Integer.parseInt(parts[i].trim());
        }

        /*
        System.out.print("Your list of numbers is: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        */

        System.out.println("Enter a target number:");
        int target = Integer.parseInt(scan.nextLine());

        String status = null;

        int firstSummand = 0;
        int secondSummand = 0;
        int firstSummandIndex = 0;
        int secondSummandIndex = 0;

        outerLoop:
        for (int j = 0; j < numbers.length; j++){
           firstSummand = numbers[j];
           firstSummandIndex = j + 1;
           for (int k = 0; k < numbers.length; k++){
               secondSummand = numbers[k];
               secondSummandIndex = k + 1;
               if(firstSummand + secondSummand == target) {
                   System.out.println("The number " + target + " can be the sum of " + firstSummand + " and " + secondSummand + " whose order in the list are the positions " + firstSummandIndex + " and " + secondSummandIndex + " respectively.");
                   status = "not null";
                   break outerLoop;
               }
           }
        }

        if(status == null){
            System.out.println("No answer found.");
        }

    }
}