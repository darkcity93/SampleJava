package books;

public class BookExample {

	public static void main(String[] args) {
		Book book = new Book("���޷� ��", "����", "��ҿ�", 20.5);
		
		System.out.println("name : " + book.name);
		System.out.println("category : " + book.category);
		System.out.println("author : " + book.author);
		System.out.println("price : " + book.price);
		
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println(book);
	}

}
