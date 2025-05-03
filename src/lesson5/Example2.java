package lesson5;

import java.util.Scanner;
import java.util.Locale;

public class Example2 {
    public static void main(String[] args) {
        // The sum of the user's numbers until he enters a number higher than 100 or enters 0
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        double S = 0;
        int n = 1;

        while (S < 100 && n != 0) {
            System.out.print("Enter number: ");
            n = in.nextInt();
            S += n;
        }

        System.out.println(S);
        in.close();
    }
}
