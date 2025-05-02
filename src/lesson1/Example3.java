package lesson1;

/* Example 3. Primitive data types */

public class Example3 {
    public static void main(String[] args) {
        // Integer data types ------------------------------------------------------------------------------------------

        // A variable with the byte data type can store numbers from -128 to 127. Occupies 1 byte of memory.
        byte negativeByteNumber = -128;
        System.out.println("Value of negativeByteNumber variable: " + negativeByteNumber);

        byte byteNumber = 127;
        System.out.println("Value of byteNumber variable: " + byteNumber);

        // A variable with the short data type can store numbers from -32,768 to 32,767. Occupies 2 bytes of memory.
        short negativeShortNumber = -32_768;
        System.out.println("Value of negativeShortNumber variable: " + negativeShortNumber);

        short shortNumber = 32_767;
        System.out.println("Value of shortNumber variable: " + shortNumber);

        // A variable with the int data type can store numbers from -2^32 to 2^32-1. Occupies 4 bytes of memory.
        // Int is the default type for integers in Java.
        int negativeIntNumber = -2_147_483_648;
        System.out.println("Value of negativeIntNumber variable: " + negativeIntNumber);

        int intNumber = 2_147_483_647;
        System.out.println("Value of intNumber variable: " + intNumber);

        // A variable with the long data type can store numbers from -2^64 to 2^64-1. Occupies 8 bytes of memory.
        // At the end of a long-type number, you need to write the suffix L.
        long negativeLongNumber = -9_223_372_036_854_775_808L;
        System.out.println("Value of negativeLongNumber variable: " + negativeLongNumber);

        long longNumber = -9_223_372_036_854_775_808L;
        System.out.println("Value of longNumber variable: " + longNumber);

        // Float data types --------------------------------------------------------------------------------------------
        /*
            A variable with the byte data type can store numbers from -3,4 * 10^38 to 3,4 * 10^38. Occupies 4 bytes of
            memory. At the end of a float-type number, you need to write the suffix F.
        */
        float negativeFloatNumber = -1.304F;
        System.out.println("Value of negativeFloatNumber variable: " + negativeFloatNumber);

        float floatNumber = 3.412F;
        System.out.println("Value of floatNumber variable: " + floatNumber);

        /*
            A variable with the byte data type can store numbers from +-4,9 * 10^-324 to +-1,8 * 10^308. Occupies 8
            bytes of memory. Double is the default type for floats in Java.
        */
        double negativeDoubleNumber = -23.4123;
        System.out.println("Value of negativeDoubleNumber variable: " + negativeDoubleNumber);

        double doubleNumber = -23.4123;
        System.out.println("Value of doubleNumber variable: " + doubleNumber);

        // Char data types ---------------------------------------------------------------------------------------------
        /*
            Char can save one symbol in UTF-16 code, and can save numbers from 0 to 65_535. Occupies 2 bytes of memory.
            All characters in char must be stored in single quotes.
        */
        char letter = 'A';
        System.out.println("Value of letter variable: " + letter);

        char letterCode = 65;   // Numbers in char this is letter code in UTF-16
        System.out.println("Value of letterCode variable: " + letterCode);

        // Boolean data types ------------------------------------------------------------------------------------------
        /*
            Boolean can save only two values, this is true or false and no more. Occupies memory space depending on the
            language specification.
        */
        boolean userIsActive = true, userIsMarried = false;;
        System.out.println("Value of letter userIsActive: " + userIsActive);
        System.out.println("Value of letter userIsMarried: " + userIsMarried);

        /* ------------------------------------------------------------------------------------------------------------*
            A programmer should strive to make the program weigh less and work faster. That's why there are different
            data types in Java.
        *------------------------------------------------------------------------------------------------------------ */
    }
}
