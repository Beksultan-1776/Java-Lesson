package lesson5;

import java.util.Scanner;
import java.util.Locale;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        double S = 0;
        int n = 1;

        while (n <= 1000) {
            S += 1.0 / n;
            n++;
        }

        System.out.println(S);
        in.close();
    }
}
