package pract;
import java.util.*;

public class Linked {
	public static void main(String[] args) {
		
		LinkedList<String> linked = new LinkedList<String>();
	    linked.add("rupesh");
	    linked.add("mahesh");
	    linked.add("rohit");
	    linked.add(0,"rupesh");
	    
	    linked.remove(2);
	    linked.add("mohit");
	    linked.set(1,"raj");
	     String a =linked.get(2);
	     System.out.println(a);
	    linked.set(1, "suraj"); 
	    System.out.println(linked);
	 
	  
	  ListIterator inc = linked.listIterator();	  
	  while(inc.hasPrevious()) {
		  System.out.println(inc.previous());
		  
	  }
	}

}
