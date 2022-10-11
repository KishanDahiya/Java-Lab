package Lab2a;

public class student extends person implements instudent{
	String usn,branch;
	public student(String name , String add , String email , String phno,String usn , String branch) 
	{
		super(name,add,email,phno);
		this.usn = usn;
		this.branch = branch;
	}
	@Override
	public void fees(String branch) {
		// TODO Auto-generated method stub
		int fee=0;
		if(branch.equalsIgnoreCase("MCA"))
			fee=100000;
		else if(branch.equalsIgnoreCase("BE"))
			fee=150000;
		else if(branch.equalsIgnoreCase("BTECH"))
			fee=1200000;
		else if(branch.equalsIgnoreCase("BSC"))
			fee=90000;
		else
			fee=50000;
		super.display();
		System.out.println("USN :"+this.usn);
		System.out.println("Branch :"+this.branch);
		System.out.println("Fee :"+fee);
		
	}
}
