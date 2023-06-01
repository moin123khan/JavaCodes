//In this we are finding the last word in a sentence entered by user

import java.util.Scanner;

public class ReturnLastWord {
    
    public void lastWord(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String input=sc1.nextLine();
        String[] returnLast=input.split(" ");
        int len=returnLast.length;
        String print=returnLast[len-1];
        System.out.println("Last word: "+print);
    }

    public static void main(String[] args) {
        ReturnLastWord hw=new ReturnLastWord();
        Scanner sc=new Scanner(System.in);
        int again;
        do{
            hw.lastWord();
            System.out.println("\nContinue--->1\nExit--->0");
            again=sc.nextInt();
        }while(again!=0);
        System.out.println("Exit Successfully!!!");
    }
}