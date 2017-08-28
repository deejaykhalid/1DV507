package ko222gj_assign1.ferry;

import java.util.Iterator;

public class Ferry implements FerryInterface{
	private Passenger[] passangers;
	private int amountOfPassangers;
	private Vehicle[] vehicles;
	private int amountOfVehicles;
	private int space = 200;
	private int money = 0;
	private int usedSpace = 0;
	
	
	public Ferry() {
		vehicles = new Vehicle[8];
		amountOfVehicles = 0;
		passangers = new Passenger[200];
		amountOfPassangers = 0;
	}
	
	
	public int countPassengers() {
		return amountOfPassangers;
	}
	
	public int countVehicleSpace() {
		return (200-space)/5;
	}
	
	public int countMoney() {
		return money;
	}
	
	public Iterator<Vehicle> iterator() {
		return new VehicleIterator();
	}
	
	// Embarks 1 vehicle on the ferry. If there is space for and if the vehicle is not already on the ferry.
	 
	public void embark(Vehicle v){
		if(check(v)){
			if(hasSpaceFor(v)){
				vehicles[amountOfVehicles] = v;
				amountOfVehicles++;
				space = space - v.getSize();
				usedSpace = usedSpace +  v.getSize();
				money = money + v.getCost();
				Passenger[] temp = v.getPassangers();
				for (int i = 0; i < temp.length; i++){
					if(hasRoomFor(temp[i])){
						embark(temp[i]);
					}else{
						System.out.println("No more spaces for passangers!");
					}
					
				}
			}else {
				System.out.println("The Ferry is full with vehicles!");
			}
		}else {
			System.out.println("The vehicle is already on the ferry!");
		}
		
		
	}
	
	public void embark(Passenger p){ //Embarks a passenger onto the ferry
		if(hasRoomFor(p)){
			passangers[amountOfPassangers] = p;
			amountOfPassangers++;
			money = money + p.getCost();
		}else {
			System.out.println("The Ferry is full with passangers!");
		}
	}
	
	public void disembark(){
		vehicles = new Vehicle[8];
		amountOfVehicles = 0;
		passangers = new Passenger[200];
		amountOfPassangers = 0;
	}
	
	//Check if there is space for the given vehicle on the ferry.
	 
	public boolean hasSpaceFor(Vehicle v) {
		if (v.getSize() <= space){
			return true;
		}
		return false;
	}
	
	//Check if there is space for the given passenger on the ferry.
	 
	public boolean hasRoomFor(Passenger p){
		if (amountOfPassangers >= 200){
			return false;
		}
		return true;
	}
	
	// string representation of the ferry's current status.
	 
	public String toString(){
		return "The HMS 42\n on board with "+amountOfVehicles+" vehicle(s) and "+amountOfPassangers+" passangers";
	}
	
//  Checks if the vehicle is embarked on the ferry.
	 
	private boolean check (Vehicle v) {
		Iterator<Vehicle> it = iterator();
		while (it.hasNext()) {
			if(v == it.next()){
				return false;
			}
		}
		return true;
	}
	
	//Private inner class used by iterator()
	class VehicleIterator implements Iterator<Vehicle> {
		private int count = 0;
		public Vehicle next() {return vehicles[count++];}
		
		public boolean hasNext() {return count<amountOfVehicles;}

	}
}
