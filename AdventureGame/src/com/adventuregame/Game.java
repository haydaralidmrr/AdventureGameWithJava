package com.ahdprojects;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner input=new Scanner(System.in);
    void login(){
        System.out.println("Welcome to the game");
        player=new Player();
        player.selectChar();
    }
    void start(){
        location=null;
       while (true){
           System.out.println();
           System.out.println("==========================");
           System.out.println();
           System.out.println("You need to choose a location to start the game");
           System.out.println("1-Safe Home--> the house that you have no enemy");
           System.out.println("2-Cave--> There will be a zombie");
           System.out.println("3-Forest--> There will be a vampire");
           System.out.println("4-River--> There will be a bear");
           System.out.println("5-Store--> You can purchase something");
           System.out.println("Where do you wanna go?");
           int sellect=input.nextInt();
           while (sellect>5 || sellect<1){
               System.out.println("Enter a number that between 1-5");
               sellect=input.nextInt();
           }
           switch (sellect){
               case 1:
                   location=new SafeHouse(player);
                   break;
               case 2:
                   location=new Cave(player);
                   break;
               case 3:
                   location=new Forest(player);
                   break;
               case 4:
                   location=new River(player);
                   break;
               case 5:
                   location=new ToolStore(player);
                   location.onLocation();
                   break;
               default:
                   location=new SafeHouse(player);

           }
           if(!location.onLocation()){
               System.out.println("Game Over!");
               break;
           }

       }


    }

}
