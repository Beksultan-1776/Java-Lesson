package lesson4;

import java.util.Scanner;
import java.util.Locale;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        float x;
        System.out.print("Enter number: "); x = in.nextFloat();

        if (x < 0) System.out.println("Number is negative");
        else System.out.println("Number is non-negative number");

        in.close();
    }
}
