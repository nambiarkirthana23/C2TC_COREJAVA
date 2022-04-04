import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String>list1=new HashSet();
		list1.add("kirthana");
		list1.add("manali");
		list1.add("sherlock");
		list1.add("sakshi");
		list1.add("asfiya");
		list1.add("vidya");
		
	  for(String element:list1)
		  System.out.println(element);
	}

}
