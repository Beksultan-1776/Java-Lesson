package lesson3;

import java.util.Scanner;
import java.util.Locale;

public class Example2 {
    public static void main(String[] args) {
        // Rectangle calculate
        double length, width;
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("length = "); length = in.nextDouble();
        System.out.print("width = "); width = in.nextDouble();

        double p = 2 * (length + width);
        System.out.println("Perimeter rectangle = " + p);
        in.close();
    }
}
