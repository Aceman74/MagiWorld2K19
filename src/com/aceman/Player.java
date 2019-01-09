package com.aceman;

public class Player {
    private int lvl ;
    private int life;
    private int force ;
    private int agility;
    private int intel;
    private String name;
    private String classChoice;

    /**Constructeur par defaut*/

     Player() {/*
        classChoice = "Guerrier";
        lvl = 20;
        life = 100;
        force = 15;
        agility = 3;
        intel = 2;
        name = "Barbarock";
        System.out.println("Vous avez un " +classChoice+ " du nom de " +name+ " de niveau " +lvl+ " et " +life+ " PV , " +force+ " force, " +agility+ " agilité, " +intel+ " intélligence.");
    */
    }

    public Player ( String ClassChoice, String Name, int Lvl, int Life, int Force, int Agility, int Intel){

        this.lvl = Lvl;
        this.life = Life;
        this.force = Force;
        this.agility = Agility;
        this.intel = Intel;
        this.name = Name;
        this.classChoice = ClassChoice;

    }

    int getLvl() {
        return lvl;
    }

     int getLife() {
        return life;
    }

     int getForce() {
        return force;
    }

     int getAgility() {
        return agility;
    }

     int getIntel() {
        return intel;
    }

     String getName() {
        return name;
    }

     String getClassChoice() {
        return classChoice;
    }

     void setLvl(int lvl) {
        this.lvl = lvl;
    }

     void setLife(int life) {
        this.life = life;
    }

     void setForce(int force) {
        this.force = force;
    }

     void setAgility(int agility) {
        this.agility = agility;
    }

     void setIntel(int intel) {
        this.intel = intel;
    }

     void setName(String name) {
        this.name = name;
    }

     void setClassChoice(String classChoice) {
        this.classChoice = classChoice;
    }
}
