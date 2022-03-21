package Demo_Interface;
interface Worldbank
{
	void RateofInterest();
}
interface RBI
{
	void rbiRof();
}
class Phonepe implements Worldbank, RBI {
	public void RateofInterest()
	{
		System.out.println("The rate of interest for Worldbank is "+ 9.0);
	}
	public void rbiRof()
	{
		System.out.println("The rate of interest for RBI is "+8.5);
	}
	public static void main(String[] args) 
	{
		Worldbank wb=new Phonepe();    // first create object for interface
		RBI r=new Phonepe();
		wb.RateofInterest();
		r.rbiRof();			
	}
}
