package lesson1;

/* Example 5. Type casting */

public class Example5 {
    public static void main(String[] args) {
        /* ------------------------------------------------------------------------------------------------------------*
            Implicit Casting:
            short is automatically converted to int — this is safe because int has a larger range of values.

            Explicit Casting:
            int is cast to short using the (short) operator. There is a risk of data loss if the value exceeds the short
            range.
        *------------------------------------------------------------------------------------------------------------ */

        short shortVar = 20;
        int intVar;

        intVar = shortVar;
        System.out.println(intVar);

        short secondShortVar;
        int secondIntVar = 200;

        secondShortVar = (short) secondIntVar;
        System.out.println(secondShortVar);


        float floatVar = 1.70F;
        int thirdIntVar = (int) floatVar;
        System.out.println(thirdIntVar); // The fractional part is discarded when casting to type int
    }
}
