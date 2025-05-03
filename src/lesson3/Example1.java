package lesson3;

public class Example1 {
    public static void main(String[] args) {
        /*-------------------------------------------------------------------------------------------------------------*
            Arithmetic operations
            Addition                +   priority: 1
            Subtraction             -   priority: 1
            Multiplication          *   priority: 3
            Division                /   priority: 3
            Remainder               %   priority: 2
            Increment (+ 1)         ++  priority: 4
            Decrement (- 1)         --  priority: 4

            Increment and Decrement works only with variables !
        *-------------------------------------------------------------------------------------------------------------*/

        byte number = 2;
        System.out.println(number + 2 - 10);

        int x = 10, y = 400;
        int sum = x + y;
        System.out.println(sum);

        number = (byte) (x + y);
        System.out.println(number);

        final double PI = 3.141592;
        int result = (int) (PI * 2);
        System.out.println(result);

        System.out.println(10 % 3);

        byte incVar = 0;
        incVar++;
        System.out.println(incVar);

        byte decVar = 3;
        decVar--;
        System.out.println(decVar);
    }
}
