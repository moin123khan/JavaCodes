//Print Fibonacci series till 
class Fibonacci{
	public static void main(String[] args) {
		int n=15;
		int fib0 =0;
		int fib1 =1;
		System.out.println("fibonacci series is:\n");
		for(int i=0;i<15;i++){
			System.out.println(fib0);
			int sum=fib0 + fib1;
			fib0=fib1;
			fib1=sum;
		}
	}
}