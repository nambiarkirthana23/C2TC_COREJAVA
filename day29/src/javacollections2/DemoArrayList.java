package javacollections2;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("kirthana");
	al.add("radhika");
	al.add("manasi");
	al.add("manali");
	al.add("manalip");
	al.add("shreejeet");
	System.out.println(al);
	al.set(2,"tns");
	System.out.println(al);
	al.add(2,"abc");
	System.out.println(al);
	al.remove("abc");
	System.out.println(al);
	al.remove(2);
	System.out.println("forloop");
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	System.out.println("advancedforloop");
		for(String str:al)
		{
			System.out.println(str);
		}
		System.out.println("while loop");
		int count=0;
		while(al.size()>count)
		{
			System.out.println(al.get(count));
			count++;
	}
		System.out.println("iterator");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
