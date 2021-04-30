/*
 * 익명 구현 객체
 * 1. 1회성 객체 생성
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
			
		}; // 반드시 세미콜론(;)이 있어야 함.(1회성)
		
		RemoteControl.control(radio);
		// RemoteControl.control(new Radio()); <- 불가능
		

	}

}
