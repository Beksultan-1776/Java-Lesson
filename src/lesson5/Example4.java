package lesson5;

import java.util.Locale;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        double S = 0;
        for (int n = 1; n <= 1000; n++) S += 1.0 / n;

        System.out.println(S);
        in.close();
    }
}
