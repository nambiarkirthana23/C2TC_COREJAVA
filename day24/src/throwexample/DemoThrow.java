package throwexample;

public class DemoThrow

	{
		void validate(int age)
		{
			try {
				if(age<18)
				throw new ArithmeticException("not eligible");
				else
					System.out.println("eligible");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		public static void main(String[] args)
		{
			DemoThrow t=new DemoThrow();
			t.validate(12);
		}
	}
