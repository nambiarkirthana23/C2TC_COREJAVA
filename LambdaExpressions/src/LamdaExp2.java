interface  Addition
{
	public int  add(int x ,int y);
}
public class LamdaExp2 {
public static void main(String[] args)
{
	Addition al= (a,b) ->{return (a+b);};
    System.out.println(al.add(10,20));
}
}
