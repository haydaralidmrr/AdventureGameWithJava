package com.ahdprojects;

public abstract class NormLocation extends Location{


    public NormLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    boolean onLocation() {
        return true;
    }
}
