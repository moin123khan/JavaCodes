//Finding the two words are anagram or not, like silent & listen but cool & look are not.   

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    
   public boolean isAnagram(){
       Scanner sc1=new Scanner(System.in);
       System.out.println("Enter first word: ");
       String input1=sc1.next();
       System.out.println("Enter second word: ");
       String input2=sc1.next();
       if(input1.length()==input2.length()){
           String in1=input1.toLowerCase();
           String in2=input2.toLowerCase();
           char[] array1=in1.toCharArray();
           char[] array2=in2.toCharArray();
           Arrays.sort(array1);
           Arrays.sort(array2);
           String str1=new String(array1);
           String str2=new String(array2);
           if(str1.equals(str2)){
               return true;
           }else{
               return false;
           }
       }else{
           return false;
       }
   }

    public static void main(String[] args) {
        Anagram hw=new Anagram();
        Scanner sc=new Scanner(System.in);
        int again;
        do{
            boolean result=hw.isAnagram();
            System.out.println("\n"+result);
            System.out.println("\n\nContinue--->1\nExit--->0\n");
            again=sc.nextInt();
        }while(again!=0);
        System.out.println("Exit Successfully!!!");
    }
}