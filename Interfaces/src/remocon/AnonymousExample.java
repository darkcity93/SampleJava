/*
 * �͸� ���� ��ü
 * 1. 1ȸ�� ��ü ����
 */

package remocon;

public class AnonymousExample {

	public static void main(String[] args) {
		RemoteControl radio = new RemoteControl() {
			
			public void turnOn() {
				System.out.println("Radio On");
			}
			
			public void turnOff() {
				System.out.println("Radio Off");
			}
			
			public void setVolume(int volume) {
				System.out.println("Radio Volune");
			}
			
		}; // �ݵ�� �����ݷ�(;)�� �־�� ��.(1ȸ��)
		
		RemoteControl.control(radio);
		// RemoteControl.control(new Radio()); <- �Ұ���
		

	}

}
