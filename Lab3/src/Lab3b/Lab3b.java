package Lab3b;
import java.sql.*;
import java.util.*;

public class Lab3b {
	Connection con;

	public Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/javalab";
			String username="root";
			String password="1506";
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Database Connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
	//Display Data
	public void display() {
		try {
			con=getConnect();
			String query="Select * from student";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			System.out.println("\nUSN\t\tName\t\tAddress");
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	//Insert Data
	public void insert(String usn,String name,String address) {
		try {
			con=getConnect();
			String query="insert into student values(?,?,?)";
			int nameLen=15;
			int addressLen=15;
			int Nlen=name.length();
			int Alen=name.length();
			PreparedStatement ps=con.prepareStatement(query);
			if(Nlen>nameLen) {
				throw new myException("Name is too big, enter only 15 characters.");
			}
			if(Alen>addressLen) {
				throw new myException("Address is too big, enter only 15 characters.");
			}
			ps.setString(1, usn);
			ps.setString(2, name);
			ps.setString(3, address);
			int i=ps.executeUpdate();
			System.out.println(i);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	//Update Data
	public void update(String name,String usn) {
		try {
			con=getConnect();
			String query="update student set name=? where usn=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, usn);
			int i=ps.executeUpdate();
			System.out.println(i);
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//Delete Data
	public void delete(String usn) {
		try {
			con=getConnect();
			String query="delete from student where usn=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, usn);
			if(usn.equalsIgnoreCase("null")) {
				throw new myException("USN is empty");
			}
			int i=ps.executeUpdate();
			System.out.println(i);
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String usn,name,address;
		int ch;
		// TODO Auto-generated method stub
		while(true){
			Lab3b obj = new Lab3b();
			System.out.println("\n1:Insert\n2:Display\n3:Update\n4:Delete\n5:Press 0 to exit\nEnter your choice : ");
			ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("Enter details\nUSN :");
				usn=sc.next();
				System.out.println("Name :");
				name=sc.next();
				System.out.println("Address :");
				address=sc.next();
				obj.insert(usn,name,address);
			}
			else if(ch == 2) {
				obj.display();
			}
			else if(ch == 3) {
				System.out.println("Enter details where you wanna update\nUSN :");
				usn=sc.next();
				System.out.println("Name :");
				name=sc.next();
				obj.update(name,usn);
			}
			else if(ch == 4) {
				System.out.println("Enter usn which u wanna delete\nUSN :");
				usn=sc.next();
				obj.delete(usn);
			}
			else if(ch == 0)
				break;
		}
		sc.close();

	}

}