package remocon;

public class AudioExample {

	public static void main(String[] args) {
		RemoteControl audio = new Audio();
		
		audio.turnOn();
		audio.setVolume(5);
		audio.turnOff();
	}

}
