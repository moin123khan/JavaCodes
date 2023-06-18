//pattern questns

//Q1 print * in x rows y columns matrix=================================================================== 
/*import java.util.*;
class Matrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int x =sc.nextInt();
		System.out.print("Enter number of coloumns: ");
		int y=sc.nextInt();
		
		for(int i=0;i<x;i++){
            
            for(int j=0;j<y;j++){
			System.out.print("*");
			//if(j==(y-1))                  //this 
			// System.out.print("\n");		//this
			}
		    System.out.println();           //this
		}
	}
}
// line 17 18 or line 20 can be written for next line

*/




//Q2 print * in boundary of any matrix using command line arguments===============================================
/*import java.util.*;
class Boundary{
	public static void main(String[] args) {
		
       //using command line arguments
		int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);

  //       //using scanner
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter number of rows: ");
		// int x =sc.nextInt();
		// System.out.print("Enter number of coloumns: ");
		// int y=sc.nextInt();
		for(int i=1;i<=x;i++){
			for(int j=1;j<=y;j++){
				if(j==1 || i==1 || j==y || i==x)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}*/


//Q3 print half pyramid using command line argument==================================================================

// import java.util.*;
// class Star{
// 	public static void main(String[] args) {
//     int a=Integer.parseInt(args[0]);
//     for(int i=1;i<=a;i++){
//     	for(int j=1;j<=i;j++){
//     		System.out.print("*");

//     	}
//     	System.out.println();
//     }		
// 	}
// }



// ================================================================================================================
// class StarRev{
// 	public static void main(String[] args) {
// 		int a=Integer.parseInt(args[0]);
// 		for(int i=a;i>=1;i--){
			
// 			//for(int j=i;j>=1;j--){              //OR
			
// 			for(int j=1;j<=i;j++){                //this
				
// 				System.out.print("*");
// 			}
// 		System.out.println();
// 		}
// 	}
// }






//Q self print half * half .=======================================================================================
// class StarDot{
// 	public static void main(String[] args) {
//     int a=Integer.parseInt(args[0]);
//     int b=Integer.parseInt(args[1]);
//     for(int i=1;i<=a;i++){
//     	for(int j=1;j<=b;j++){
//     		if(j<=i)
//     		System.out.print("*");
//             else
//             System.out.print(".");	
//     	}
//     	System.out.println();
//     }		
// 	}
// }


// ====================================================================================================
// class RevStar{
// 	public static void main(String[] args) {
// 		int a=Integer.parseInt(args[0]);
// 		for(int i=1;i<=a;i++){
// 			for(int j=1;j<=a-i;j++){
// 				System.out.print(" ");
// 			}
// 			for(int k=1;k<=i;k++){
// 				System.out.print("*");
// 			}
// 			System.out.println();
// 		}
// 	}
// }


//print numbers in pyramid================================================================================
// class Numb{
// 	public static void main(String[] args) {
// 		int x=Integer.parseInt(args[0]);
// 		for(int i=1;i<=x;i++){
// 			for(int j=1;j<=i;j++){
// 				System.out.print(j);
// 			}
// 			System.out.println();
// 		}
// 	}
// }



//print reverse pyramid numbers=============================================================================
// class RevNumb{
// 	public static void main(String[] args) {
// 		int a=Integer.parseInt(args[0]);
// 		for(int i=a;i>=1;i--){           //also for(int i=1;i<=a;i++){
// 			for(int j=1;j<=i;j++){       //then for(int j=1;j<=a-i+1;j++){ 
// 				System.out.print(j);
// 		    }
// 		    System.out.println();   
// 		}
// 	}
// }



//print floyds pattern========================================================================================
// class Floyd{
// 	public static void main(String[] args) {
// 		int a = Integer.parseInt(args[0]);
// 		int num=1;    
// 		    for(int i=1;i<=a;i++){
// 		       for(int j=1;j<=i;j++){
// 		       	   System.out.print(num+"\t");
// 		       	   num++;
// 		       }
// 		    System.out.println();

// 		}
// 	}
// }


//print 10101 in a pyramid===================================================================================
// class mat{
// 	public static void main(String[] args) {
// 	        int a=Integer.parseInt(args[0]);
// 	        for(int i=1;i<=a;i++){
// 	        	for(int j=1;j<=i;j++){
// 	        		if((i+j)%2==0)
// 	        			System.out.print("1");
// 	        		else 
// 	        			System.out.print("0");
// 	        	}
// 	        System.out.println();
// 	        }     	
// 	}
// }