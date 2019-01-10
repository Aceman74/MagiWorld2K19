package com.aceman.Classe;
import static com.aceman.CreationJoueur.*;
/**
 * Classe Guerrier pour utilisation des sorts des joueurs.
* */
public class Guerrier  {
    /**
     * Actions du Guerrier si joueur 1.
     */
    public void Guerrier1(){

       switch (choixAtq){
           case 1:
               P2.setLife(P2.getLife()-P1.getForce());
               System.out.println(P1.getName()+" Utilise Coup d’Épée et inflige " +P1.getForce()+ " dégats." );
               System.out.println(P2.getName()+" Perd " +P1.getForce()+ " Points de vies." );
               break;
           case 2:
                P2.setLife(P2.getLife()-(P1.getForce()*2));
                P1.setLife(P1.getLife()-(P1.getForce()/2));
        System.out.println(P1.getName()+" Utilise Coup de Rage et inflige " +(P1.getForce()*2)+ " de dégats.");
               System.out.println(P2.getName()+" Perd " +(P1.getForce()*2)+ " Points de vies." );
               System.out.println(P1.getName()+" Perd " +(P1.getForce()/2)+ " Points de vies." );
               break;
               default:
                   System.out.println("Une erreur est survenue.");
                   break;
       }
   }
    /**
     * Actions du Guerrier si joueur 2.
     */
    public  void Guerrier2(){
        switch (choixAtq){
            case 1:
                P1.setLife(P1.getLife()-P2.getForce());
                System.out.println(P2.getName()+" Utilise Coup d’Épée et inflige " +P2.getForce()+ " dégats." );
                System.out.println(P1.getName()+" Perd " +P2.getForce()+ " Points de vies." );
                break;
            case 2:
                P1.setLife(P1.getLife()-(P2.getForce()*2));
                P2.setLife(P2.getLife()-(P2.getForce()/2));
                System.out.println(P2.getName()+" Utilise Coup de Rage et inflige " +(P2.getForce()*2)+ " de dégats.");
                System.out.println(P1.getName()+" Perd " +(P2.getForce()*2)+ " Points de vies." );
                System.out.println(P2.getName()+" Perd " +(P2.getForce()/2)+ " Points de vies." );
                break;
            default:
                System.out.println("Une erreur est survenue.");
                break;
        }
    }
}
