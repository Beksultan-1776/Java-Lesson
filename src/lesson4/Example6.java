package lesson4;

import java.util.Scanner;
import java.util.Locale;

public class Example6 {
    public static void main(String[] args) {
        /*-----------------------------------------------------------------------------------------*
            Logical operators priority
            Logical not      !  priority: 1
            Logical or       || priority: 2
            Logical and      && priority: 3

            The expression in parentheses () is evaluated first.
        *-----------------------------------------------------------------------------------------*/
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        boolean userChoice = in.nextBoolean();

        System.out.println(!userChoice || true && !(userChoice == true));
        System.out.println(userChoice || true && !(userChoice == true));

        in.close();
    }
}
