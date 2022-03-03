package p1_intro;

public class DemoAnimalIInterface {

	public static void main(String[] args) {
		Fish f1 = new Fish("Fish1", 12,"Blue", 10.5);
		f1.swim();
		f1.walk();
		f1.fly();
		f1.show();
		f1.cook();
		Animal.jump();
	}

}
