package com.aceman;
import static com.aceman.CreationJoueur.*;
import static com.aceman.Game.checkLife;

public class Magicien {

    void Magicien1(){

        switch (choixAtq){

            case 1:
                P2.setLife(P2.getLife()-P1.getIntel());
                System.out.println(P1.getName()+" Utilise Boule de Feu et inflige " +P1.getIntel()+ " dégats." );
                System.out.println(P2.getName()+" Perd " +P1.getIntel()+ " Points de vies." );
                break;

            case 2:
                P1.setLife(P1.getLife()+(P1.getIntel()*2));
                System.out.println(P1.getName()+" Utilise Soin et restaure " +(P1.getIntel()*2)+ " PV.");
                System.out.println(P1.getName()+" A un total de " +P1.getLife()+ " Points de vies." );
                break;

            default:
                System.out.println("Une erreur est survenue.");
                break;
        }
    }
    void Magicien2(){

        switch (choixAtq){

            case 1:
                P1.setLife(P1.getLife()-P2.getIntel());
                System.out.println(P2.getName()+" Utilise Boule de Feu et inflige " +P2.getIntel()+ " dégats." );
                System.out.println(P1.getName()+" Perd " +P2.getIntel()+ " Points de vies." );
                break;

            case 2:
                P2.setLife(P2.getLife()+(P2.getIntel()*2));
                System.out.println(P2.getName()+" Utilise Soin et restaure " +(P2.getIntel()*2)+ " PV.");
                System.out.println(P2.getName()+" A un total de " +P2.getLife()+ " Points de vies." );
                break;

            default:
                System.out.println("Une erreur est survenue.");
                break;
        }
    }
    void CheckLife1(){
        if(P1.getLife()+(P1.getIntel()*2) > vieMaxJ1){
        System.out.println("Sort impossible, vous ne pouvez pas restaurer plus que votre max de santé!");
            checkLife =false;
        }else checkLife = true;
    }
    void CheckLife2(){
        if(P2.getLife()+(P2.getIntel()*2) > vieMaxJ2){
            System.out.println("Sort impossible, vous ne pouvez pas restaurer plus que votre max de santé!");
            checkLife =false;
        }else checkLife = true;
    }
}