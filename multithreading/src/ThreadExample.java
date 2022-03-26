/*
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
*/
class Eclipse implements Runnable
{
	public void run()
	{
		System.out.println("Eclipse id"+Thread.currentThread().getId());
	}
}
class MSEdge implements Runnable
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
	Thread t=new Thread(ob);
	t.setPriority(Thread.MIN_PRIORITY);
	t.start();
	
	MSEdge ob1=new MSEdge();
	Thread t1=new Thread(ob1);
	t1.setPriority(Thread.MAX_PRIORITY);
	t1.start();

}
}
