package OOPSConceptpart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj =new MethodOverloading();
		obj.sum();
	}
	
	public void sum() {
		System.out.println("zero param");
	}
	public void sum(int i) {
		System.out.println("1 param");
	}
	
	public void sum(int i,int j) {
		System.out.println("2 param");
	}

}
