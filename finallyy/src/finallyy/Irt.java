package finallyy;
import java.util.*;

class Arra{
	String name ;
	String Address;
	int id ;
	Arra(String name,String Address, int id){
		this.Address=Address;
		this.name = name;
		this.id = id;
		}
		public String toString() {
			return "Arra [name= "+ name +", Address= " +Address+ ", id= "+ id +"]";
		}
		
	}
   @SuppressWarnings("unchecked")
	
public class Irt {
	public static void main(String[] args) {
		ArrayList<String> Animals = new ArrayList<String >();
		Animals.add("tiger");
		Animals.add("lion");
		Animals.add("Goat");
		System.out.println(Animals);
		String a =Animals.get(0);
		System.out.println(a);
		
		  
		 
		
	 }
	
	}
	
	
		