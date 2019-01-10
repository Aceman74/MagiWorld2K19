package com.aceman;

import java.util.Scanner;
import com.aceman.Classe.Guerrier;
import com.aceman.Classe.Magicien;
import com.aceman.Classe.Rodeur;

public  class Game extends CreationJoueur  {

private String newGame;
private int reponse;
private boolean p1Turn=false;
private boolean p2Turn=false;
    /**
     * Boolean pour verifier la vie max du magicien.
     */
    public static boolean checkLife;

    /**
    * Debut d'une nouvelle partie.
    * */

    Game() {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Qui veut commencer? " +P1.getName()+ " 1 ou "+P2.getName()+" 2.");
       reponse = sc1.nextInt();
        switch(reponse){
            case 1:
                System.out.println("A toi l'honneur " +P1.getName()+ " !");
                p1Turn=true;
                p2Turn=false;
                reponse = 1;
                break;
            case 2:
                    System.out.println("A toi l'honneur " +P2.getName()+ " !");
                p1Turn=false;
                p2Turn=true;
                reponse = 2;
                break;
            default:
                System.out.println(" oops mauvais choix, Joueur 1 commence.");
                System.out.println("A toi l'honneur " +P1.getName()+ " !");
                p1Turn=true;
                p2Turn=false;
                reponse = 1;
                break;

        }
        System.out.println("Début du combat!");
        do {

        switch(reponse){
            case 1:
                p1Turn=false;
                p2Turn=true;
                System.out.println(P1.getName()+" (" +P1.getLife()+ " Vitalité ), choisis ton attaque (1: Attaque basique, 2: Attaque spéciale)");

                choixAtq = sc1.nextInt();
                if (choixAtq == 1 && P1.getClassChoice() == "Guerrier"){
                    Guerrier P1 = new Guerrier();
                    P1.Guerrier1();
                }if (choixAtq == 1 &&P1.getClassChoice() == "Magicien"){
                Magicien P1 = new Magicien();
                P1.Magicien1();
                }if(choixAtq == 1 && P1.getClassChoice() == "Rodeur"){
                    Rodeur P1 = new Rodeur();
                    P1.Rodeur1();
                    }

                if(choixAtq == 2 && P1.getClassChoice() == "Guerrier"){
                    Guerrier P1 = new Guerrier();
                    P1.Guerrier1();
                }
                if(choixAtq == 2 && P1.getClassChoice() == "Magicien"){
                Magicien P1 = new Magicien();
                P1.CheckLife1();
                }

                if(choixAtq == 2 && P1.getClassChoice() == "Rodeur"){
                Rodeur P1 = new Rodeur();
                P1.Rodeur1();
            }
                reponse = 2;
            break;
            case 2:
                p1Turn=true;
                p2Turn=false;
            System.out.println(P2.getName()+" (" +P2.getLife()+ " Vitalité ), choisis ton attaque (1: Attaque basique, 2: Attaque spéciale)");

                choixAtq = sc1.nextInt();

                if (choixAtq == 1 && P2.getClassChoice() == "Guerrier"){
                    Guerrier P2 = new Guerrier();
                    P2.Guerrier2();
                }if (choixAtq == 1 &&P2.getClassChoice() == "Magicien"){
                Magicien P2 = new Magicien();
                P2.Magicien2();
                }if(choixAtq == 1 && P2.getClassChoice() == "Rodeur"){
                Rodeur P2 = new Rodeur();
                P2.Rodeur2();
            }
                if(choixAtq == 2 && P2.getClassChoice() == "Guerrier"){
                    Guerrier P2 = new Guerrier();
                    P2.Guerrier2();
                }if(choixAtq == 2 && P2.getClassChoice() == "Magicien"){
                Magicien P2 = new Magicien();
                P2.CheckLife2();
            }
                 if(choixAtq == 2 && P2.getClassChoice() == "Rodeur"){
                Rodeur P2 = new Rodeur();
                P2.Rodeur2();
            }
                reponse = 1;
            break;

            default:
                System.out.println("Une Erreur est survenue.");

        }

        }while(P1.getLife()>0 && P2.getLife()>0);
        if(P1.getLife()<=0 || P2.getLife()<=0){
            System.out.println("Fin du combat! Le vainqueur est " +calculVainqueur()+ " Félicitation!");
        }

    }

    /**
     * Calcul du vainqueur suivant les PV.
     * @return nom du vainqueur.
     */
    private String calculVainqueur(){
        if(P1.getLife()>0){
            return P1.getName();
        }
        else return P2.getName();
    }

}
