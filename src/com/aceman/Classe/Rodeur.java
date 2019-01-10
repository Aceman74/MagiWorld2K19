package com.aceman.Classe;
import static com.aceman.CreationJoueur.*;
/**
 * Classe Rodeur pour utilisation des sorts des joueurs.
 * */
public class Rodeur  {
    /**
     * Actions du Rodeur si joueur 1.
     */
    public  void Rodeur1(){

        switch (choixAtq){
            case 1:
                P2.setLife(P2.getLife()-P1.getAgility());
                System.out.println(P1.getName()+" Utilise Tir à l’Arc et inflige " +P1.getAgility()+ " dégats." );
                System.out.println(P2.getName()+" Perd " +P1.getAgility()+ " Points de vies." );
                break;
            case 2:
                P1.setAgility(P1.getAgility()+(P1.getLvl()/2));
                System.out.println(P1.getName()+" Utilise Concentration et gagne " +(P1.getLvl()/2)+ " d'agilité.");
                System.out.println(P1.getName()+" A un total de " +P1.getAgility()+ " Points d'agilité." );
                break;
            default:
                System.out.println("Une erreur est survenue.");
                break;
        }
    }
    /**
     * Actions du Rodeur si joueur 2.
     */
    public void Rodeur2(){
        switch (choixAtq){
            case 1:
                P1.setLife(P1.getLife()-P2.getAgility());
                System.out.println(P2.getName()+" Utilise Tir à l’Arc et inflige " +P2.getAgility()+ " dégats." );
                System.out.println(P1.getName()+" Perd " +P2.getAgility()+ " Points de vies." );
                break;
            case 2:
                P2.setAgility(P2.getAgility()+(P2.getLvl()/2));
                System.out.println(P2.getName()+" Utilise Concentration et gagne " +(P2.getLvl()/2)+ " d'agilité.");
                System.out.println(P2.getName()+" A un total de " +P2.getAgility()+ " Points d'agilité." );
                break;
            default:
                System.out.println("Une erreur est survenue.");
                break;
        }
    }
}
