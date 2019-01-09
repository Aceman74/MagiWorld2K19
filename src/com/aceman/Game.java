package com.aceman;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class Game{

private String newGame;
private String player1;
private String player2;
private static int playAgain = 0;
    public Game() {

        Scanner sc1 = new Scanner(System.in);

        try {
            playAgain = sc1.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Oups choix incorrect, choisi 1 ou 2 .");
        }
        if (playAgain == 1){
           /* new Game(); */
        }
    }

}
