import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
	System.out.println("enter number");
	Scanner sc=new Scanner(System.in);
     double no =sc.nextDouble();
	if(no>0)
	{
		 
		System.out.println("The number is positive.");  
	}
	else
	{
		System.out.println("The number is negative.");  
	}
	}

}
