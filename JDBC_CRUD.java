//In this we are having two classes make separate file for both classes

//first class is having connection and calling methods

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.osi.javatraining.jdbc.CRUD_Dynamic;

public class JDBCTest{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stm=null;
		ResultSet rs=null;
		PreparedStatement pstm=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle.jdbc.driver.OracleDriver
			con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.32.229:1521:DEMOVIS","scott","tiger");
			System.out.println("we have established connection!!\n");
			Scanner sc=new Scanner(System.in);
			int exit=0;
			do {
				System.out.println("\nChoose the operation:");
				System.out.println("Insert--1");
				System.out.println("Get--2");
				System.out.println("Update data--3");
				System.out.println("Delete--4");
				int input=sc.nextInt();
				switch(input) {
				case 1: CRUD_Dynamic.insertData(con,pstm);
					break;
				case 2: CRUD_Dynamic.getData(con,rs,stm);
					break;
				case 3: CRUD_Dynamic.updateData(con,pstm);
					break;
				case 4: CRUD_Dynamic.deleteData(con,pstm);
					break;
				default:System.out.println("Invalid Input"); 
				}
				System.out.println("\nWant to CRUD again?\nYes--1\nNo--0");
				exit=sc.nextInt();
			}while(exit==1);
            System.out.println("=====CRUD Terminated=====");

		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!=null) {
				try {
				rs.close();
				}catch(Exception e){}
			}
			if(stm!=null) {
				try {
				stm.close();
				}catch(Exception e){}
			}
			if(pstm!=null) {
				try {
				pstm.close();
				}catch(Exception e){}
			}
			if(con!=null) {
				try {
				con.close();
				}catch(Exception e){}
			}
		}
	}
}



//second class contains all methods 


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUD_Dynamic {
	
	private static Scanner sc=new Scanner(System.in);
	
	
	public static void insertData(Connection con,PreparedStatement pstm) throws SQLException,ClassNotFoundException{
		int exit =0;
		do {
			
			//user input
			System.out.println("\nEnter name: ");
			String name=sc.next();
			System.out.println("Enter email: ");
			String email=sc.next();
			
			//inserting
			String insert="insert into ns_jdbc values(?,?)";
			pstm=con.prepareStatement(insert);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.executeUpdate();
			System.out.println("Want to insert again?\nYes--1\nNo--0");
			exit=sc.nextInt();
		}while(exit==1);
		
		System.out.println("\nData Inserted!!");
	}
	
	
	public static void getData(Connection con,ResultSet rs,Statement stm) throws SQLException,ClassNotFoundException{
		String get_data="select * from ns_jdbc";
		stm=con.createStatement();
		rs=stm.executeQuery(get_data);
		
		System.out.println("\nName"+"\t\t"+"Email");
		System.out.println("=========================");
		while(rs.next()) {	
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
		}
		System.out.println("=========================");
		System.out.println("\nData Retrieved!!");
	}
	
	
	public static void updateData(Connection con,PreparedStatement pstm) throws SQLException,ClassNotFoundException{
		
		int exit =0;
		do {
			
			//user input
			System.out.println("\nEnter name: ");
			String name=sc.next();
			System.out.println("Enter email: ");
			String email=sc.next();
			System.out.println("Where name: ");
			String where=sc.next();
			
			//updating
			String insert="update ns_jdbc set name=? ,email=? where name=?";
			pstm=con.prepareStatement(insert);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, where);
			pstm.executeUpdate();
			System.out.println("Want to update again?\nYes--1\nNo--0");
			exit=sc.nextInt();
		}while(exit==1);
		
		System.out.println("\nData Updated!!");
	}
	
	
	public static void deleteData(Connection con,PreparedStatement pstm)throws SQLException,ClassNotFoundException {
			
		int exit =0;		
		do {
				
			//user input
			System.out.println("\nWhere name: ");
			String where=sc.next();
			
			//deleting
			String insert="delete from ns_jdbc where name=?";
			pstm=con.prepareStatement(insert);
			pstm.setString(1, where);
			pstm.executeUpdate();
			System.out.println("Want to delete again?\nYes--1\nNo--0");
			exit=sc.nextInt();
		}while(exit==1);
			
		System.out.println("\nData Deleted!!");
	}

}

