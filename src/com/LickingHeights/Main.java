package com.LickingHeights;



import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        boolean game = false;
        int randomNumber;
        String userMove;
        String userAnswer;
        String rock;
        String paper;
        String scissors;
        String computer;
        keyboard = new Scanner(System.in);
        int points = 0;
        int computerPoints = 0;

        //setting up computer choice
        String[] variables = {"rock","paper","scissors"};
        int idx = new Random().nextInt(variables.length);
        String random = (variables[idx]);


        System.out.println("Want to play rock paper scissors?");
        keyboard.nextLine();
        do {
            points = 0;
            computerPoints = 0;

            do {
                idx = new Random().nextInt(variables.length);
                random = (variables[idx]);
                System.out.println("rock, paper, scissors?");
                userMove = keyboard.nextLine();

                if(userMove.equalsIgnoreCase(random)){
                    System.out.println("It was a tie");
                }
                else{
                    switch(userMove){
                        case "rock":
                            if(random.equalsIgnoreCase("scissors")){
                                System.out.println("Player wins");
                                points++;
                            }
                            else{
                                System.out.println("Computer Wins");
                                computerPoints++;
                            }
                        case "paper":
                            if(random.equalsIgnoreCase("rock")) {
                                points++;
                            }
                            else {
                                System.out.println("Computer wins");
                                computerPoints++;
                            }

                        case "scissors":
                            if(random.equalsIgnoreCase("paper")){
                                System.out.println("Player wins");
                                points++;
                            }
                            else {
                                System.out.println("Computer wins");
                                computerPoints++;
                            }
                    }

                }





            } while (points <= 6 && computerPoints<=6);

            System.out.println("Want to play again?");


            userAnswer = keyboard.nextLine();

        }while(!userAnswer.equalsIgnoreCase("no"));

    }
}
