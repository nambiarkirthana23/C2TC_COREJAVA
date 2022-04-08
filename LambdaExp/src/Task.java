 interface Pi
{
	public double getPivalue();
}
public class Task {

	public static void main(String[] args) {
	   Pi i;
       i=()->3.14;
       System.out.println("value of pi ="+i.getPivalue());
	}

}
