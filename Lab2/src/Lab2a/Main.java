package Lab2a;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,add,email,phno,usn,branch,company,empid,designation;
		System.out.println("Enter Person Details");
		System.out.println("Name :");
		name=sc.next();
		System.out.println("Address :");
		add=sc.next();
		System.out.println("Email :");
		email=sc.next();
		System.out.println("Ph.No :");
		phno=sc.next();
		while(true) {
			System.out.println("\n\n1)Enter Student Details\n2)Enter Staff Details\n3)Press 0 to exit\nEnter your choice :");
			int ch=0;
			ch=sc.nextInt();
			if(ch==1) {
				System.out.println("USN :");
				usn=sc.next();
				System.out.println("Branch :");
				branch=sc.next();
				student s=new student(name,add,email,phno,usn,branch);
				s.fees(branch);
			}
			else if(ch==2) {
				System.out.println("Company :");
				company=sc.next();
				System.out.println("Empid :");
				empid=sc.next();
				System.out.println("Designation :");
				designation=sc.next();
				staff e=new staff(name,add,email,phno,company,empid,designation);
				e.salary();
			}
			else {
				break;
			}
			
		}
		
	}

}
