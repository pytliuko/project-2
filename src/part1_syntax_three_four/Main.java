package part1_syntax_three_four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This is part 3-4 of Syntax: String and I/O operations.
        // String operations

        String name = "Java is one of Indonesia's largest islands";
        System.out.println("Check out these string operations:");
        // Everyone knows the length...
        System.out.println("Length: " + name.length());
        // But what about this?
        String sub = name.substring(8, 41);
        System.out.println(sub);

        // You counted the characters manually, didn't you? Let's find a way to simplify it.
        // First, find  the starting position of 'one'
        int startIndex = name.indexOf("one");
        // We want the phrase until the very end, so we use name.length()
        String result = name.substring(startIndex, name.length());
        System.out.println(result);
        // The output should be 'one of Indonesia's largest islands' now.

        // To yell, we can use all uppercase
        System.out.println("Uppercase: " + result.toUpperCase());

        // Finally, let's replace some words
        String updatedText = name
                .replace("Java", "Sumatra")
                .replace("Indonesia's", "Malaysia's");

        System.out.println(updatedText);
        // The output is now 'Sumatra is one of Malaysia's largest islands'

        // Okay, now for the I/O operations
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter any number: ");
        String input = scanner.nextLine();
        System.out.println("Good! Now get out of your room and do exactly " + input + "push-ups");
    }
}
