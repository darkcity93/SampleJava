package remocon;

public class SmartTelevisionExample2 {

	public static void main(String[] args) {
		RemoteControl stv = new SmartTelevision();
		
		// The method search(String) is undefined for the type RemoteControl
		// stv.search("ezjava.com");
		stv.turnOn();
		stv.setVolume(15);
		stv.turnOff();
	

	}

}
