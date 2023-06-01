//In this code we are checking the probability of the random numbers
//and user entered numbers which are matched in a loop of 10.

import java.util.Scanner;

public class ProbabilityCheck {
    public void checkProbability(){ 
        Scanner sc1=new Scanner(System.in); 
        int percent=0; 
        int again; 
        do{ 
            for(int i=1;i<=10;i++){ 
                int rand1=(int)(Math.random()*10); 
                System.out.println("\nEnter the "+i+" number: "); 
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

    public static void main(String[] args) {
        ProbabilityCheck hw=new ProbabilityCheck(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("\nWELCOME!!!\nEnter \n1-->Start\n2-->Exit\n"); 
        int input1=sc.nextInt(); 
        if(input1==1){ 
            hw.checkProbability(); 
        } 
        System.out.print("Exit Successfully!!!"); 
    }
}