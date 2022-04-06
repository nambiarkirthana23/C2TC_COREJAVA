package com.generics;
class Test<T>
{
	T value;
    public void show()
    {
    	System.out.println(value.getClass().getName());
    }
}
public class GenericDemo {

	public static void main(String[] args) {
		Test<Integer> obj=new Test<>();
		obj.value=9;
		obj.show();
		Test <String> obj1=new Test<>();
		obj1.value="kirthana";
		obj1.show();

	}

}
