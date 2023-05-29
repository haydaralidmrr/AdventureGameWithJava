package com.ahdprojects;

public abstract class Weapons {
    private int id,damage,money;
    private String name;

    public Weapons(int id,String name, int damage, int money) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
