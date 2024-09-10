package finallyy;
import java.util.Scanner;
/////////finally

public class Exc {
	public static void main(String[] args) {
	
		int a= 100;
		int b=0;
		try {
		int c = a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("can't divided bu zero" +e);
		}
		finally {
			System.out.println("enter next numberr");
		}
	}
	}
