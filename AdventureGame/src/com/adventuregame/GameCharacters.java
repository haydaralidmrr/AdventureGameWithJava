package com.ahdprojects;

public abstract class GameCharacters {
    private int id,money,healthy,damage;
    private String charName;

    public GameCharacters(int id,String charName, int money, int healthy, int damage) {
        this.id = id;
        this.charName = charName;
        this.money = money;
        this.healthy = healthy;
        this.damage = damage;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
