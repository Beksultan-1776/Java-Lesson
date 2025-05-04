package lesson4;

import java.util.Locale;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        int userNumber = in.nextInt();
        boolean result = (userNumber <= 30) ? true : false;
        System.out.println(result);

        in.close();
    }
}
