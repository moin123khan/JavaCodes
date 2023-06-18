//Find the factorial of a number
class FindFactorial{
	public static void main(String[] args) {
		int a=1+(int)(Math.random()*10);
	    int count=1;
	    for(int i=1;i<=a;i++){
	    	count*=i;
	    }
	    System.out.print("factorial of "+a+" is "+count);
	}
}

