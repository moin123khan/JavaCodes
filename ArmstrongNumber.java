//Program to Check Armstrong number

class ArmstrongNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		String amstrongNumber=sc.next();
		int lengthNumber=amstrongNumber.length();
		int sum=0;
		int inputNumber=Integer.parseInt(amstrongNumber);
		int inputNumber1=0+inputNumber;
		// System.out.print(lengthNumber);
		do{
			for(int j=1;j<=lengthNumber;j++){
				int numberDigit=inputNumber%10;
				sum+=(int)(Math.pow(numberDigit,lengthNumber));
				inputNumber=inputNumber/10;
			}
		}while(inputNumber>0);
		if(sum==inputNumber1)
			System.out.print("amstrong number");
		else
			System.out.print("Not a amstrong number");
	}
}


