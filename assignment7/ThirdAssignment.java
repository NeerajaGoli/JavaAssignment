package neeraja.assignment7;


//*****Assignment 7-3*****//

interface One
{
	void method1();
	void method2();
}
interface Two
{
	void method3();
	void method4();
}
interface Three
{
	void method5();
	void method6();	
}
interface Four extends One,Two,Three
{
	void method5();
}

class Impl implements Four
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ThirdAssignment extends Impl implements Four {

	void setOne(One one)
	{
		System.out.println("Using first interface reference");
	}
	void setTwo(Two two)
	{
		System.out.println("Using second interface reference");
	}
	void setThree(Three three)
	{
		System.out.println("Using third interface reference");
	}
	void setFour(Four four)
	{
		System.out.println("Using fourth interface reference");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdAssignment object=new ThirdAssignment();
		object.setOne(object);
		object.setTwo(object);
		object.setThree(object);
		object.setFour(object);

		
		
	}

}
