package family;

public class familyRun {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		System.out.println("[Parent == Child]:" + (parent == child));
		
		System.out.println("Parent : money =" + parent.money);
		System.out.println("Child : money =" + child.money);
		
		parent.print("�θ�");
		child.print("�ڳ�");
		
	}

}
