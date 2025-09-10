package part2_chatbot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For this small chatbot, I feel that the use of if/else statements is inevitable.

        System.out.println("Welcome! Let's chat!");
        // We'll go the extra mile here and use the 'while' loop to consistently display You: before every message.
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

                String nameInput = scanner.nextLine();

                if (nameInput.startsWith("My name is ")) {
                    String name = nameInput.replace("My name is ", "");
                    System.out.println("ChatBot: Nice to meet you, " + name + "!");
                } else {
                    System.out.println("ChatBot: Oh, could you start with 'My name is'? I'm a little silly at recognizing names by ear.");
                }
            }

            // If the user decides to start by introducing himself, we can have a different response
            else if (userInput.startsWith("My name is")) {
                String name = userInput.replace("My name is ", "");
                System.out.println("ChatBot: Nice to meet you, " + name + "!");
            }

            System.out.println("ChatBot: How are you feeling today?");
            String feeling = scanner.nextLine();


            if (feeling.toLowerCase().contains("good") ||
                    feeling.toLowerCase().contains("great") ||
                    feeling.toLowerCase().contains("i'm fine, thanks") ||
                    feeling.toLowerCase().contains("i'm alright")) {

                System.out.println("ChatBot: I'm glad to hear that!");
            } else {
                System.out.println("ChatBot: Oh well. I hope it gets better!");
            }



        }

        scanner.close();
    }
}