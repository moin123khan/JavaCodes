//find sum of all odd numbers from 1 to n
class SumOfOddNumbers{
	public static void OddSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++){
        if(n%i!=0)
            sum+=i;   
		}
		System.out.print("The sum of all odd numbers from 1 to "+n+" is :"+sum);
		}
	public static void main(String[] args) {
		int n =Integer.parseInt(args[0]);
		OddSum(n);
	}
}
