package com.aceman;

import java.util.Scanner;

class CreationJoueur {

static  Player P1 = new Player();
static Player P2 = new Player();
static   int choixAtq;
static   int vieMaxJ2, vieMaxJ1;


     CreationJoueur() {

          Scanner sc = new Scanner(System.in);
        int classeJ1, classeJ2, niveauJ1, niveauJ2, vieJ1, vieJ2, forceJ1 , forceJ2, agiliteJ1 , agiliteJ2, intelligenceJ1, intelligenceJ2, totalStatJ1, totalStatJ2;
        String  nameJ1, nameJ2,classeJ1String = "",classeJ2String = "";



        /* Creation joueur 1 */

        System.out.println("Création du Joueur 1 : ");
        System.out.println("Choissisez votre nom : ");
        nameJ1=sc.nextLine();
        P1.setName(nameJ1);
        boolean badAnswer ;
        do {
           System.out.println("Choissisez votre Classe \n 1: Guerrier, 2: Magicien, 3: Rodeur");

        classeJ1 = sc.nextInt();
        switch(classeJ1){
            case 1: classeJ1String= "Guerrier";
                System.out.println("Bwaaaarg, ca va saigner!");
                badAnswer=false;
                break;
            case 2: classeJ1String= "Magicien";
                System.out.println("Craignez mes sorts!");
                badAnswer=false;
                break;
            case 3: classeJ1String= "Rodeur";
                System.out.println("Je suis deja derriere vous!");
                badAnswer=false;
                break;
                default: System.out.println("Choix non valide!");
                    badAnswer=true;
                    break;
        }
       }while (badAnswer);
        P1.setClassChoice(classeJ1String);

       do {
           System.out.println("Choissisez votre Niveau \n entre 0 et 100 :");
        niveauJ1 = sc.nextInt();

        if (niveauJ1 < 1 || niveauJ1 >100)
        {
            System.out.println("Le niveau doit etre entre 0 et 100!");
            badAnswer=true;
        }
        else badAnswer=false;
       }while (badAnswer);
       P1.setLvl(niveauJ1);
       vieJ1= niveauJ1*5;
        System.out.println("Votre niveau est " +niveauJ1+ " , vos PV sont de " +vieJ1);
        P1.setLife(vieJ1);
        vieMaxJ1 = vieJ1;
       do {

        System.out.println("Choissisez votre niveau de Force \n Calculez bien, force + agilité + intélligence ne peu etre supérieur a votre niveau de personnage :");
        forceJ1= sc.nextInt();
        System.out.println("Choissisez votre niveau d' Agilité : \n ");
        agiliteJ1 = sc.nextInt();
        System.out.println("Choissisez votre niveau d' Intélligence : \n ");
        intelligenceJ1 = sc.nextInt();
        totalStatJ1= forceJ1+ agiliteJ1+intelligenceJ1;
        if (totalStatJ1 > niveauJ1)
        {
            System.out.println("Votre niveau de personnage (" +niveauJ1+ ") doit etre équivalent a la somme de vos statistiques ajoutées!");
            System.out.println("Vous avez (" +(totalStatJ1 - niveauJ1)+ ") Points de différence.");
            badAnswer=true;
        }
        else badAnswer = false;
       }while (badAnswer);
       P1.setForce(forceJ1); P1.setAgility(agiliteJ1); P1.setIntel(intelligenceJ1);

       System.out.println("Je suis un " +P1.getClassChoice()+ " du nom de " +P1.getName()+ " , je suis de niveau " +P1.getLvl()+ " avec " +P1.getLife()+ " PV");
       System.out.println("J'ai " +P1.getForce()+ " en Force, " +P1.getAgility()+ " en agilité et " +P1.getIntel()+ " en Intelligence!");
        System.out.println(" ");
        /* Creation joueur 2 */


        System.out.println("Création du Joueur 2 : ");
        System.out.println(" ");
        System.out.println("Choissisez votre nom : ");
        nameJ2 = sc.next();
        P2.setName(nameJ2);
        do {
            System.out.println("Choissisez votre Classe \n 1: Guerrier, 2: Magicien, 3: Rodeur");

            classeJ2 = sc.nextInt();
            switch(classeJ2){
                case 1: classeJ2String= "Guerrier";
                System.out.println("Bwaaaarg, ca va saigner!");
                    badAnswer=false;
                    break;
                case 2: classeJ2String= "Magicien";
                    System.out.println("Craignez mes sorts!");
                    badAnswer=false;
                    break;
                case 3: classeJ2String= "Rodeur";
                    System.out.println("Je suis deja derriere vous!");
                    badAnswer=false;
                    break;
                default: System.out.println("Choix non valide!");
                    badAnswer=true;
                    break;
            }
        }while (badAnswer);
        P2.setClassChoice(classeJ2String);

        do {
            System.out.println("Choissisez votre Niveau \n entre 0 et 100 :");
            niveauJ2 = sc.nextInt();

            if (niveauJ2 < 1 || niveauJ2 >100)
            {
                System.out.println("Le niveau doit etre entre 0 et 100!");
                badAnswer=true;
            }
            else badAnswer=false;
        }while (badAnswer);
        P2.setLvl(niveauJ2);
        vieJ2= niveauJ2*5;
        System.out.println("Votre niveau est " +niveauJ2+ " , vos PV sont de " +vieJ2);
        P2.setLife(vieJ2);
        vieMaxJ2 = vieJ2;
        do {

            System.out.println("Choissisez votre niveau de Force \n Calculez bien, force + agilité + intélligence ne peu etre supérieur a votre niveau de personnage :");
            forceJ2= sc.nextInt();
            System.out.println("Choissisez votre niveau d' Agilité : \n ");
            agiliteJ2 = sc.nextInt();
            System.out.println("Choissisez votre niveau d' Intélligence : \n ");
            intelligenceJ2 = sc.nextInt();
            totalStatJ2= forceJ2+agiliteJ2+intelligenceJ2;
            if (totalStatJ2 > niveauJ2)
            {
                System.out.println("Votre niveau de personnage (" +niveauJ2+ ") doit etre équivalent a la somme de vos statistiques ajoutées!");
                System.out.println("Vous avez (" +(totalStatJ2 - niveauJ2)+ ") Points de différence.");
                badAnswer=true;
            }
            else badAnswer = false;
        }while (badAnswer);
        P2.setForce(forceJ2); P2.setAgility(agiliteJ2); P2.setIntel(intelligenceJ2);
        System.out.println("Je suis un " +P2.getClassChoice()+ " du nom de " +P2.getName()+ " , je suis de niveau " +P2.getLvl()+ " avec " +P2.getLife()+ " PV");
        System.out.println("J'ai " +P2.getForce()+ " en Force, " +P2.getAgility()+ " en agilité et " +P2.getIntel()+ " en Intelligence!");
        System.out.println(" ");

    }

}
