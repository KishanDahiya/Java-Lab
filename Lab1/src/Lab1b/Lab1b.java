package Lab1b;

import java.io.*;
import java.util.*;

public class Lab1b {

	String name,usn,add,email,phno,branch;
	double fee,additional_fee,exam_fee,total_fee;
	static String c_name,c_add,c_phno;
	boolean bool=true;

	//Static Keyword Used
	static {
		c_name="RV College of Engineering";
		c_add="Mysuru Road, Beside Pattanagere Metro Station, Bengaluru";
		c_phno="79138313";
	}
	Lab1b(){
		name=usn=add=email=branch=" ";
		fee=0;
	}	
	
	//Constructor Overloading
	Lab1b(String name,String usn, String add, String branch){
		this.name=name;
		this.usn=usn;
		this.add=add;
		this.branch=branch;
		this.calcFee(this.branch);
		this.email="";
		this.phno="";
		
	}
	
	Lab1b(String name,String usn, String add, String email, String phno, String branch){
		this.name=name;
		this.usn=usn;
		this.add=add;
		this.email=email;
		this.phno=phno;
		this.branch=branch;
		this.calcFee(this.branch);
	}
	
	//Calculating Fee
	void calcFee(String branch) {
		additional_fee=12000;
		exam_fee=6000;
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
		this.total_fee=fee+additional_fee+exam_fee;
	}
	
	//Method Overloading
	public void display() {
		System.out.println("\n-----Student Details-----");
		System.out.print ("Name :"+this.name);
		System.out.println("USN :"+this.usn);
		System.out.println("Address :"+this.add);
		while(bool) {
			bool=false;
			if(this.email.equalsIgnoreCase("") && this.phno.equalsIgnoreCase("")) {
				continue;
			}
		System.out.println("Email :"+this.email);
		System.out.println("Ph.No :"+this.phno);
		}
		System.out.println("Branch :"+this.branch);
		System.out.println("Fees :"+this.fee);
		System.out.println("-----College Details-----");
		System.out.println("College :"+c_name);
		System.out.println("College Address :"+c_add);
		System.out.println("College Ph.No :"+c_phno);
	}
	
	public void display(int i) {
		if(i==1) {
			System.out.println("-----Student Details-----");
			System.out.println("Name :"+this.name);
			System.out.println("USN :"+this.usn);
			System.out.println("Address :"+this.add);
			while(bool) {
				bool=false;
				if(this.email.equalsIgnoreCase("") && this.phno.equalsIgnoreCase("")) {
					continue;
				}
			System.out.println("Email :"+this.email);
			System.out.println("Ph.No :"+this.phno);
			}
			System.out.println("Branch :"+this.branch);
			System.out.println("Fees :"+this.fee);
			}
		else if(i==2) {
			System.out.println("-----College Details-----");
			System.out.println("College :"+c_name);
			System.out.println("College Address :"+c_add);
			System.out.println("College Ph.No :"+c_phno);
		}
	}
	
	public static void main(String[] args) {

		int ch=0;
		String name,usn,add,email,phno,branch;
		Lab1b student;
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		try {
			System.out.println("Enter the details!!!");
			System.out.print("Name :");
			name=sc.next();
			System.out.print("USN :");
			usn=sc.next();
			System.out.print("Address :");
			add=sc.next();
			System.out.print("Branch :");
			branch=sc.next();
			System.out.println("Do you wish to enter email and phno?(Yes/No)");
			String ans="";
			ans=s.next();
			if(ans.equalsIgnoreCase("Yes")) {
				System.out.print("Email :");
				email=sc.next();
				System.out.print("Ph.No :");
				phno=sc.next();
				student= new Lab1b(name, usn, add, email, phno, branch);
				}
			else{
				student=new Lab1b(name, usn, add, branch);
				}
			while(true) {
				System.out.println("\n-----Menu-----");
				System.out.println("1)Display all Details\n2)Display Few Details\n3)Press 0 to exit\nEnter your Choice : ");
				ch=s.nextInt();
				if(ch==1)
					student.display();
				else if(ch==2) {
					int a=0;
					System.out.println("1)Display Student Details\n2)Display College Details");
					a=s.nextInt();
					if(a==1){
						student.display(1);
						}
					else if(a==2) {
						student.display(2);
						}
					}
				else if(ch==0)
					break;		
				}
			}catch(Exception e){
				e.printStackTrace();
		  }
	}

}



