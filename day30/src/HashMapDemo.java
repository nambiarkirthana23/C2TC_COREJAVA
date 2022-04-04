import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main (String[] args) {
    HashMap<String,Integer> hmap =new HashMap<String,Integer>();
	hmap.put("Kirthana",23);
	hmap.put("radhika",24);
    hmap.put("manali",23);
    hmap.put("sherlock",23);
    hmap.put("achu",23);
    hmap.put("shreejeet",23);
    hmap.put("kutta",23);
    hmap.put("pari",23);
    hmap.put("dhanu",23);
    System.out.println("Name of student and  Age::"+"\n"+hmap);
    
    for(Entry<String, Integer> h:hmap.entrySet()) {
   	 System.out.println("Student Age");
   	 System.out.println(h);
	}

}
}
