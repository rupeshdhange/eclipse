package pract;

public class Ani {
	public static void main(String[] args) {
		
		lion on = new lion();
		on.eating();
		on.bark();
	}
	
	}


class Anima{
public void eating() {
	System.out.println("the animal is eating");
}

}
class Adog extends Anima{
	public void bark() {
		System.out.println("the dog is barking");
	}
}
class cat extends Adog{
	public void sound() {
		System.out.println("cat is mew mew");
	}
}
class lion extends Anima{
	public void bark() {
		System.out.println("thiskh");
	}
}
