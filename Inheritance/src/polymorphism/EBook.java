package polymorphism;

public class EBook extends Book {
	private String title;
	
	public EBook() {}
	
	public EBook(String name, String category, String author, double price) {
		super(name, category, author, price); // 부모생성자 호출
	}
		/*
		this.name = name;
		this.category = category;
		this.author = author;
		this.price = price;
		*/
		public EBook(String name, String category, String author, double price, String title) {
				
		super(name, category, author, price); // 부모생성자 호출
		this.setTitle(title);
	}


	void setTitle(String title) {
		this.title = "CD-" + title;
	}

	String getTitle() {
		return title;
	}
	
	public String toString() {
		String str =String.format("[EBook] name(%s), category(%s), author(%s), price(%f), 타이틀(%s)\n", 
				name, category, author, price, title);
		
		return str;
	}


	
	
}
