package Lab1a;
import java.io.*;
import java.util.*;

public class Lab1a {
	
	String name,usn,add,email,branch;
	double fee;
	
	Lab1a(){
		name=usn=add=email=branch=" ";
		fee=0;
	}
	
	void getDetails(String name,String usn, String add, String email, String branch) {
		this.name=name;
		this.usn=usn;
		this.add=add;
		this.email=email;
		this.branch=branch;
		this.calcFee(this.branch);
	}
	
	void calcFee(String branch) {
		if(branch.equalsIgnoreCase("MCA"))
			this.fee=100000;
		else if(branch.equalsIgnoreCase("BE"))
			this.fee=150000;
		else if(branch.equalsIgnoreCase("BTECH"))
			this.fee=1200000;
		else if(branch.equalsIgnoreCase("BSC"))
			this.fee=90000;
		else
			this.fee=50000;
	}

	void display() {
		System.out.println("\n-----Student Details-----");
		System.out.print("Name :"+this.name);
		System.out.print("USN :"+this.usn);
		System.out.print("Address :"+this.add);
		System.out.print("Email :"+this.email);
		System.out.print("Branch :"+this.branch);
		System.out.print("Fees :"+this.fee);
	}
	
	public static void main(String[] args) {
		
		int ch=0;
		String name,usn,add,email,branch;

		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		Lab1a student=new Lab1a();
		try {
		while(true) {
			System.out.println("\n\n-----Menu-----");
			System.out.println("1)Enter student details\n2)Display Details\n3)Press 0 to exit\nEnter your Choice : ");
			ch=s.nextInt();
			if(ch==1) {
				System.out.println("\nEnter the details!!!");
				System.out.print("Name :");
				name=sc.next();
				System.out.print("USN :");
				usn=sc.next();
				System.out.print("Address :");
				add=sc.next();
				System.out.print("Email :");
				email=sc.next();
				System.out.print("Branch :");
				branch=sc.next();
				student.getDetails(name, usn, add, email, branch);
				}
			else if(ch==2)
				student.display();
			else if(ch==0)
				break;		
			}
		}catch(Exception e){
			e.printStackTrace();
	  }
	}
  }
