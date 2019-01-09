package com.aceman;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class Game extends CreationJoueur {

private String newGame;
public String player1;
public String player2;
boolean switchTour=false;
private static int playAgain = 0;
    public Game() {

        super();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Début du combat!");







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
