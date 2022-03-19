
public class Student {
	int rollNo;
	String name;
	String branch;
	
	void display() {
		System.out.println("Students Details");
	}
	public int getRollNo()
	{                 
	  //geter method return the value which is define in set method
		return rollNo;
		
	}
	public String getName() 
	{
		return name;
		
	}
	public String getBranch()
	{
		return branch;
	}
	public void setRollNo(int n) 
	{
		rollNo=n;
		
	}
	public void setName(String s) 
	{     
		//seter method is set The Value and declare the parameters
		name=s;
		
	}	
	public void setBranch(String b)
	{
			branch=b;
	
	}	
	

	public static void main(String[] args)
	{
		Student details=new Student();
		 
		details.setRollNo(40);                       //call the method assign the value 
		details.setName("kirthana Nambiar");
		details.setBranch("Computer");
		
		
		System.out.println("Student Roll Number ::"+details.getRollNo());  //print the data invoking the get method 
		System.out.println("Student Name ::"+details.getName());      
		System.out.println("Student Branch ::"+details.getBranch());
		
		
		

	}
}
