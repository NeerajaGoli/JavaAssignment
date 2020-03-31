package neeraja.assignment7.fourth;

//****Assignment 7-4 ******//

interface Cycle
{
	void getwheels();
}

class CycleFactory implements Cycle
{
Cycle cycle;
	public CycleFactory(Cycle cycle) {
		// TODO Auto-generated constructor stub
		this.cycle=cycle;
	}
	@Override
	public void getwheels() {
		// TODO Auto-generated method stub
		
		//using Factories
		if(cycle instanceof UniCycle)
		{
			System.out.println("one wheel");
		}
		else if(cycle instanceof Bicycle)
		{
			System.out.println("two wheels");
		}
		else if(cycle instanceof TriCycle)
		{
			System.out.println("three wheels");
		}
	}
	
}
class UniCycle implements Cycle
{

	@Override
	public void getwheels() {
		// TODO Auto-generated method stub
		System.out.println("1 wheels");
	}
	
}

class Bicycle implements Cycle
{

	@Override
	public void getwheels() {
		// TODO Auto-generated method stub
		System.out.println("2 wheels");
	}
	
}

class TriCycle implements Cycle
{

	@Override
	public void getwheels() {
		// TODO Auto-generated method stub
		System.out.println("3 wheels");
	}
	
}

public class CycleFactoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleFactory cycleFactory=new CycleFactory(new UniCycle());
		cycleFactory.getwheels();
	}

}
