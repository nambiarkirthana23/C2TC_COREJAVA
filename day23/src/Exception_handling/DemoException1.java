package Exception_handling;

public class DemoException1 {
	public static void main(String[] args)
	{
	int a[]=new int[5];
	try
	{
	a[9]=20/3;
	}
	catch(ArrayIndexOutOfBoundsException ex)    //mutiple catches
	{
		System.out.println(ex);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("whatever you write here is executed");
	}
	int num3=10/2;
	System.out.println(num3);
	}
}
