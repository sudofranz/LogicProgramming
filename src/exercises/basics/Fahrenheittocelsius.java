package exercises.basics;

import java.util.Scanner;

public class Fahrenheittocelsius {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that converts temperatures");
        System.out.println("Enter a temperature in Fahrenheit");
        double fahrenheit = keyboard.nextDouble();
        double celsius = (fahrenheit - 32) *  5 / 9;
        System.out.println("The conversion to Celsius is " + celsius);
    }
}
