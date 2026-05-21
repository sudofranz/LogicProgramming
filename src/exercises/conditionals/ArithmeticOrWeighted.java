package exercises.conditionals;

import java.util.Scanner;

public class ArithmeticOrWeighted {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Algorithm that reads three grades, and the user chooses if they want the arithmetic average or the weighted average");
        System.out.println("Enter three grades");
        double g = keyboard.nextDouble();
        double g2 = keyboard.nextDouble();
        double g3 = keyboard.nextDouble();
        System.out.println("If you want the arithmetic average, then enter A. If want the weighted average, then enter W. [A/W]");
    }
}