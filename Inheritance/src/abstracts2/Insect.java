package abstracts2;

public class Insect extends Animal{
	Insect(){
		this.kind = "����";
	}
	
	public void move() {
		System.out.println("������ ���ٴѴ�");
	}
	
	@Override
	public void sound() {
		System.out.println("������ ���� �Ҹ��� ����.");
	}

	public void crawl() {
		System.out.println("������ ���ٴѴ�");
	}

}
