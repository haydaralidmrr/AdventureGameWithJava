package com.ahdprojects;

public abstract class BattLocation extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattLocation(Player player, String name,Obstacle obstacle,String award,int maxObstacle) {
        super(player, name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
    }

    @Override
    boolean onLocation() {
        int random=randomObstacle();
        System.out.println("Now you are here:"+getName());
        System.out.println("You may see :"+random+" number :"+getObstacle().getName());
        System.out.println("<B>Battle or <R>un");
        String chose=input.nextLine();
        chose=chose.toUpperCase();
        if(chose.equals("B")){
            System.out.println("The battle will be start");
        }else {
            return false;
        }



        return true;
    }
    public int randomObstacle(){
        int random=(int) (Math.random()*this.getMaxObstacle()+1);
        return random;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
