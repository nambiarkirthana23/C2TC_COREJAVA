package finalkeyword;
public class EnumExample {
	//defining the enum inside the class  
	public enum Days { SUNDAY, MONDAY, TUESDAY, WEDNESDAY }  
		//main method  
	public static void main(String[] args)
	{  
			//traversing the enum  
		for (Days d : Days.values())  
			System.out.println(d);
		}

}
