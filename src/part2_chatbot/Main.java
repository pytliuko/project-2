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

            // The user can also type 'No thanks' at the beginning or 'Bye' at the end to exit the conversation.
            if (userInput.equalsIgnoreCase("No thanks") ||
                    userInput.equalsIgnoreCase("bye") ||
                    userInput.equalsIgnoreCase("Goodbye")) {
                System.out.println("ChatBot: Goodbye! Have a great day!");
                break;
            }

            // If the user types either of these words, the conversation starts
            if (userInput.toLowerCase().contains("okay") ||
                    userInput.toLowerCase().contains("fine") ||
                    userInput.toLowerCase().contains("yeah") ||
                    userInput.toLowerCase().contains("alright") ||
                    userInput.toLowerCase().contains("ok") ||
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
                    feeling.toLowerCase().contains("fine") ||
                    feeling.toLowerCase().contains("fantastic") ||
                    feeling.toLowerCase().contains("marvelous") ||
                    feeling.toLowerCase().contains("chill") ||
                    feeling.toLowerCase().contains("alright")) {

                System.out.println("ChatBot: I'm glad to hear that!");
            } else {
                System.out.println("ChatBot: Oh well. I hope it gets better!");
            }

            System.out.println("ChatBot: Do you have a hobby?");
            System.out.print("You: ");
            String hobby = scanner.nextLine();

            if (hobby.toLowerCase().contains("bike riding")) {
                System.out.println("ChatBot: That's so cool! I still love it to this day. ");
                }
                else if (hobby.toLowerCase().contains("music")) {
                System.out.println("ChatBot: Now that's a hobby for a lifetime. A musician is what I wanted to be once, and I was pretty close. I guess there's a reason I chose coding instead...");
                }
                else if (hobby.toLowerCase().contains("philosophy")) {
                System.out.println("ChatBot: Spot on! I would talk about Descartes when I wanted to show off... in middle school.");
                }
                else if (hobby.toLowerCase().contains("math")) {
                System.out.println("ChatBot: Man, math is beautiful. It's a gym for the mind, for sure. Hit me up if you want an Integration Bee showdown.");
                }
                else if (hobby.toLowerCase().contains("sports")) {
                System.out.println("ChatBot: Oh, good for you! I feel like my body is crying for sports inside.");
                }
                else if (hobby.toLowerCase().contains("basketball")) {
                System.out.println("ChatBot: Yeah, I feel you. I feel like I have some deep connection with basketball, too. I just seem to like badminton more. But if you're shooting the hoops and need company, I'm down.");
                }
                else if (hobby.toLowerCase().contains("football")) {
                System.out.println("ChatBot: Hehe, all my friends like football. Doesn't click for me, though. It's only fun when I'm watching it.");
                }
                else if (hobby.toLowerCase().contains("photography")) {
                System.out.println("ChatBot: Yes, yes, yes. I try to take pictures wherever I go. Sometimes I don't feel like it, though. I feel like my lens is slightly outdated. Or is that a skill issue?");
                }
                else if (hobby.toLowerCase().contains("coding")) {
                System.out.println("Cool");
                }
                else {
                System.out.println("ChatBot: Sounds fancy! Always nice to see talented youngsters like you. Just don't give it up.");
            }


            System.out.println("ChatBot: Do you have any pets?");
            System.out.print("You: ");
            String pets = scanner.nextLine();

            if (pets.toLowerCase().contains("cat")) {
                System.out.println("ChatBot: Oh Lord. I used to throw my cat around the house and squeeze him when I was a kid. That's one thing I'll never understand about myself.");
            } else {
                System.out.println("ChatBot: How cool. Pets are always fun to have, man. Hope they bring happiness to you.");
            }

            System.out.println("ChatBot: So, where are you in your academic journey now? Still in school, or university?");
            System.out.print("You: ");
            String academicJourney = scanner.nextLine();

            if (academicJourney.toLowerCase().contains("school")) {
                System.out.println("ChatBot: Oh man, school is a wonderful time, tell you what. Yours peers might tell you otherwise, but that's normal. Always been. You don't listen to them kids, they're on their own path. You've got hobbies, and you've got culture, so make it your best, and it will be the best.");
            }
            else if (academicJourney.toLowerCase().contains("university")) {
                System.out.println("ChatBot: Wow, congrats! I still remember that feeling after breaking out from school, thinking about what to do next, and just running around enjoying every breath of life. My advice to you is, don't be late to class, and finish your assignments on time. I struggled with that a lot back in my day. Take it from me, and carry it throughout.");
            }

            System.out.println("ChatBot: Any idea on who you want to become?");
            System.out.println("You: ");
            String job = scanner.nextLine();

            if (job.toLowerCase().contains("yes") ||
                    job.contains("Yes") ||
                    job.contains("Yeah") ||
                    job.toLowerCase().contains("yeah")) {
                System.out.println("ChatBot: Glad to hear that. Keep aspiring towards it. And be open to changes, too.");
            } else {
                System.out.println("ChatBot: Everyone finds their way eventually! And I can tell you from my own experience - it's even more interesting when something you secretly love finds you later in life. Later in your, uhh, 20s, of course. You get the idea.");
            }

            System.out.println("ChatBot: Well, aside from all that, what do you truly want in life? On the deeper level? Have you thought of that?");
            System.out.print("You: ");
            String life = scanner.nextLine();

            if (life.contains("Yeah") ||
                life.toLowerCase().contains("yeah") ||
                life.contains("Yes") ||
                life.toLowerCase().contains("yes") ||
                life.toLowerCase().contains("happiness") ||
                life.toLowerCase().contains("peace") ||
                life.toLowerCase().contains("love")) {
            System.out.println("I'm with you on that. Just enjoy the journey of life, and look around more. Sometimes, it's there with you. But whether you want to notice it or not, it's all up to you...");
            } else if (life.contains("No") ||
                    life.toLowerCase().contains("not really") ||
                    life.contains("Not really") ||
                    life.contains("Can't say")) {
                System.out.println("All fine! Just enjoy whatever surrounds you every day. Chances are, it's there. Or it might not be. Does it matter anyway? Here I am, talking to you, and testing some silly code. And that's amazing! That's just how life turned out, and for me, it's really the best way it could've. That's the wavelength I'm on. You might be with me. If you're not, then you're always invited. ");
            }
            System.out.println("Anyway, got to go now. I'm glad I spent these couple of minutes talking to you. I swear it felt longer. Stop by another time, and I'll see you!");
        }
        scanner.nextLine();

        scanner.close();
    }
}