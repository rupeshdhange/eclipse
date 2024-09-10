package pract;
class Ht{
	String name;
	int age;
	Ht(String a , int b){
		this.name=a;
		this.age=b;
	}
}
class Bn{
	public void show() {
		System.out.println("name of student is ");
	}
	public void sum() {
		show();
		String name= "rupesh";
		System.out.println(name);		
	}
}
class Cob{
	String name;
	int age;
	Cob(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void show(Cob b) {
		System.out.println("this is the");
	
	}
	
}
	
public class Th {
	public static void main(String[] args) {
	Bn n = new Bn();
	n.sum();
	
		
		
}
	
	

}
