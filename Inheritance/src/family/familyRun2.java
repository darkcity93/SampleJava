package family;

public class familyRun2 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child2 child2 = new Child2();
		
		System.out.println("[Parent == Child2]:" + (parent == child2));
		
		System.out.println("Parent : money =" + parent.money);
		System.out.println("Child2 : money =" + child2.money);
		
		parent.print("ºÎ¸ğ");
		child2.print("ÀÚ³à");
		
	}

}
