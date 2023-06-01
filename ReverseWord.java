//here we reverse the string words
import java.util.Scanner;

public class ReverseWord {
    public void reverseWords(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter String: ");
        String input1=sc1.nextLine();
        String[] inputStr=input1.split(" ");
        for(int i=(inputStr.length-1);i>=0;i--){
            System.out.print(inputStr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ReverseWord hw=new ReverseWord();
        int again;
        do{
            hw.reverseWords();
            System.out.println("\n\nContinue--->1\nExit--->0");
            again=sc.nextInt(); 
        }while(again!=0);
        System.out.println("Exit Successfully!!!");
    }
}