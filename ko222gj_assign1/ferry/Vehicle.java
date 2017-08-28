package ko222gj_assign1.ferry;

public abstract class Vehicle {
	private int size;
	private Passenger[] passangers;
	private int costPass;
	private int cost;
	
//Constructor for type Vehicle.
//Size of the vehicle.
//pass Amount of passengers.
//costPerPass Cost per passenger.
//Cost Cost for the vehicle.
	
	public Vehicle (int Size, int pass, int costPerPass, int Cost) {
		size = Size;
		costPass = costPerPass;
		cost = Cost;
		passangers = setPassangers(pass);
	}
	
	
	public int getCost() { //Returns the cost of the current vehicle.
		return cost;
	}
	
// Size of the current vehicle.
	 
	public int getSize() {
		return size;
	}
	
//  Returns an array containing the passangers in the current vehicle.
	 
	public Passenger[] getPassangers() {
		return passangers;
	}
	
//  Creating an array containing the passengers in the current vehicle.
	 
	protected Passenger[] setPassangers(int pass){
		Passenger[] temp = new Passenger[pass];
		for (int i = 0; i < pass; i++) {
			Passenger p = new Passenger(costPass);
			temp[i] = p;
		}
		
		return temp;
	}

// Returns a String with the current size of the vehicle and the amount of passengers.
	 
	public String toString() {
		return "Size: " + size + "Number of passangers: " + passangers.length;
	}

}