//package Lab1b;
//
//import java.io.*;
//import java.util.*;
//
//public class Lab1b {
//
//	String name,usn,add,email,phno,branch;
//	double fee,additional_fee,exam_fee,total_fee;
//	static String c_name,c_add,c_phno;
//	boolean bool=true;
//
//	//Static Keyword Used
//	static {
//		c_name="RV College of Engineering";
//		c_add="Mysuru Road, Beside Pattanagere Metro Station, Bengaluru";
//		c_phno="79138313";
//	}
//	Lab1b(){
//		name=usn=add=email=branch=" ";
//		fee=0;
//	}	
//	
//	//Constructor Overloading
//	Lab1b(String name,String usn, String add, String branch){
//		this.name=name;
//		this.usn=usn;
//		this.add=add;
//		this.branch=branch;
//		this.calcFee(this.branch);
//		this.email="";
//		this.phno="";
//		
//	}
//	
//	Lab1b(String name,String usn, String add, String email, String phno, String branch){
//		this.name=name;
//		this.usn=usn;
//		this.add=add;
//		this.email=email;
//		this.phno=phno;
//		this.branch=branch;
//		this.calcFee(this.branch);
//	}
//	
//	//Calculating Fee
//	void calcFee(String branch) {
//		additional_fee=12000;
//		exam_fee=6000;
//		if(branch.equalsIgnoreCase("MCA"))
//			this.fee=100000;
//		else if(branch.equalsIgnoreCase("BE"))
//			this.fee=150000;
//		else if(branch.equalsIgnoreCase("BTECH"))
//			this.fee=1200000;
//		else if(branch.equalsIgnoreCase("BSC"))
//			this.fee=90000;
//		else
//			this.fee=50000;
//		this.total_fee=fee+additional_fee+exam_fee;
//	}
//	
//	//Method Overloading
//	public void display() {
//		System.out.println("\n-----Student Details-----");
//		System.out.println("Name :"+this.name);
//		System.out.println("USN :"+this.usn);
//		System.out.println("Address :"+this.add);
//		while(bool) {
//			bool=false;
//			if(this.email.equalsIgnoreCase("") && this.phno.equalsIgnoreCase("")) {
//				continue;
//			}
//		System.out.println("Email :"+this.email);
//		System.out.println("Ph.No :"+this.phno);
//		}
//		System.out.println("Branch :"+this.branch);
//		System.out.println("Fees :"+this.fee);
//		System.out.println("\n-----College Details-----");
//		System.out.println("College :"+c_name);
//		System.out.println("College Address :"+c_add);
//		System.out.println("College Ph.No :"+c_phno);
//	}
//	
//	public void display(int i) {
//		if(i==1) {
//			System.out.println("\n-----Student Details-----");
//			System.out.println("Name :"+this.name);
//			System.out.println("USN :"+this.usn);
//			System.out.println("Address :"+this.add);
//			while(bool) {
//				bool=false;
//				if(this.email.equalsIgnoreCase("") && this.phno.equalsIgnoreCase("")) {
//					continue;
//				}
//			System.out.println("Email :"+this.email);
//			System.out.println("Ph.No :"+this.phno);
//			}
//			System.out.println("Branch :"+this.branch);
//			System.out.println("Fees :"+this.fee);
//			}
//		else if(i==2) {
//			System.out.println("\n-----College Details-----");
//			System.out.println("College :"+c_name);
//			System.out.println("College Address :"+c_add);
//			System.out.println("College Ph.No :"+c_phno);
//		}
//	}
//	
//	public static void main(String[] args) {
//
//		int ch=0;
//		String name,usn,add,email,phno,branch;
//		Lab1b student;
//		Scanner s=new Scanner(System.in);
//		Scanner sc=new Scanner(System.in).useDelimiter("\n");
//		try {
//			while(true) {
//				System.out.println("\nEnter the details!!!");
//				System.out.print("Name :");
//				name=sc.next();
//				System.out.print("USN :");
//				usn=sc.next();
//				System.out.print("Address :");
//				add=sc.next();
//				System.out.print("Branch :");
//				branch=sc.next();
//				System.out.println("Do you wish to enter email and phno?(Yes/No)");
//				String ans="";
//				ans=s.next();
//				if(ans.equalsIgnoreCase("Yes")) {
//					System.out.print("Email :");
//					email=sc.next();
//					System.out.print("Ph.No :");
//					phno=sc.next();
//					student= new Lab1b(name, usn, add, email, phno, branch);
//					}
//				else{
//					student=new Lab1b(name, usn, add, branch);
//					}
//				System.out.println("\n\n-----Menu-----");
//				System.out.println("2)Display all Details\n3)Display Few Details\n4)Press 0 to exit\nEnter your Choice : ");
//				ch=s.nextInt();
//				if(ch==2)
//					student.display();
//				else if(ch==3) {
//					int a=0;
//					System.out.println("1)Display Student Details\n2)Display College Details");
//					a=sc.nextInt();
//					if(a==1){
//						student.display(1);
//						}
//					else if(a==2) {
//						student.display(1);
//						}
//					}
//				else if(ch==0)
//					break;		
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//		  }
//	}
//
//}
