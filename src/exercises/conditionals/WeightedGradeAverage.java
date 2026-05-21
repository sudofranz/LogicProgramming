package exercises.conditionals;

import java.util.Scanner;

public class WeightedGradeAverage {

    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that calculates a student's weighted average");
        System.out.println("Enter 3 grades");
        double lowest = keyboard.nextDouble();
        double middle = keyboard.nextDouble();
        double highest = keyboard.nextDouble();
        double aux = 0;
        if (middle < lowest) {
            aux = lowest;
            lowest = middle;
            middle = aux;
        }
        if (highest < lowest) {
            aux = lowest;
            lowest = highest;
            highest = aux;
        }
        if (middle > highest) {
            aux = highest;
            highest = middle;
            middle = aux;
        }
        double weightedG1 = lowest * 3;
        double weightedG2 = middle * 3;
        double weightedHG = highest * 4;
        double total = weightedG1 + weightedG2 + weightedHG;
        double weightedAverage = total / 10;
        if (weightedAverage >= 5) {
            System.out.println("Your weighted average is " + weightedAverage + ", you passed!");
        } else {
            System.out.println("Your weighted average is " + weightedAverage + ", you failed!");
        }
    }
}
