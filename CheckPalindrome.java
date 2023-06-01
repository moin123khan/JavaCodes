import java.util.Scanner;

public class CheckPalindrome {
    public boolean isPalindrome(String in){
        boolean sendReturn= true;
        String input1=in.toLowerCase();
        char[] input2=input1.toCharArray();
        for(int i=0;i<input2.length;i++){
            if(input2[i]!=input2[input2.length-1-i]){
                sendReturn=false;
                break;
            }
        }
        return sendReturn;
    }
    
    public static void main(String[] args) {
       CheckPalindrome hm=new CheckPalindrome();
       Scanner sc=new Scanner(System.in);
       int check;
        do{
            System.out.print("Enter: ");
            String input=sc.next();
            boolean output=hm.isPalindrome(input);
            System.out.println(output);
            System.out.println("\nContinue--->1\nExit--->0\n");
            check=sc.nextInt();
        }while (check!=0);
        System.out.println("Exit Successfully!!!");
    }
}