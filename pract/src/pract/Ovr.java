package pract;



class Me{
	public void turnon() {
		System.out.println("please turn on the tv");
	}	
	}
	class On extends Me{
		public void turnon() {
			System.out.println("please on the zeetv channel");
		}	
		}
		class Nu extends Me {
			public void turnon() {
				System.out.println("please turn the number 123");
			}
		
	}


public class Ovr {
	public static void main(String[] args) {
		
	
	Me me = new Me ();
	me.turnon();
	On on= new On();
	on.turnon();
	Nu nu = new Nu();
	nu.turnon();
	
	}

}
