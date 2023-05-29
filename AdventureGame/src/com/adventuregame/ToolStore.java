package com.ahdprojects;

public class ToolStore extends NormLocation{

    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    boolean onLocation() {
        System.out.println("Welcome to the Store");
        System.out.println("1-Weapons");
        System.out.println("2-Armors");
        System.out.println("3-Exit");
        System.out.println("Enter your choose");
        int chose=input.nextInt();
        while (chose>3 || chose<1){
            System.out.println("Please enter a valid number(1-3)");
            chose=input.nextInt();
        }
        switch (chose){
            case 1:
                Weapons[] weapons={new Gun(),new Sword(),new Rifle()};
                for (Weapons weapons1:weapons){
                    System.out.println("ID: "+weapons1.getId()
                            +"\tName:" + weapons1.getName()
                            +"\tDamage:" + weapons1.getDamage()
                            +"\tMoney:" + weapons1.getMoney());
                }
                System.out.println("Which one will you take");
                int select=input.nextInt();
                while (select>3 || select<1){
                    System.out.println("Please enter a valid number(1-3)");
                    select=input.nextInt();
                }
                switch (select){
                    case 1:
                        control(new Gun());
                        break;
                    case 2:
                        control(new Sword());
                        break;
                    case 3:
                        control(new Rifle());
                        break;
                    default:
                        control(new Gun());
                        break;
                }
                break;
            case 2:
                    Armors [] armors={new Weak(),new Medium(),new Heavy()};
                for (Armors armors1:armors){
                    System.out.println("ID: "+armors1.getId()
                            +"\tName:" + armors1.getName()
                            +"\tDamage:" + armors1.getDamage()
                            +"\tMoney:" + armors1.getMoney());
                }
                System.out.println("Which one will you take");
                int select1=input.nextInt();
                while (select1>3 || select1<1){
                    System.out.println("Please enter a valid number(1-3)");
                    select1=input.nextInt();
                }
                switch (select1){
                    case 1:
                        control1(new Weak());
                        break;
                    case 2:
                        control1(new Medium());
                        break;
                    case 3:
                        control1(new Heavy());
                        break;
                    default:
                        control1(new Weak());
                        break;
                }
                break;

            case 3:
                System.out.println("We will see you again");
                break;



        }
        return true;
    }

    private void control1(Armors armors) {
        if (player.getMoney()>armors.getMoney()){
            System.out.println("You took the " +armors.getName());
            int balance=player.getMoney()-armors.getMoney();
            this.player.setMoney(balance);
            System.out.println("Your remaining money is:"+player.getMoney());
            System.out.println("Your before armors is:"+this.player.getInventory().getArmors().getName());
            this.player.getInventory().setArmors(armors);
            System.out.println("Your armor is now:"+this.player.getInventory().getArmors().getName());


        }else {
            System.out.println("You don't have enough money to take this");
        }

    }

    private void control(Weapons weapons) {
        if (player.getMoney()>weapons.getMoney()){
            System.out.println("You took the " +weapons.getName());
            int balance=player.getMoney()-weapons.getMoney();
            this.player.setMoney(balance);
            System.out.println("Your remaining money is:"+player.getMoney());
            System.out.println("Your before weapon is:"+this.player.getInventory().getWeapons().getName());
            this.player.getInventory().setWeapons(weapons);
            System.out.println("Your weapon now:"+this.player.getInventory().getWeapons().getName());


        }else {
            System.out.println("You don't have enough money to take this");
        }
    }
}
