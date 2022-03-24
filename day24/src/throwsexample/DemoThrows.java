package throwsexample;

import java.io.IOException;

public class DemoThrows {
	void m1(int num)throws IOException,ClassNotFoundException
	{
		if(num==1)
			throw new IOException("IOException has occurred");
			else
				throw new ClassNotFoundException("class has not found");
	}
	public static void main(String[] args)
	{
			try {
				DemoThrows dt=new DemoThrows();
				dt.m1(1);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
