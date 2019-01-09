package com.aceman;

import javax.naming.Name;

public class Player  {
  protected   int lvl ;
    protected int life;
    protected int force ;
    protected int agility;
    protected int intel;
    protected String name;
    protected String classChoice;

    /**Constructeur par defaut*/

    public Player() {
        classChoice = "Guerrier";
        lvl = 20;
        life = 100;
        force = 15;
        agility = 3;
        intel = 2;
        name = "Barbarock";
        System.out.println("Vous avez un " +classChoice+ " du nom de " +name+ " de niveau " +lvl+ " et " +life+ " PV , " +force+ " force, " +agility+ " agilité, " +intel+ " intélligence.");
    }

    public Player ( String ClassChoice, String Name, int Lvl, int Life, int Force, int Agility, int Intel){

        lvl = Lvl;
        life = Life;
        force = Force;
        agility = Agility;
        intel = Intel;
        name = Name;
        classChoice = ClassChoice;

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

    public String getClassChoice() {
        return classChoice;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassChoice(String classChoice) {
        this.classChoice = classChoice;
    }
}
