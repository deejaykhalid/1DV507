package ko222gj_assign1.ferry;

public class Lorry extends Vehicle{
	private final static int  size = 2; //The amount of passengers on board
	private final static int  cost = 300;
	private final static int  Passangercost = 15;
	

	public Lorry(int pass) {
		super(size, pass, Passangercost, cost);
	}

}

