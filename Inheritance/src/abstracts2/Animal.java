package abstracts2;

/*
public class Animal {
	void move() {
		System.out.println("������ �����δ�");
		
	}
}
*/
public abstract class Animal {
	public String kind = "����";
	/* 
	 * [�߻� �޼ҵ�]
	 * �߻� �޼ҵ�� ������ ������ ���� �ʴ�.
	 * ����� Ŭ�������� ������ �ؾ� �Ѵ�.
	 */
	public abstract void move(); 	
	public abstract void sound();
	// [�Ϲ� �޼ҵ�]
	
	public void breathe() {
		System.out.println("������ ȣ���� �Ѵ�.");
	}
}
