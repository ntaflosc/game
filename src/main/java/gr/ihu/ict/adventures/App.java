package gr.ihu.ict.adventures;


import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        // System objects TODO:delete this comment after

        Scanner in =new Scanner(System.in);
        Random rand = new Random();

        //Game variables TODO:delete this comment after

        String[] enemies = {"Monster","Slime","Guard","Assassin","Tree Sentinel"};

        //TODO: na kanoume to player kai ta enemies se classes

        int maxEnemyHP = 75;
        int enemyAD = 25;
        //Player Stats
        int playerHP= 100;
        int playerAD= 50;

        /*int numHealthPots = 3;
        int healthPotionHealthAmount = 30;
        int healthPotionDropChance = 45; //percentage!!!!!!
         */

        boolean running = true;

        System.out.println("Welcome to the world");

        GAME:
        while(running){
            System.out.println("----------------------------------------------------------");

            int enemyHP =rand.nextInt(maxEnemyHP);
            String enemy = enemies[rand.nextInt(enemies.length)];
            //edw boroume na valoume random munhmata opos h parapanw grammh mesa apo pinaka TODO:delete this comment after
            System.out.println("\t# A "+enemy+" approached you!#\n");
            while(enemyHP > 0){
                System.out.println("\tYour HP :" + playerHP);
                System.out.println("\t"+ enemy +"'s HP:"+enemyHP);
                System.out.println("\n\tWhat are you going to do?");
                System.out.println("\t1.Attack");
                System.out.println("\t2.Drink HP potion");
                System.out.println("\t3.RUN!!!!");

                //grabs the next line from the keayboard TODO:delete this comment after

                String input = in.nextLine();

                if(input.equals("1")){

                }
                else if(input.equals("2")){

                }
                else if(input.equals("3")){

                }
                else {

                }

            }






        }






    }
}
