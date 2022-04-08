
interface Name
{
	public void show();
}
public class LamdaExp1 {
	public static void main(String[] args) {
		Name na = () -> {System.out.println("My name is kirthana S Nambiar");};
		//Name na = () ->System.out.println("My name is kirthana S Nambiar");
		na.show();
	}

}
