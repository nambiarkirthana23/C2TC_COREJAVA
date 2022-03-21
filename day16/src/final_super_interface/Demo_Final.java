package final_super_interface;
 class Demo
{
	 String color="white";        //parent class
	void display()
	{
		System.out.println("hello m12 batch");
	}
}
public class Demo_Final extends Demo{
	Demo_Final()             //constructor
	{
		System.out.println("iam a constructor");
	}
	void display()
	{
		System.out.println("hello");
		System.out.println(super.color);
		super.display();
	}
	final int stud_id=123;
public  static void main(String[] args)
{
	Demo_Final df=new Demo_Final();
	df.display();
}
}
