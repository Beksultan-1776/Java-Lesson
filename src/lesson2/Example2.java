package lesson2;

// Example 2. Input

import java.util.Scanner;   // Import Scanner package
import java.util.Locale;    // Import Locale package

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        /* ------------------------------------------------------------------------------------------------------------*
            Reading methods from user keyboard
            next() - Reads the input string up to the first space.
            nextLine() - Reads the input string until the line feed.
            nextByte() - Reads the entered number as a byte
            nextShort() - Reads the entered number as a short
            nextInt() - Reads the entered number as a int
            nextLong() - Reads the entered number as a long
            nextDouble() - Reads the entered number as a double
            nextFloat() - Reads the entered number as a float
            nextBoolean() - Reads the entered number as a boolean
        *------------------------------------------------------------------------------------------------------------ */

        System.out.print("Enter your name: ");
        String userName = in.nextLine();

        System.out.println("Enter your age: ");
        byte userAge = in.nextByte();

        System.out.println("Enter your height: ");
        float userHeight = in.nextFloat();

        System.out.printf("Your name is: %s\nYour age: %d\nYour height: %.2f\n", userName, userAge, userHeight);
        System.out.print("Is correct ? (if yes enter \"true\", if not enter \"false\"): ");
        boolean userChoice = in.nextBoolean();
        in.close();
    }
}
