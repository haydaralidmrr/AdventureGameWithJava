package com.ahdprojects;

public abstract class Armors {
    private int id,block,money;
    private String name;

    public Armors(int id, String name,int block, int money) {
        this.id = id;
        this.name = name;
        this.block = block;
        this.money = money;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return block;
    }

    public void setDamage(int block) {
        this.block = block;
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
