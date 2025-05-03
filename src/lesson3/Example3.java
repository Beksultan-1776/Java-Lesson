package lesson3;

public class Example3 {
    public static void main(String[] args) {
        int number = 20;

        number += 20;   // <- Short syntax: number = number + 20;
        System.out.println(number);

        number -= 10;   // <- Short syntax: number = number - 10;
        System.out.println(number);

        number *= 4;    // <- Short syntax: number = number * 4;
        System.out.println(number);

        number /= 10;   // <- Short syntax: number = number / 10;
        System.out.println(number);

        number %= 5;
        System.out.println(number); // <- Short syntax: number = number % 5;
    }
}
