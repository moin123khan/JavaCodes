//add two numbers using try catch

import java.util.Scanner;
public class IntegerSumUsingTryCatch {
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter First: ");
        int input1=sc.nextInt();
        System.out.println("Enter Second: ");
        int input2=sc.nextInt();
        int result=add(input1,input2);
        System.out.println("SUM: "+result);
        }catch(Exception e){
            System.out.print("Error Occured: Please Enter Numbers only");
        }
        
        
    }
}