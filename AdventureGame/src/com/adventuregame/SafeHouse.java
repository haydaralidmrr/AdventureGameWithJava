package com.ahdprojects;

public class SafeHouse extends NormLocation{

    public SafeHouse(Player player) {
        super(player,"Safe House");
    }

    @Override
    boolean onLocation() {
        player.setHealthy(player.getReHealthy());
        System.out.println("Your healthy is full now Healthy:" +player.getHealthy());
        System.out.println("Now you are in the Safe House");
        return true;
    }
}
