// Objective: Converting temperature from Celsius to Fahrenheit (formule: F = C * 9/5 + 32);

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class e2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a temperature in degrees Celsius:");

        String input = scan.nextLine();
        float celsius = Float.parseFloat(input.replace(',', '.'));
        float fahrenheit = celsius * 9 / 5 + 32;

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("#.##", symbols);
        String result = df.format(fahrenheit);

        System.out.println(input + "°C is equal " + result + "°F.");
    }
}