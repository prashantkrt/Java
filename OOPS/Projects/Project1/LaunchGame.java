package OOPS.Projects.Project1;

import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! Kindly please guess the number between 0 to 10");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player {
    int guessNum;

    int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! Kindly please guess the number between 0 to 10");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromP1;
    int numFromP2;
    int numFromP3;

    void collectNumFromGuesser() {
        Guesser guess = new Guesser();
        numFromGuesser = guess.guessNumber();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromP1 = p1.guessNumber();
        numFromP2 = p2.guessNumber();
        numFromP3 = p3.guessNumber();
    }

    void compare() {
        if (numFromP1 == numFromGuesser) {
            if (numFromGuesser == numFromP2 && numFromGuesser == numFromP3)
                System.out.println("All the players guessed the numbers correctly! Game tied ");
            else if (numFromGuesser == numFromP2)
                System.out.println("Game tied between the player1 and player2 ");
            else if (numFromGuesser == numFromP3)
                System.out.println("Game tied between the player1 and player3 ");
            else System.out.println("Player 1 won the game");
        } else if (numFromP2 == numFromGuesser) {
            if (numFromGuesser == numFromP3)
                System.out.println("Game tied between the player2 and player3 ");
            else System.out.println("Player 2 won the game");
        } else if (numFromP3 == numFromGuesser) {
            System.out.println("Player 3 won the game");
        } else System.out.println("Game Lost! try again");
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.collectNumFromGuesser();
        umpire.collectNumFromPlayers();
        umpire.compare();
    }
}
