package javacollectiondemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		//store 10,20,30,40,50 in the stack
		Stack<Integer> obj=new Stack<Integer>();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        System.out.println(obj);
        obj.pop();
        System.out.println(obj);
	}

}
