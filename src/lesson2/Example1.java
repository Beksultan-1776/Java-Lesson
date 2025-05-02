package lesson2;

// Example 1. Output

public class Example1 {
    public static void main(String[] args) {
        // print() - Outputs data without breaking to the next line.
        System.out.print("Message for users:");
        System.out.print(" Hello everyone!\n"); // \n - symbol for breaking to the next line.

        // println() - Outputs data with breaking to the next line.
        System.out.println("Hello");
        System.out.println("World!");

        // printf() - formatted data output.
        /* ------------------------------------------------------------------------------------------------------------*
            Specifier:
            %d - for int numbers.
            %f - for float numbers.
            %nf - n only shows a certain number of numbers.
            %c - for a single character of type char
            %s - for string
            %% - percent output
        *------------------------------------------------------------------------------------------------------------ */

        short number = 20;
        System.out.printf("Value of number variable is: %d\n", number);

        byte byNumber = 13;
        short shNumber = -34;
        int iNumber = 200;
        long lnNumber = 234;
        System.out.printf("byNumber = %d\nshNumber = %d\niNumber = %d\nlnNumber = %d\n", byNumber, shNumber, iNumber, lnNumber);

        float flNumber = -1.50F;
        double dNumber = 32.433432;
        System.out.printf("flNumber = %f\ndNumber = %.2f\n", flNumber, dNumber);
    }
}
