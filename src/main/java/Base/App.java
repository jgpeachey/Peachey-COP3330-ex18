/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Peachey
 */

package Base;

/*
Create a program that converts temperatures from Fahrenheit to Celsius or
from Celsius to Fahrenheit. Prompt for the starting temperature. The program
should prompt for the type of conversion and then perform the conversion.

The formulas are:
C = (F − 32) × 5 / 9
        and
F = (C × 9 / 5) + 32

Example Output:
Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints:
Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.

Challenges:
*Revise the program to ensure that inputs are entered as numeric values.
Don’t allow the user to proceed if the value entered is not numeric.
*Break the program into functions that perform the computations.
*Implement this program as a GUI program that automatically updates the
values when any value changes.
*Modify the program so it also supports the Kelvin scale.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 1;
        double temp = 0;

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        String conv = in.nextLine();

        while (i == 1){
            System.out.println("Your choice: "+conv.toUpperCase());
            if(conv.equalsIgnoreCase("C")){
                System.out.println("Please enter the temperature in Fahrenheit: ");
                temp = in.nextDouble();

                double c = Math.round(((temp-32.0)*(5.0/9.0))*100.0)/100.0;

                System.out.println("The temperature in Celsius is "+c);

                i = 0;
            }
            else if(conv.equalsIgnoreCase("F")){
                System.out.println("Please enter the temperature in Celsius: ");
                temp = in.nextDouble();

                double f = Math.round((temp*(9.0/5.0)+32)*100.0)/100.0;

                System.out.println("The temperature in Fahrenheit is "+f);

                i = 0;
            }
            else{
                System.out.println("Please enter C or F.");
                conv = in.nextLine();
            }
        }
    }
}
