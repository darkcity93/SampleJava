package abstracts;

/*
public class Animal {
	void move() {
		System.out.println("동물은 움직인다");
		
	}
}
*/
public abstract class Animal {
	/* 추상 메소드는 구현을 가지고 있지 않다.
	 * 상속한 클래스에서 구현을 해야 한다.
	 * 
	 */
	public abstract void move(); 
}
