package com.linkList;
import java.util.Scanner;
public class LinkedList { //delete element at the start,end,specific location
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node head=null;
	
	public void creation() {
		int data1,n;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter data");
			data1=sc.nextInt();
			Node new_node=new Node(data1);
			if(head==null) {
				head=new_node;
			}else {
				System.out.println("press\n1---->begin\n2---->end\n3---->particular index");
				int m=sc.nextInt();
				switch(m)
				{
				case 1:
					new_node.next=head;
					head=new_node;
					break;
				case 2:
					Node temp=head;
					while(temp.next!=null){
						temp=temp.next;
					}
					temp.next=new_node;
					break;
				case 3:
					Node temp1=head;
					System.out.println("enter the position");
					int p=sc.nextInt();
					for(int i=0;i<(p-1);i++) {
						temp1=temp1.next;
					}
					new_node.next=temp1.next;
					temp1.next=new_node;
					break;
				}		
			}
			System.out.println("want to add more than enter 1");
			n=sc.nextInt();
		}while(n==1);
	 }
	
	
	public void deletion() {
		int n;
		Scanner sc=new Scanner(System.in);
		do {
			if(head==null) {
				System.out.println("no LL exists");
			}else {
				System.out.println("Enter to delete\n1...begin\n2...end\n3...specific");
				int m=sc.nextInt();
				switch(m) 
				{
				case 1:
					Node temp=head;
					temp=temp.next;
					head=temp;
					break;
				case 2:
					Node temp1=head;
					Node ptr=temp1.next;
					while(ptr.next!=null) {
						temp1=ptr;
						ptr=ptr.next;
					}
					temp1.next=null;
					break;
				case 3:
					System.out.println("enter position");
					 int p=sc.nextInt();
					Node temp2=head;
					Node ptr1=temp2.next;
					for(int i=0;i<(p-2);i++) {
						temp2=ptr1;
						ptr1=ptr1.next;
					}
					temp2.next=ptr1.next;
					break;
				}
			}
			System.out.println("want to delete more..press--->1");
			n=sc.nextInt();
		}while(n==1);
		sc.close();
	}


	
	public void transverse() {
		 Node temp=head;
		 if(temp==null) {
			 System.out.println("list not exists");
		 }
		 else {
			 while(temp!=null) {
				 System.out.print(temp.data+" ");
				 temp=temp.next;
			 }
		 }		 
	 }
	
	
	
	
	
	public static void main(String[] args) {
		ThirdClass fc=new ThirdClass();
		fc.creation();
		fc.deletion();
		fc.transverse();			
	}	
}




