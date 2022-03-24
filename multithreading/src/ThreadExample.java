class Eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse id"+Thread.currentThread().getId());
	}
}
class MSEdge extends Thread
{
	public void run()
	{
		System.out.println("msedge id"+Thread.currentThread().getId());
	}
}
public class ThreadExample {
public static void main(String[] args)
{
	Eclipse ob=new Eclipse();
	ob.start();
	MSEdge ob1=new MSEdge();
	ob1.start();

}
}
