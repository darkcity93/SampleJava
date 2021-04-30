package remocon;

public class TelevisionlExample {

	public static void main(String[] args) {
		RemoteControl tv = new Television();
		
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOff();
	}

}
