package family;

public class familyRun3 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child3 child3 = new Child3();
		
		boolean eq = (parent == child3);
		System.out.println("[Parent == Child3]:" + (eq));
		System.out.println("[Parent == Child3]:" + (parent == child3));
		
		System.out.println("Parent : money =" + parent.money);
		System.out.println("Child3 : money =" + child3.money);
		
		parent.print("�θ�");
		// parent.addStock(100); // �θ�� �ڽ��� �ʵ忡 ������ �� ����.
		
		child3.addStock(200);
		child3.print("�ڳ�");
		
	}

}
