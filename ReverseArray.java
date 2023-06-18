//Reverse an array
class ReverseArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.print("Enter the values: ");
		for(int i=0;i<5;i++){
		arr[i]=sc.nextInt();
		}
		System.out.println("entered array is:");
		for(int value:arr){
			System.out.print(value+" ");
		}
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[arr.length-i-1];
			arr[arr.length-i-1]=arr[i];
			arr[i]=temp;

		}
		System.out.println("\nreversed array is: ");
		for(int value:arr){
			System.out.print(value+" ");
		}
	}
}
