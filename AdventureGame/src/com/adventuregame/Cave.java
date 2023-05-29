package com.ahdprojects;

public class Cave extends BattLocation{

    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food",3);
    }
}
