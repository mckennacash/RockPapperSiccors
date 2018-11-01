package com.LickingHeights;



import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        boolean game = false;
        String userMove;
        String userAnswer;
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
            int levelNumber = 0;

            do {
                idx = new Random().nextInt(variables.length);
                random = (variables[idx]);
                levelNumber++;
                System.out.println("\n\n\n//////////////////////////"+"Round "+ levelNumber + "//////////////////////////\n\n\n");
                System.out.println("rock, paper, scissors?");
                userMove = keyboard.nextLine();
                System.out.println("Player picked: "+ userMove+"\n");
                System.out.println("Computer picked: "+ random+"\n");

                if(userMove.equalsIgnoreCase(random)){
                    System.out.println("It was a tie\n");
                }
                else{
                    switch(userMove){

                        case "rock":
                            if(random.equalsIgnoreCase("scissors")){
                                System.out.println("Player wins\n");
                                points++;
                            }
                            else{
                                System.out.println("Computer Wins\n");
                                computerPoints++;
                            }
                            break;
                        case "paper":
                            if(random.equalsIgnoreCase("rock")) {
                                System.out.println("Player wins\n");
                                points++;
                            }
                            else {
                                System.out.println("Computer wins\n");
                                computerPoints++;
                            }
                            break;
                        case "scissors":
                            if(random.equalsIgnoreCase("paper")){
                                System.out.println("Player wins\n");
                                points++;
                            }
                            else {
                                System.out.println("Computer wins\n");
                                computerPoints++;
                            }
                            break;
                    }

                }


                System.out.println("Computer has "+computerPoints+" Player has "+points);


            } while (points < 6 && computerPoints< 6);

            System.out.println("Want to play again?");


            userAnswer = keyboard.nextLine();

        }while(!userAnswer.equalsIgnoreCase("no"));

    }
}
