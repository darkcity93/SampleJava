package abstracts2;

public class Insect extends Animal{
	Insect(){
		this.kind = "곤충";
	}
	
	public void move() {
		System.out.println("곤충은 기어다닌다");
	}
	
	@Override
	public void sound() {
		System.out.println("곤충은 작은 소리를 낸다.");
	}

	public void crawl() {
		System.out.println("곤충은 기어다닌다");
	}

}
