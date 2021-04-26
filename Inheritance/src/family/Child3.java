/*
 * 부모가 가지고 있는 필드(money)를 자식이 다시 정의 할 수 있다.
 * 부보의 메소드를 통해서 부모에 정의 된 필드(money)에 접근하게 되면
 * 자신의 필드(money)가 아닌 부모의 필드(money) 값을 참조하게 된다.
 */

package family;

public class Child3 extends Parent {
	int money = 900;
	int stock = 700;
	
	void print(String title) {
		int parentMoney = super.money;
		System.out.printf("Child3 : [%s] money=(parent:%d)(%d), stock=(%d)\n", title, parentMoney, this.money, this.stock);
	}
	
	int addStock(int stock) {
		this.stock += stock;
		return this.stock;
	}
	
}
