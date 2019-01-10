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
/**
 * Creation du Joueur
 *
 * @param Lvl  Niveau du joueur
 * @param  Life Sante du joueur
 * @param Force Force du joueur
 * @param Agility Agilite du joueur
 * @param Intel Intelligence du joueur
 * @param Name Nom du joueur
 * @param ClassChoice Classe du joueur
 * */

    public Player  ( String ClassChoice, String Name, int Lvl, int Life, int Force, int Agility, int Intel){

        this.lvl = Lvl;
        this.life = Life;
        this.force = Force;
        this.agility = Agility;
        this.intel = Intel;
        this.name = Name;
        this.classChoice = ClassChoice;

    }

    public int getLvl() {
        return lvl;
    }

    public int getLife() {
        return life;
    }

    public int getForce() {
        return force;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntel() {
        return intel;
    }

    public String getName() {
        return name;
    }

      String getClassChoice() {
        return classChoice;
    }

      void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setLife(int life) {
        this.life = life;
    }

      void setForce(int force) {
        this.force = force;
    }

    public  void setAgility(int agility) {
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
