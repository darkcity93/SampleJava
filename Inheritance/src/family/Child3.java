/*
 * �θ� ������ �ִ� �ʵ�(money)�� �ڽ��� �ٽ� ���� �� �� �ִ�.
 * �κ��� �޼ҵ带 ���ؼ� �θ� ���� �� �ʵ�(money)�� �����ϰ� �Ǹ�
 * �ڽ��� �ʵ�(money)�� �ƴ� �θ��� �ʵ�(money) ���� �����ϰ� �ȴ�.
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
