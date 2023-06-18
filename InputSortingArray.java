//Ask the user to enter five integer values. Store the values in an array and then determine if the values 
//were entered in ascending order. Display a message indicating whether they are sorted or not.*/

class InputSortingArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] integerValues=new int[5];
		boolean isAscending=true;
		System.out.println("Enter the integer values:");
		for(int i=0;i<5;i++){
			integerValues[i]=sc.nextInt();
		}
		for(int i=0;i<(5-1);i++){                        //5-1 because we have to compare next index
			if(integerValues[i]>integerValues[i+1])
				isAscending=false;
		}
		if(isAscending==true)
			System.out.print("Values are sorted in ascending order");
		else
			System.out.print("No, values are not sorted in ascending order");
	}
}