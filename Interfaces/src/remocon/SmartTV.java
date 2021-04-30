package remocon;

public class SmartTV implements RemoteControl {
	private String model = "����ƮTV";
	private int channel;
	private int volume;
	
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.printf("ä�κ���:[%s] channel(%d)\n", this.model, this.channel);
	}

	

	@Override
	public void turnOn() {
		System.out.printf("[%s] SmartTV �ѱ�\n", this.model);
	}

	@Override
	public void turnOff() {
		System.out.printf("[%s] SmartTV ����\n", this.model);
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

		System.out.println("[" + this.model + "] SmartTV ���� : " + this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		// RemoteControl.super.setMute(mute);
		
		if(mute) {
			System.out.printf("[%s] �������\n", this.model);
		}
		else {
			System.out.printf("[%s] ��������\n", this.model);
		}

	}
}
