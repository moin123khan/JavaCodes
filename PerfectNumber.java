//perfect number
class PerfectNumber{
	public static void main(String[] args) {
		int a=(int)(Math.random()*10);
		int sum=0;
		System.out.println("Entered number is : "+a);
		for(int i=1;i<=(a/2);i++){
			if(a%i==0)
				sum+=i;
		}
		if(sum==a)
			System.out.print(a+" is perfect number");
		else
			System.out.print(a+" Not a perfect number");
	}
}