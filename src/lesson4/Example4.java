package lesson4;

import java.util.Scanner;
import java.util.Locale;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        short item = -1;
        System.out.print("Program menu:\n1 - Area of a triangle\n2 - Area of a rectangle\n");
        item = in.nextShort();

        double height, length, S = 0;
        if (item == 1) {
            System.out.print("Enter the height and base of the triangle: ");
            height = in.nextDouble();
            length = in.nextDouble();
            S = 0.5 * height * length;
            System.out.println("Area of a triangle: " + S);
        } else if (item == 2) {
            System.out.print("Enter the height and base of the rectangle: ");
            height = in.nextDouble();
            length = in.nextDouble();
            S = height * length;
            System.out.println("Area of a rectangle: " + S);
        }

        in.close();
    }
}
