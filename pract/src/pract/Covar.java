package pract;

class vari{
	public int   sum(int a , int b) {
		return a+b;
	}
}
class Nari extends vari{
	Nari sum() {
		System.out.println("this is method of vari");
		return this;
	}
}

public class Covar {
	public static void main(String[] args) {
		vari a = new vari();
System.out.println(a.sum(464, 446));
     Nari nar=new Nari();
    System.out.println(nar.sum());
     
		
	}

}
