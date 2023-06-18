//Write a function that calculates the Greatest Common Divisor of 2 numbers.
class GreatedCommonDivisor{
	public static void Bigg(int x,int y) {
		 System.out.println("first number= "+x+"\nsecond number= "+y);
         int a=(x<y)?x:y;
         int big=0;
         for(int i=1;i<=a;i++){
         	if(x%i==0 && y%i==0)
                big=i;
         }
         System.out.print("Greatest Common Divisor is : "+big);		
	}
	public static void main(String[] args) {
		int q=(int)(Math.random()*50);
		int j=(int)(Math.random()*50);
        Bigg(q,j);
	}
}