package ko222gj_assign1.ferry;

public class Bicycle extends Vehicle{
	private final static int  size = 1;
	private final static int  cost = 40;
	private final static int  Passangercost = 0;
	private final static int  Pass = 1;
	
	
	public Bicycle() {
		super(size, Pass, Passangercost, cost);
	}
}

