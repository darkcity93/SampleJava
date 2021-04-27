package casting;

public class BusExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// error
		// System.out.println("station:" + vehicle.getStation());
		
		Bus bus = (Bus)vehicle;
		System.out.println("station1:" + bus.getStation());
		
		System.out.println("station2:" + ((Bus)vehicle).getStation());
	}

}
