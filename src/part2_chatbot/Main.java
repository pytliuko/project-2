package part2_chatbot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For this small chatbot, I feel that the use of if/else statements is inevitable.

        System.out.println("Welcome! Let's chat!");
        // We'll go the extra mile here and use the 'while' loop to consistently display You:.
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            // The user can also type 'No thanks' to exit the conversation.
            if (userInput.equalsIgnoreCase("No thanks")) {
                System.out.println("ChatBot: Goodbye! Have a great day!");
                break;
            }

            // If the user types either of these words, the conversation starts
            if (userInput.toLowerCase().contains("okay") ||
                    userInput.toLowerCase().contains("fine") ||
                    userInput.toLowerCase().contains("let's do it")) {

                System.out.println("ChatBot: Great! How may I address you?");
                System.out.print("You: ");

                String nameInput = scanner.nextLine();

                if (nameInput.startsWith("My name is ")) {
                    String name = nameInput.replace("My name is ", "");
                    System.out.println("ChatBot: Nice to meet you, " + name + "!");
                } else {
                    System.out.println("ChatBot: Oh, could you start with 'My name is'? I'm a little silly at recognizing names by ear.");

                    System.out.print("You: ");
                    nameInput = scanner.nextLine();
                    if (nameInput.startsWith("My name is ")) {
                        String name = nameInput.replace("My name is ", "");
                        System.out.println("ChatBot: Nice to meet you, " + name + "!");
                    } else {
                        System.out.println("ChatBot: Alright, I'll just call you Untitled_1!");
                    }
                }
            }

            // If the user decides to start by introducing himself, we can have a different response
            else if (userInput.startsWith("My name is")) {
                String name = userInput.replace("My name is ", "");
                System.out.println("ChatBot: Nice to meet you, " + name + "!");

            }

            System.out.println("ChatBot: How are you feeling today?");
            System.out.print("You: ");
            String feeling = scanner.nextLine();

            // We'll introduce lowercase here because we won't normally use Caps anyway
            if (feeling.toLowerCase().contains("good") ||
                    feeling.toLowerCase().contains("great") ||
                    feeling.toLowerCase().contains("i'm fine, thanks") ||
                    feeling.toLowerCase().contains("i'm alright")) {

                System.out.println("ChatBot: I'm glad to hear that!");
            } else {
                System.out.println("ChatBot: Oh well. I hope it gets better!");
            }

            System.out.println("ChatBot: Do you have a hobby?");
            System.out.print("You: ");
            String hobby = scanner.nextLine();

            if (hobby.toLowerCase().contains("bike riding") ||
                    hobby.toLowerCase().contains("philosophy") ||
                    hobby.toLowerCase().contains("basketball") ||
                    hobby.toLowerCase().contains("football") ||
                    hobby.toLowerCase().contains("math") ||
                    hobby.toLowerCase().contains("coding") ||
                    hobby.toLowerCase().contains("music")) {

                System.out.println("ChatBot: That's so cool! I used to love " + hobby + " back when I was younger... But that was tens of years ago.");
            } else {
                System.out.println("ChatBot: Sounds fancy! Always nice to see talented youngsters like you. I should try that sometime, too.");
            }

            System.out.println("ChatBot: Do you have any pets?");
            System.out.print("You: ");
            String pets = scanner.nextLine();

            if (pets.toLowerCase().contains("cat")) {
                System.out.println("ChatBot: Oh Lord. I used to throw my cat around the house and squeeze him when I was a kid. That's one thing I'll never understand about myself.");
            } else {
                System.out.println("ChatBot: Pets are always fun to have, man. Hope they bring happiness to you.");
            }
        }

        scanner.close();
    }
}