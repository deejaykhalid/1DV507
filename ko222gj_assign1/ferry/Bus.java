package ko222gj_assign1.ferry;

public class Bus extends Vehicle{
	private final static int  size = 20;
	private final static int  cost = 200;
	private final static int  Passangercost = 10;
	
	
	public Bus(int pass) {
		super(size, pass, Passangercost, cost);
	}


}
