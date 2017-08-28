package ko222gj_assign1.ferry;

public class Car extends Vehicle{
	private final static int  size = 4;
	private final static int  cost = 100;
	private final static int  Passangercost = 15;
	
	//Object of type car inherits from vehicle.
	 //pass The amount of passengers on board.
	 
	public Car(int pass) {
		super(size, pass, Passangercost, cost);
	}

}

