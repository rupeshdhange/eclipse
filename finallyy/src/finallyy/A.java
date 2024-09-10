package finallyy;

class B{
	private int id = 123;
	private static String name="Sdac";
	class C{
	public void meth2() {
		System.out.println(id);
	}
		
	}
	static class D{
		public static void meth3() {
			System.out.println(name);
		}
	}
	
}

public class A {
	public  void main(String[] args) {
		B b = new B();
		B.C c = b.new C();
		c.meth2();
		B.D d = new B.D();
		d.meth3();
		
	}

}
