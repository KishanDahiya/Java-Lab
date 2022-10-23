package Lab3a;

import java.sql.*;
import java.util.*;

public class Lab3a {
	Connection con;
	Statement st;
	
	public void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/javalab";
			String username="root";
			String password="1506";
			con=DriverManager.getConnection(url,username,password);
			st = con.createStatement();
			System.out.println("Database Connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void createTable(String Tablename) {
		try {
			String query = "create table "+Tablename+" (usn varchar(20) , name varchar(30) , address varchar(30))";
			st.executeUpdate(query);
		}catch(SQLException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void insert(String USN, String Name , String Address) {
		try {
			String query1 = "insert into student values('"+USN+"','"+Name+"','"+Address+"')";
			int output = st.executeUpdate(query1);
			System.out.println(output);
		}catch(SQLException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void update(String USN,String new_address ){
		try {
			String query = "update student set address='"+new_address+"' where usn='"+USN+"'";
			int output = st.executeUpdate(query);
			System.out.println(output);
		}catch(SQLException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void display(){
		try {
			String query = "select * from student";
			ResultSet R = st.executeQuery(query);
			
			while(R.next()) {
				System.out.println(R.getString(1)+"\t"+R.getString(2)+
						"\t"+R.getString(3));
			}
		}catch(SQLException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void drop_table(){
		try {
			String query = "drop table student";
			int output = st.executeUpdate(query);
			System.out.println(output);
		}catch(SQLException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void delete(String USN){
		try {
			String query = "delete from student where usn='"+USN+"'";
			int output = st.executeUpdate(query);
			System.out.println(output);
		}catch(SQLException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Lab3a s1 = new Lab3a();
		s1.getConnection();
		while(true) {
			try {
				System.out.println("Enter your choice\n1.Insert\n2.Update\n3.Display\n4.Delete\n5.Create Student Table\n6.Drop Table");
				int ch = sc.nextInt();
				
				if(ch==1) {
					String USN,Name,Address;
					System.out.println("Enter USN : ");
					USN = sc.next();
					System.out.println("Enter Name : ");
					Name = sc.next();
					System.out.println("Enter Address : ");
					Address = sc.next();
					s1.insert(USN, Name, Address);
				}
				
				if(ch==2) {
					String USN,new_address;
					System.out.println("Enter USN : ");
					USN = sc.next();
					System.out.println("Enter New Address : ");
					new_address = sc.next();
					s1.update(USN, new_address);
				}
				if(ch==3) {
					System.out.println("USN\t\tName\t\tAddress");
					s1.display();
				}
				if(ch==4) {
					String USN;
					System.out.println("Enter the usn number to delete : ");
					USN = sc.next();
					s1.delete(USN);
					System.out.println(USN+" data row is deleted");
				}
				
				if(ch==5) {
					String Tablename;
					System.out.println("Enter Table Name : ");
					Tablename = sc.next();					
					s1.createTable(Tablename);
					System.out.println(Tablename+" Table is created");
				}if(ch==6) {
					s1.drop_table();
					System.out.println("Table is deleted");
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}

}