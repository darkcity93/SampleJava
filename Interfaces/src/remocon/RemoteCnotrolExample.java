package remocon;

public class RemoteCnotrolExample {

	public static void main(String[] args) {
		System.out.println("RemonteControl.MAX_VALUE: " + RemoteControl.MAX_VALUE);
		System.out.println("RemonteControl.MIN_VALUE: " + RemoteControl.MIN_VALUE);
		System.out.println("RemonteControl.RC_VALUE: " + RemoteControl.RC_VALUE);
		
		System.out.println("RemonteControl.middle_value: " + RemoteControl.middle_value);
		RemoteControl.changeBattery();
	}

}
