package com.ahdprojects;

public class Inventory {
    private Weapons weapons;
    private Armors armors;

    public Inventory() {
        this.weapons = new Weapons(0,"Punch",0,0) {
        };
        this.armors=new Armors(0,"No armors",0,0) {
        };
    }
    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public Armors getArmors() {
        return armors;
    }

    public void setArmors(Armors armors) {
        this.armors = armors;
    }
}
