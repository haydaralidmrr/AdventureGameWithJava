package com.ahdprojects;

public class Obstacle{
    private int id,damage,healthy;
    private String name;

    public Obstacle(int id,String name, int damage, int healthy ) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.healthy = healthy;
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

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
