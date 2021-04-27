package polymorphism;

public class Book {
	protected String name;  		//책명
	protected String category;	// 장르
	protected String author;		// 저자
	protected double price;	   	// 책의 가격($)
	
	public Book() {}
	
	public Book(String name, String category, String author, double price) {
		super();
		this.name = name;
		this.category = category;
		this.author = author;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		String str =String.format("[Book] name(%s), category(%s), author(%s), price(%f)\n", name, category, author, price);
		
		return str;
	}

}
