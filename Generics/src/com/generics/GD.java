package com.generics;
class Demo<T,U>
{
	T obj1;
	U obj2;
	Demo(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
public class GD {

	public static void main(String[] args) {
		Demo<String,Integer> ob=new Demo<String,Integer>("kirthana",10);
		ob.print();
	}

}
