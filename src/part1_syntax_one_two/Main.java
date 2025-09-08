package part1_syntax_one_two;

public class Main {
    public static void main(String[] args) {
        // 1. Using variables with different data types
        int temperature = 28;
        double e = 2.71;
        char myGrade = 'F';
        boolean canYouReadThis = true;
        String greeting = "Welcome to my program!";

        System.out.println("Demonstrating data types...");
        System.out.println("int: " + temperature);
        System.out.println("double: " + e);
        System.out.println("char: " + myGrade);
        System.out.println("boolean: " + canYouReadThis);
        System.out.println("String: " + greeting);

        // 2. Performing operations
        int x = 2520, y = 27;
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y)); // Both integers, so the quotient is an integer
        System.out.println("Modulus: " + (x % y)); // 2520 ≡ 9 (mod27)

        // Increments and decrements
        System.out.println("Increment: " + ++y);
        System.out.println("Decrement: " + --y);

        // Additionally, we could increment y by a number other than 1:
        System.out.println("Increment by 5: " + (y+=5));
        System.out.println("Decrement by 5: " + (y-=5));

        // Type Casting, or converting one data type into another
        double quotientTypeCast = (double) x / (double) y;
        // Here, we want our quotient to be precise, so we typecast it to double
        System.out.println("Type casting: " + quotientTypeCast);


    }
}
