package exercises.basics;

import java.util.Scanner;

public class Celsiustofahrenheit {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that converts temperatures");
        System.out.println("Enter a temperature in Celsius");
        double celsius = keyboard.nextDouble();
        double fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("The conversion to Fahrenheit is " + fahrenheit);
    }
}
