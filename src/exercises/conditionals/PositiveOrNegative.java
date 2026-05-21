package exercises.conditionals;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads a number and checks if it's positive or negative and if it's odd or even");
        System.out.println("Enter a number");
        double n = keyboard.nextDouble();
        if (n % 2 == 0) {
            if (n >= 0) {
                System.out.println(n + " is a even and positive number");
            } else {
                System.out.println(n + " is a even and negative number");
            }
        } else {
            if (n > 0) {
                System.out.println(n + " is a odd and positive number");
            } else {
                System.out.println(n + " is a odd and negative number");
            }
        }
    }
}