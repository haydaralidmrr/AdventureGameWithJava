package com.ahdprojects;

import java.util.Scanner;

public class Player {
    private int damage,healthy,money,reHealthy;
    private String charName;
    private Inventory inventory;
    Scanner input=new Scanner(System.in);

    public Player(){
        inventory=new Inventory();
    }

    public void selectChar(){
        GameCharacters [] characters={new Samurai(),new Archer(),new Knight()};
        for (GameCharacters characters1:characters){
            System.out.println("ID: "+characters1.getId()
            +"\tCharacter:" + characters1.getCharName()
            +"\tDamage:" + characters1.getDamage()
            +"\tHealthy:" + characters1.getHealthy()
            +"\tMoney:" + characters1.getMoney());
        }
        System.out.println("Please select a character that you want to play in the game");
        int charNum=input.nextInt();
        while (charNum>3 || charNum<1){
            System.out.println("You need to enter number that between 1-3");
            charNum=input.nextInt();
        }
        switch (charNum){
            case 1:
                initPlayer(new Samurai());
                showPlayerInfo();
                break;
            case 2:
                initPlayer(new Archer());
                showPlayerInfo();
                break;
            case 3:
                initPlayer(new Knight());
                showPlayerInfo();
                break;
            default:
                initPlayer(new Samurai());
                showPlayerInfo();
                break;

        }


    }

    private void initPlayer(GameCharacters gameCharacters) {
        this.setCharName(gameCharacters.getCharName());
        this.setDamage(gameCharacters.getDamage());
        this.setHealthy(gameCharacters.getHealthy());
        this.setMoney(gameCharacters.getMoney());
        this.setReHealthy(gameCharacters.getHealthy());


    }
    private void showPlayerInfo(){
        System.out.println("Character:" + getCharName()
                +"\tWeapon:" + this.getInventory().getWeapons().getName()
                +"\tArmor:" + this.getInventory().getArmors().getName()
                +"\tDamage:" + getDamage()
                +"\tHealthy:" + getHealthy()
                +"\tMoney:" + getMoney());

    }

    public int getDamage() {
        return damage+this.getInventory().getWeapons().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getReHealthy() {
        return reHealthy;
    }

    public void setReHealthy(int reHealthy) {
        this.reHealthy = reHealthy;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}

