package Lab2a;

public class person {
	String name,add,email,phno;
	
	public person(String name,String add,String email,String phno) {
		this.name=name;
		this.add=add;
		this.email=email;
		this.phno=phno;
	}
	
	public void display() {
		System.out.println("Name :"+this.name);
		System.out.println("Address :"+this.add);
		System.out.println("Email :"+this.email);
		System.out.println("Ph.No :"+this.phno);
	}

}
