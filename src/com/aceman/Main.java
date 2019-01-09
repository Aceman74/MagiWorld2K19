package com.aceman;

public class Main {

    public static void main(String[] args) {

        System.out.println("*******************************************");
        System.out.println("*                                         *");
        System.out.println("*           Magica World 2K19             *");
        System.out.println("*                                         *");
        System.out.println("*******************************************");
        System.out.println("Bienvenue dans une nouvelle partie de MagiWorld 2019!");
        /*new CreationJoueur(); */
        new Guerrier();
        System.out.println("Voulez-vous jouer une autre partie ? 1 : oui , 2 : non");

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
