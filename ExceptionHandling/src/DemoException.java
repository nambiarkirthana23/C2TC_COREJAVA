
public class DemoException {
	public static void main(String[] args) {
		   /*
			int num=50/2;
		System.out.println(num);
		
		int num1=50/10;
		System.out.println(num1); */
			
		int a[]=new int[4];
		try
		{
		int arr[]=new int[9];
		a[5]=20/0;
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
