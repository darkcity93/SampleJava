package remocon;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio ÄÑ±â");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio ²ô±â");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VALUE) {
			volume = RemoteControl.MAX_VALUE;
		}
		else if(volume < RemoteControl.MIN_VALUE) {
			volume = RemoteControl.MIN_VALUE;
		}
		else {
			this.volume = volume;
		}

		System.out.println("Audio º¼·ý : " + this.volume);
	}

}
