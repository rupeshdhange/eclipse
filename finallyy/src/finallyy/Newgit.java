package finallyy;
interface Outer{
	public void show();	
	}
abstract class Inner{
	abstract void display();
	
}
class Acc{
	
	public void showAcc() {
		System.out.println("this is method access");
	}
	Outer a = new Outer() {
	public void show() {
		System.out.println("golfk");
	}
	};
	Inner b = new Inner() {
	public void display() {
		System.out.println("this is method ovrt");
	}
	};
	
}


public class Newgit {
	public static void main(String[] args) {
		Acc ac  = new Acc ();
		ac.showAcc();
		ac.a.show();
		ac.b.display();
		
	}


}
