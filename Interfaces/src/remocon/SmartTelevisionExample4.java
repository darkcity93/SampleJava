package remocon;

public class SmartTelevisionExample4 {

	public static void main(String[] args) {
		Searchable stv = new SmartTelevision();
		
		// The method search(String) is undefined for the type RemoteControl
		// stv.search("ezjava.com");
		stv.turnOn();
		stv.setVolume(15);
		stv.turnOff();
	

	}

}
