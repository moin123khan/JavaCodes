//In this code we are playing a game with the system where gun(1)
//kills snake(2), snake(2) can drink water(3) but gun(1) cant do
//anything with water(3).

import java.util.Scanner;
import java.util.Random;

public class Game_SnakeWaterGun {
   public void playGame(){ 
        Scanner sc2=new Scanner(System.in); 
        Random r=new Random(); 
        int again; 
        do{ 
            System.out.println("Choose\n1-->Gun\n2-->Snake\n3-->Water\n"); 
            int input4=sc2.nextInt(); 
            int rand2=(int)(1+r.nextInt(3)); 
            System.out.println("Other chosen "+rand2+"\n"); 
            if(rand2==input4){ 
                System.out.println("DRAW!!!"); 
            } 
            if((rand2==1 && input4==3) || (rand2==3 && input4==1)){ 
                System.out.println("DRAW!!!"); 
            } 
            if((rand2==1 && input4==2) || (rand2==2 && input4==3)){ 
                System.out.println("Other Win!!!"); 
            } 
            if((rand2==2 && input4==1) || (rand2==3 && input4==2)){ 
                System.out.println("You Win!!!"); 
            } 
            System.out.println("\n\n0-->Exit\n1-->Continue Again\n"); 
            again=sc2.nextInt(); 
        }while (again==1); 
    } 

    public static void main(String[] args) {
        Game_SnakeWaterGun hw=new Game_SnakeWaterGun(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("\nWELCOME!!!\nEnter \n1-->Start\n2-->Exit\n"); 
        int input1=sc.nextInt(); 
        if(input1==1){ 
            hw.playGame(); 
        } 
        System.out.print("Exit Successfully!!!"); 
    }
}