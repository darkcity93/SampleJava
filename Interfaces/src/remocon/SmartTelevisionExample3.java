package remocon;

public class SmartTelevisionExample3 {

	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		
		Searchable searchable = (Searchable)stv;
		searchable.search("ezjava.com");
		
		RemoteControl rc = (RemoteControl)stv;
		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();

	}

}
