import java.util.LinkedList;
public class Lamdaforeach {
public static void main(String[] args)
{
	LinkedList<String> l1=new LinkedList<String>();
	l1.add("kirthana");
	l1.add("radhika");
	l1.add("akshara");
	l1.add("shreejeet");
	l1.forEach((n)->{System.out.println(n);});
}
}
