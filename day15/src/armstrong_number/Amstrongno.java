package armstrong_number;

public class Amstrongno {
public static void main (String[] args)
{
int no=153;
int temp=no;
int r;
int sum=0;
while(no>0)
{
	r=no%10;
	no=no/10;
	sum=sum+r*r*r;
}
if(temp==sum)
{
	System.out.println("number is armstrong number");
}
else
{
	System.out.println("number is not  armstrong number");
}
}
}
