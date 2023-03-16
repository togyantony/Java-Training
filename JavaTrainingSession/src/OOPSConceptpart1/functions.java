package OOPSConceptpart1;

public class functions {
	public static void main(String args[]) {
		
		functions obj = new functions();
		obj.test();
		int k =obj.devision(12, 4);
		int l =obj.pqr();
		String S =obj.qa();
		
	}
		//non static methods
	    //void --does not return any value
	    //return type= void
		public void test() {
			
			System.out.println("test method");
		}
		
		//return type= int
		
		public int pqr() {
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println(c);
			return c;
			
		}
		//return type= String
		
		public String qa() {
			System.out.println("qa method");
			String s= "selenium";
			return s;
		}
		
		//return type =int
		public int devision(int x, int y) {
			System.out.println("devision method");
			int d=x/y;
			System.out.println(d);
			return d;
		}
	}


