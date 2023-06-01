//checking prime numbers in a given range from user

import java.util.Scanner;

public class PrimeNumbersInAGivenRange {
    public void primeNumbers(int start,int end){
        int count=0;
        int check=0;
        for(int i=start;i<=end;i++){
            for(int j=1; j<=(i/2);j++){
                if(i%j==0){
                    check++;
                }
                if(check==2){
                    break;
                }
            }
            if(check==1){
                System.out.print(i+" ");
                count++;
            }
            check=0;
        }
        System.out.println("\nTotal: "+count);
    }
    
    public static void main(String[] args) {
        PrimeNumbersInAGivenRange hw=new PrimeNumbersInAGivenRange();
        Scanner sc=new Scanner(System.in);
        int again;
        do{
            System.out.print("From: ");
            int start=sc.nextInt();
            System.out.print("\nUpto: ");
            int end=sc.nextInt();
            hw.primeNumbers(start,end);
            System.out.println("\nContinue--->1\nExit--->0");
            again=sc.nextInt();
        }while(again!=0);
        System.out.println("Exit Successfully!!!");
    }
}