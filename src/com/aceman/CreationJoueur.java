package com.aceman;

import java.util.Scanner;

class CreationJoueur extends Player {
    public CreationJoueur(String ClassChoice, String Name, int Lvl, int Life, int Force, int Agility, int Intel) {
        super(ClassChoice, Name, Lvl, Life, Force, Agility, Intel);
    }

    protected  CreationJoueur() {

          Scanner sc = new Scanner(System.in);
        int classeJ1, classeJ2, niveauJ1, niveauJ2, forceJ1 , forceJ2, agilitéJ1 , agilitéJ2, intelligenceJ1, intelligenceJ2, totalStatJ1, totalStatJ2;
        String  nameJ1, namej2,classeJ1String = "",classeJ2String;
        boolean badAnswer=false;

        System.out.println("Création du Joueur 1 : ");
        System.out.println("Choissisez votre nom : ");
        nameJ1 = sc.nextLine();
       do {
           System.out.println("Choissisez votre Classe \n 1: Guerrier, 2: Magicien, 3: Rodeur");

        classeJ1 = sc.nextInt();
        switch(classeJ1){
            case 1: classeJ1String= "Guerrier";
                badAnswer=false;
                break;
            case 2: classeJ1String= "Magicien";
                badAnswer=false;
                break;
            case 3: classeJ1String= "Rodeur";
                badAnswer=false;
                break;
                default: System.out.println("Choix non valide!");
                    badAnswer=true;
                    break;
        }
       }while (badAnswer==true);

       do {
           System.out.println("Choissisez votre Niveau \n entre 0 et 100 :");
        niveauJ1 = sc.nextInt();

        if (niveauJ1 < 1 || niveauJ1 >100)
        {
            System.out.println("Le niveau doit etre entre 0 et 100!");
            badAnswer=true;
        }
        else badAnswer=false;
       }while (badAnswer==true);
       do {

        System.out.println("Choissisez votre niveau de Force \n Calculez bien, force + agilité + intélligence ne peu etre supérieur a votre niveau de personnage :");
        forceJ1= sc.nextInt();
        System.out.println("Choissisez votre niveau d' Agilité : \n ");
        agilitéJ1 = sc.nextInt();
        System.out.println("Choissisez votre niveau d' Intélligence : \n ");
        intelligenceJ1 = sc.nextInt();
        totalStatJ1= forceJ1+agilitéJ1+intelligenceJ1;
        if (totalStatJ1 > niveauJ1)
        {
            System.out.println("Votre niveau de personnage (" +niveauJ1+ ") doit etre équivalent a la somme de vos statistiques ajoutées!");
            System.out.println("Vous avez (" +(totalStatJ1 - niveauJ1)+ ") Points de différence.");
            badAnswer=true;
        }
        else badAnswer = false;
       }while (badAnswer==true);
        Player P1 = new Player(classeJ1String);
    }
}
