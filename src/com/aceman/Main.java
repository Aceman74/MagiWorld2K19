package com.aceman;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *@author Aceman pour OpenClassrooms
 */

public class Main {
     /**
     * Lancement du jeu.
     */
    public static void main(String[] args) {

        int playAgain = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("*******************************************");
        System.out.println("*                                         *");
        System.out.println("*           Magica World 2K19             *");
        System.out.println("*                                         *");
        System.out.println("*******************************************");
        System.out.println("Bienvenue dans une nouvelle partie de MagiWorld 2019!");
        new Game();

        // Demande de nouvelle partie.

        do {
           System.out.println("Voulez-vous jouer une autre partie ? 1 : oui , 2 : non");
        try {
            playAgain = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Oups choix incorrect.");
        }
        if(playAgain == 1){
            new Game();
        }else
            {
            System.out.println("Merci d'avoir jouer,");
            System.out.println("et à bientot!");
            System.exit(1);
            }

       }while(playAgain == 1);
       /* try {
            playAgain = sc1.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Oups choix incorrect, choisi 1 ou 2 .");
        }
        if (playAgain == 1){
             new Game();
        }*/
    }
}
