package polymorphism;

public class Novel extends Book {
	private String summary;
	
	public Novel() {}
	
	public Novel(String name, String category, String author, double price) {
		super(name, category, author, price); // �θ������ ȣ��
	}
		/*
		this.name = name;
		this.category = category;
		this.author = author;
		this.price = price;
		*/
		public Novel(String name, String category, String author, double price, String summary) {
				
		super(name, category, author, price); // �θ������ ȣ��
		this.setSummary(summary);
	}


	void setSummary(String summary) {
		this.summary = "NOVEL: " + summary;
	}

	String getSummary() {
		return summary;
	}
	
	public String toString() {
		String str =String.format("[Novel] name(%s), category(%s), author(%s), price(%f), �ٰŸ�(%s)\n", 
				name, category, author, price, summary);
		
		return str;
	}


	
	
}
