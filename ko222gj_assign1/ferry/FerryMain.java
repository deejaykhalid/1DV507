package ko222gj_assign1.ferry;

public class FerryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ferry ferry = new Ferry();
		System.out.println(ferry.toString());
		Car one = new Car(4);
		ferry.embark(one);
		Bus two = new Bus(15);
		ferry.embark(two);
		Lorry three = new Lorry(2);
		ferry.embark(three);
		System.out.println(ferry.toString());
		System.out.println(ferry.countPassengers());
		System.out.println(ferry.countVehicleSpace());
		System.out.println(ferry.countMoney());
		ferry.disembark();
		System.out.println(ferry.toString());
		System.out.println(ferry.countMoney());
	}

}

