package com.ahdprojects;

import java.util.Scanner;

public abstract class Location {
    Player player;
    private String name;
    static Scanner input=new Scanner(System.in);

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        Location.input = input;
    }

    abstract boolean onLocation();

}
