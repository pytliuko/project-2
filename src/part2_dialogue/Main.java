package part2_dialogue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, and thank you for agreeing for the Q&A.");
        System.out.println("I've got 10 questions for you today, so make sure to answer them all.");

        System.out.print("Enter your full name (String): ");
        String fullName = scanner.nextLine();

        System.out.println("How long have you been on Earth, in years? (Integer): ");
        int age =  scanner.nextInt();

        System.out.println("What is your height, in centimeters? (Double): ");
        double height = scanner.nextDouble();

        System.out.println("What's your gender? (Character - only M/F): ");
        char gender = scanner.next().charAt(0);

        scanner.nextLine();

        System.out.println("What do you think your temperament type is? (String): ");
        String tempType = scanner.nextLine();

        System.out.println("Where do you live now? (City, Country) (String): ");
        String yourHomeland = scanner.nextLine();

        System.out.println("What is your current year at university? (Integer): ");
        int year = scanner.nextInt();

        scanner .nextLine();

        System.out.println("What was your favourite subject back in school? (String): ");
        String subject = scanner.nextLine();

        System.out.println("What keeps you alive and motivated every day? (String): ");
        String sourceOfMotivation = scanner.nextLine();

        System.out.println("Have you ever been arrested? (Boolean - only True/False): ");
        boolean arrested = scanner.nextBoolean();

        // Summary

        System.out.println("\n Profile Summary");
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("Temperament type: " + tempType);
        System.out.println("Homeland: " + yourHomeland);
        System.out.println("Current year: " + year);
        System.out.println("Favourite school subject: " + subject);
        System.out.println("Source of motivation: " + sourceOfMotivation);
        System.out.println("Been arrested: " + arrested);

        System.out.println("\nThanks for participating!");
        scanner.close();

    }
}
