package com.aceman;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class Game extends CreationJoueur  {

private String newGame;
public int choixAtq;
private int reponse;
private boolean p1Turn=false;
 private boolean p2Turn=false;
private static int playAgain = 0;


    public Game() {

        Scanner sc1 = new Scanner(System.in);

        /*
        if(P1.getClassChoice() == "Guerrier"){

          Guerrier  P1 = new Guerrier();
        }
        if(P1.getClassChoice() == "Magicien"){

            P1 = new Magicien();
        }
        else P1 = new Rodeur();
        if(P2.getClassChoice() == "Guerrier"){

            P2 = new Guerrier();
        }
        if(P2.getClassChoice() == "Magicien"){

            P2 = new Magicien();
        }
        else P2 = new Rodeur();
        */

        System.out.println("Qui veut commencer? " +P1.getName()+ " 1 ou "+P2.getName()+" 2.");
       reponse = sc1.nextInt();
        switch(reponse){
            case 1:
                System.out.println("A toi l'honneur " +P1.getName());
                p1Turn=true;
                p2Turn=false;
                reponse = 1;
                break;
            case 2:
                    System.out.println("A toi l'honneur " +P2.getName());
                p1Turn=false;
                p2Turn=true;
                reponse = 2;
                break;
            default:
                System.out.println(" oops mauvais choix, Joueur 1 commence.");
                System.out.println("A toi l'honneur " +P1.getName());
                p1Turn=true;
                p2Turn=false;
                reponse = 1;
                break;

        }
        System.out.println("Début du combat!");
        do {

        switch(reponse){
            case 1:System.out.println(P1.getName()+" (" +P1.getLife()+ " Vitalité ), choisis ton attaque (1: Attaque basique, 2: Attaque spéciale)");
            p1Turn=false;
            p2Turn=true;
                choixAtq = sc1.nextInt();
                if (P1.getClassChoice() == "Guerrier"){
                 P1.Guerrier1();
                }

                /*
                if(choixAtq == 1 && P1.getClassChoice() == "Guerrier")
                {P2.setLife(P2.getLife()-P1.getForce());
                System.out.println(P2.getName()+" Perd " +P1.getForce()+ " Points de vies." );
                    if(choixAtq == 1 && P1.getClassChoice() == "Magicien")
                    {P2.setLife(P2.getLife()-P1.getIntel());
                        System.out.println(P2.getName()+" Perd " +P1.getIntel()+ " Points de vies." );
                        if(choixAtq == 1 && P1.getClassChoice() == "Rodeur")
                        {P2.setLife(P2.getLife()-P1.getAgility());
                            System.out.println(P2.getName()+" Perd " +P1.getAgility()+ " Points de vies." );
                        }
                    }
                }
                if(choixAtq == 2 && P1.getClassChoice() == "Guerrier")
                reponse = 2;
            break;
            case 2:
            System.out.println(P2.getName()+" (" +P2.getLife()+ " Vitalité ), choisis ton attaque (1: Attaque basique, 2: Attaque spéciale)");
            p1Turn=true;
            p2Turn=false;
                choixAtq = sc1.nextInt();
                reponse = 1;
            break;

            default:


                */
        }

        }while(P1.getLife()>0 || P2.getLife()>0);
        if(P1.getLife()<=0 || P2.getLife()<=0){
            System.out.println("Fin du combat! Le vainqueur est " +calculVainqueur()+ " Félicitation!");
        }
        System.out.println("A bientot!");









    }
    public String calculVainqueur(){
        if(P1.getLife()>0){
            return P1.getName();
        }
        else return P2.getName();
    }

}
