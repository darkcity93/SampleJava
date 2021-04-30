/*
 * 다중 인터페이스 구현 클래스
 */
package remocon;

public class SmartTelevision implements RemoteControl, Searchable {

	// The type SmartTelevision must implement the inherited abstract method Searchable.search(String)
	@Override
	public void search(String url) { // Searchable
		System.out.printf("[SmartTelevision] search(%s)\n", url);
	}
	
	
	@Override
	public void turnOn() { // RemoteControl
		System.out.println("[SmartTelevision] turnOn");

	}

	@Override
	public void turnOff() { // RemoteControl
		System.out.println("[SmartTelevision] turnOff");

	}

	@Override
	public void setVolume(int volume) { // RemoteControl
		System.out.println("[SmartTelevision] setVolume=" + volume);

	}

}
