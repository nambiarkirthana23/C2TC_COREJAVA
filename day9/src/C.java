class A 
{ 
 	void displayA() 
 	{ 
 	System.out.println("class A"); 
 	} 
} 
class B extends A 
{ 
 	void displayB() 
 	{ 
 	System.out.println("class B"); 
 	} 
} 
public class C extends B {
	void displayC() 
 	{ 
 	System.out.println("Class C"); 
 	} 
 	public static void main(String[] args)  
         { 
       C ob=new C();     
       ob.displayA();//Grandparent class     
       ob.displayB();//Parent class 
       ob.displayC();//local method of Class C 
 	} 
} 
