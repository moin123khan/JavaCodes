//find factorial with recursion

class FactorialRecursion{
	public static int factorial(int x) {
		int total;
		if(x==1)
			total=1;
		else
			total=x*factorial(x-1);

		return total;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the factorial number: ");
		int fact=sc.nextInt();
		System.out.print("factorial of "+fact+" is "+factorial(fact));
	}
}