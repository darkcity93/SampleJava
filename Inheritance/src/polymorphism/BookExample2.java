/*
 * 1. �θ��� Ÿ������ �ڽİ�ü�� �ڵ� Ÿ�� ��ȯ
 * 2. �θ��� ��ü�� �ڽ� Ÿ������ ���� �� ����. 
 */
package polymorphism;

public class BookExample2 {

	public static void main(String[] args) {
		Book book = new Book ("ȫ�浿��", "����", "���", 0.0);
		
		// EBook xbook = new Book ("����", "��ȭ����", "����", 0.0);
		// Ebook xbook1 = book;
		// EBook xbook = (EBook)book;
		// System.out.println(xbook);
		
		Book ebook = new EBook ("���޷� ��", "����", "��ҿ�", 20.5, "����å");
		Book novel = new Novel ("�¹���", "�Ҽ�", "������", 20.5, "�ع� ������ �̳�� ������ ��");
		
		System.out.println(book);
		System.out.println(ebook);
		System.out.println(novel);
		
	}

}
