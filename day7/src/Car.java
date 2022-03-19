public class Car {
	int noofcars;
	String Models;
	void display()
	{
		System.out.println("welcome to ki-motars");
	}
	void display1()
	{
		System.out.println("welcome to benz");
	}
	void display2()
	{
		System.out.println("welcome to audi");
	}
	public static void main(String[] args)
	{
		Car c=new Car();
		c.display();
		c.display1();
		c.display2();
	}
}
