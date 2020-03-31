package neeraja.assignment7;

import neeraja.assignment7.ClassSecond.InnerClass2;
import neeraja.assignment7.OuterClass.Inner;

//*****Assignment 7-5*****//


class OuterClass
{
	class Inner
	{
		Inner(String message)
		{
			System.out.println(message);
		}
	}
}

class ClassSecond
{
	class InnerClass2 extends OuterClass.Inner
	{

		InnerClass2(OuterClass outer, String message) {
			outer.super(message);
			// TODO Auto-generated constructor stub
		}
	}
		
}
public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerObject1=new OuterClass();
		
		//instantiating inner class
		Inner innerObject1=outerObject1.new Inner("hello");
		ClassSecond outerObject2=new ClassSecond();
		//instantiating second inner class
		InnerClass2 innerObject2=outerObject2.new InnerClass2(outerObject1,"hello");
	}

}
