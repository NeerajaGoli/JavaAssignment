package neeraja.assignment7;

//*****Assignment 7-2*****//



class Cycle
{
	void balance()
	{
		System.out.println("cycle balance");
	}
}

class UniCycle extends Cycle
{
	void balance()
	{
		System.out.println("unicycle balance");
	}
}

class BiCycle extends Cycle
{
	void balance()
	{
		System.out.println("bicycle balance");
	}
}

class TriCycle extends Cycle
{
	
}

public class CyclesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle cycles[]= new Cycle[3];
		UniCycle uniCycle=new UniCycle();
		BiCycle biCycle=new BiCycle();
		TriCycle triCycle=new TriCycle();
		cycles[0]=uniCycle;
		cycles[1]=biCycle;
		cycles[2]=triCycle;
		for(Cycle cycle:cycles)
		{
			cycle.balance();
		}
		
		
		uniCycle.balance();
		biCycle.balance();
		
		//as balance method does not exist in TriCycle class,it will call super class method.
		triCycle.balance();
	}

}
