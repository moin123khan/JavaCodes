//here we reverse the whole string

import java.util.Scanner;

public class ReverseString {
    public void reverseStr(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter String: ");
        String input1=sc1.nextLine();
        char[] inputStr=input1.toCharArray();
        for(int i=inputStr.length-1;i>=0;i--){
            System.out.print(inputStr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReverseString hw=new ReverseString();
        int again;
        do{
            hw.reverseStr();
            System.out.println("\n\nContinue--->1\nExit--->0");
            again=sc.nextInt(); 
        }while(again!=0);
        System.out.println("Exit Successfully!!!");
    }
}