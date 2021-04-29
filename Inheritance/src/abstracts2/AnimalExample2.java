package abstracts2;

public class AnimalExample2 {

	public static void main(String[] args) {
		animalSpecific(new Bird());
		animalSpecific(new Fish());
		animalSpecific(new Insect());
		animalSpecific(new Dog());
		
	}
		public static void animalSpecific(Animal animal) {
			System.out.printf("[ (%s)ÀÇ Æ¯Â¡ ]\n", animal.kind);
			animal.breathe();
			animal.move();
			animal.sound();
			System.out.println("-------------------------------");

		}

}
