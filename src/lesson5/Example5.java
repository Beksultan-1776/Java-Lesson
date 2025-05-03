package lesson5;

import java.util.Locale;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        // f(x) = kx + b; x = 0; 0.1; 0.2; ... 1
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        double f, k, b;
        System.out.print("Enter number for k "); k = in.nextDouble();
        System.out.print("Enter number for b "); b = in.nextDouble();

        for (double x = 0; x <= 1; x += 0.1) {
            f = k * x + b;
            System.out.print(f + "\n");
        }

        in.close();
    }
}
