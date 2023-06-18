//take input as much as their input in int and then find mean of total numbers
import java.util.*;
class mean{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        int sum=0;
        int count=1;
		while(sc.hasNextInt()){
			int num=sc.nextInt();
			sum+=num;
			count++;
	   	}
	    int mean=sum/count;
		System.out.print(mean);

	}
}