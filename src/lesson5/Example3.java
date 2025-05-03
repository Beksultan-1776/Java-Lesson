package lesson5;

import java.util.Scanner;
import java.util.Locale;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        double S = 0;
        int i = 1;
        while ((S += ++i) < 50);

        System.out.println(S);
        in.close();
    }
}
