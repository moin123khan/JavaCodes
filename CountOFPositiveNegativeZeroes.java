//Write a program to enter the numbers till the user wants and at the end 
//it should display the count of positive, negative and zeros entered.

class CountOFPositiveNegativeZeroes{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int c;
        int count_z=0,count_p=0,count_n=0;
        do{
            System.out.print("Enter the number: ");
        	int x=sc.nextInt();
            if(x==0)
    		     count_z++;
    		else if(x>0)
    			count_p++;
    	    else
    	    	count_n++;
    		System.out.println("Want to enter more?\nYes====>1\tNo====>0");
    		c=sc.nextInt();    	
        }while(c==1);
        System.out.println("Total number of positive, negative and zeros entered are :");
        System.out.print("Positives :"+count_p+"\nNegatives :"+count_n+"\nZeroes :"+count_z);

	}
}
