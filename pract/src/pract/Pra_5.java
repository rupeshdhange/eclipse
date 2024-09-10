package pract;



class I{
	
	public void rate() {
		System.out.println("the rate is depend on wheelers");
	}	
}
class car extends I{
	String name;
	int price;
	
	public car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void rate() {
		System.out.println("the price is 12365666");
	}
}

class Bike extends I{
	int price;
	public Bike(int price) {
		super();
		this.price = price;
	}
	@Override
	public void rate() {
		System.out.println("the bike rate is:" + "" +price);
	}
}
public class Pra_5 {
	public static void main(String[] args) {
		I i = new I();
		car car= new car("name",346888);
		Bike n = new Bike(340000);
		n.rate();
		
		
		
			}

}
