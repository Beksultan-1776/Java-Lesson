package lesson4;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // Absolute value program
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int userNumber = in.nextInt();
        if (userNumber < 0) userNumber *= (-1);

        System.out.println(userNumber);
        in.close();
    }
}
