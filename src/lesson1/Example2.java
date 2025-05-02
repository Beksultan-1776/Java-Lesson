package lesson1;

/* Example 2. Variables */

public class Example2 {
    public static void main(String[] args) {
        /* ------------------------------------------------------------------------------------------------------------*
            Variable naming rules:
            - Names can contain letters, digits, underscores, and dollar signs
            - Names must begin with a letter
            - Names should start with a lowercase letter, and cannot contain whitespace
            - Names can also begin with $ and _
            - Names are case-sensitive ("myVar" and "myvar" are different variables)
            - Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        *------------------------------------------------------------------------------------------------------------ */

        // Variable declaration <data type> <variable name>;
        short myVar;

        // Assigning a variable <name> = <value>
        myVar = 20;

        // Output variable value
        System.out.println(myVar);

        // Initial variables <data type> <variable name> = <value>
        short age = 21;
        System.out.println(age);

        // Declaring multiple variables separated by commas
        short x = 1, y = 2, z;
        System.out.println("x = " + x + "; y = " + y);

        // Trying to print an uninitialized variable will result in an error 👇.
        // System.out.println(z);
    }
}
