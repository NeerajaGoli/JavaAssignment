package neeraja.assignment.singleton;

public class ClassSecond {

	String variable;
	public static ClassSecond returnObject(String word)
	{
		//A static method cannot access non-static variables or methods.
		
		//variable=word;
		return new ClassSecond();
	}
	public void printString()
	{
		System.out.println(variable);
	}
	
}
