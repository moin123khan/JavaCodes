//In this code we are giving two options to user 
//whether to check probability or to play game i.e Snake water gun.

import java.util.*; 

public class ProbabilityAndGame { 
public void checkProbability(){ 
        Scanner sc1=new Scanner(System.in); 
        int percent=0; 
        int again; 
        do{ 
            for(int i=1;i<=10;i++){ 
                int rand1=(int)(Math.random()*10); 
                System.out.println("Enter the "+i+" number: "); 
                int input3=sc1.nextInt(); 
                if(input3==rand1){ 
                    percent++; 
                } 
            } 
            System.out.println("The Probability is "+(percent*10)+"%\n");    
            System.out.println("0-->Exit\n1-->Continue Again"); 
            again=sc1.nextInt(); 
        }while (again==1); 
    }  
     

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

     
    public static void main(String[] args){ 
        ProbabilityAndGame hw=new ProbabilityAndGame(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("\nWELCOME!!!\nEnter \n1-->Start\n2-->Exit\n"); 
        int input1=sc.nextInt(); 
        if(input1==1){ 
            System.out.println("Enter \n1-->Play Game\n2-->Check Probability\n3-->Exit"); 
            int input2=sc.nextInt(); 
            switch (input2){ 
                case 1: hw.playGame(); 
                break; 
                case 2: hw.checkProbability(); 
                break; 
                default: break; 
                } 
        } 
        System.out.print("Exit Successfully!!!"); 
    } 
} 