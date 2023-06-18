//Program to find sum of digits of a number
class SumOfDigits{
	public static void main(String[] args) {
		int a=11+(int)(Math.random()*1000);
		int sum=0;
		System.out.print("sum of digits of "+a+" is ");
		while(a>0){
			sum+=a%10;
            a=a/10;
		}
		System.out.print(sum);
	}
}