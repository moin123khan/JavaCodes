package com.MultiThreading;
import java.util.Scanner;
public class ArrayInsertion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n+1];
		System.out.println("enter values5");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Entered array is:");
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]+" ");
		}
		System.out.println("enter the index");
		int k=sc.nextInt();
		System.out.println("enter the value");
		int v=sc.nextInt();
		for(int i=0;i<n+1;i++) {
			if(i<k) {
				arr2[i]=arr1[i];
			}
			else if(i==k){
				arr2[i]=v;
			}
			else if(i>k){
				arr2[i]=arr1[i-1];
			}
			else {
				System.out.println("entered index not present in array");
			}
		}
		System.out.println("updated array is:");
		for(int i=0;i<n+1;i++) {
			System.out.println(arr2[i]+" ");
		}
		sc.close();
	}
}
