package Lab2a;

public class staff extends person implements instaff{
	String company,empid,designation;
	int salary;
	public staff(String name, String add, String email, String phno,String company,String empid,String designation) {
		super(name, add, email, phno);
		this.company=company;
		this.empid=empid;
		this.designation=designation;
	}

	@Override
	public void salary() {
		this.salary=56000;
		super.display();
		System.out.println("Company :"+this.company);
		System.out.println("Empid :"+this.empid);
		System.out.println("Designation :"+this.designation);
		System.out.println("Salary :"+this.salary);
	}

}
