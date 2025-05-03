package lesson4;

import java.util.Scanner;
import java.util.Locale;

public class Example7 {
    public static void main(String[] args) {
        // Menu program (extension version) with switch case statement
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        byte item;
        System.out.print("1 - Rectangle area\n2 - Triangle area\n3 - Circle area\n0 - Exit form program\n");
        System.out.print("Enter a number to start the program: "); item = in.nextByte();

        switch (item) {
            case 1:
                System.out.println("The area of the rectangle is selected");
                break;
            case 2:
                System.out.println("The area of the triangle is selected");
                break;
            case 3:
                System.out.println("The area of the circle is selected");
                break;
            case 0: 
                System.out.println("Exit from program");
                break;
            default:
                System.out.println("Error");
        }


        in.close();
    }
}
