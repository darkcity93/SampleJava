package remocon;

public interface RemoteControl {
	// ��� : ���������� �빮��
	
	public int middle_value = 5;
	public static final int RC_VALUE = 5;
	
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;
	// �ڵ����� �߻� �޼ҵ�(abstract method)�� �ǹǷ� ������ ���� �� ����.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	/*
	 *  ���� �߰�
	 *  1. ����Ʈ �޼ҵ带 ���ؼ� �������̽��� Ȯ��
	 *  2. ���� ȣȯ���� ����
	 */
	
	
	default public void setChannel(int cahnnel) {
	System.out.println("ä�κ���");
	}
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("�������");
		}
		else {
			System.out.println("��������");
		}
	}

	static void changeBattery() {
		System.out.println("���͸� ��ȯ");
	}
	static void control(RemoteControl rc) {
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(5);
		rc.turnOff();
	}
	
	
	
}
