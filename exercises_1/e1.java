// Objective: Verify if a number entered by a user is even or odd;

import java.util.Scanner;

public class e1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer number:");

        String num = scan.nextLine();
        int remainder = Integer.parseInt(num) % 2;

        String evenOrOdd = "";

        if(remainder == 0){
            evenOrOdd = " is even.";
        }else if(remainder == 1){
            evenOrOdd = " is odd.";
        }else{ // Always reports error before this step. The reason is in parseInt(num);
            evenOrOdd = " isn't an integer number.";
        }

        System.out.println(num + evenOrOdd);
    }
}