import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class DemoStream {

	public static void main(String[] args) {
		/*ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(25);
		al.add(30);
		System.out.println(al);
		//List<Integer> l1=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> l1=al.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l1);*/
		ArrayList<String> al=new ArrayList<String>();
		al.add("");
		al.add("kgufyg");
		al.add("tdgyfg");
		al.add("");
		al.add("ftrdr");
		System.out.println(al);
		long count=al.stream().filter(string->string.isEmpty()).count();
		System.out.println(count);

	}

}
