class Notepad implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		System.out.println("Notepad id"+Thread.currentThread().getId());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class ThreadExample1 {
public static void main(String[] args)
{
	Notepad ob=new Notepad();
	Thread t=new Thread(ob);
	t.start();
}
}
