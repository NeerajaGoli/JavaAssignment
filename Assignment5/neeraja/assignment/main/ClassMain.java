package neeraja.assignment.main;

import neeraja.assignment.data.ClassFirst;
import neeraja.assignment.singleton.ClassSecond;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassFirst object1=new ClassFirst();
		object1.printVariables();
//		object1.printLocalVariables();
		ClassSecond object2=ClassSecond.returnObject("hello");
		object2.printString();
	}

}
