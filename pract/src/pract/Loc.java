package pract;

class Va{
	 static String name = "sdac";
	public void meth2(int a) {
		System.out.println(a);
	}
	public void meth3() {
		final int c = 12;
		System.out.println(c);
		
	}
	
}

public class Loc {
	public static void main(String[] args) {
		Va va = new Va();
	va.meth2(23);
		va.meth3();
		System.out.println(Va.name);
		
	
	
	}
}
