public class Add {
	public void add(int x,int y)
	{
		System.out.println("Add is "+(x+y));
	}
	public void add(int x,int y,int z)
	{
		System.out.println("Add is "+(x+y+z));
	}
	public void add(int x,int y,int z,int q)
	{
		System.out.println("Add is "+(x+y+z+q));
	}
	public static void main(String[] args)
	{
		Add a=new Add();
		a.add(5,5);
		a.add(5, 5,5);
		a.add(5,5,6,8);
	}
}
