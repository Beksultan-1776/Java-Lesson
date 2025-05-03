package lesson4;

import java.util.Scanner;
import java.util.Locale;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        double a = in.nextDouble();

        // 1. Check: Is among the numbers from -2 to 5 ?
        if (a >= -2 && a <= 5) System.out.println("a is among [-2; 5]");

        // 2. Check: Is not among the numbers from -2 to 5 ?
        if (a < -2 || a > 5) System.out.println("a is not among [-2; 5]");

        // 3. Check: Is among the numbers from -2 to 5 ? (alternative)
        if (!(a < -2 || a > 5)) System.out.println("a is among [-2; 5]");

        in.close();
    }
}
