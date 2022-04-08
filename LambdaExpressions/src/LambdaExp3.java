interface 	Square
{
	public int square(int a);
}
public class LambdaExp3 {
public static void main(String[] args)
{
	Square sa=a ->{return (a*a);};
	System.out.println("The square of 20 is " + sa.square(20));
}
}
