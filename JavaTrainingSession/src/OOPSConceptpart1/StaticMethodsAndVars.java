package OOPSConceptpart1;

public class StaticMethodsAndVars {
	String name ="Aloshi";
	static int age =5;
	
	public static void main(String args[]) {
		sum();
		StaticMethodsAndVars.sum();
		System.out.println(age);
		System.out.println(StaticMethodsAndVars.age);
		
	}
	
	public void sendmail() {
		System.out.println("send mail method");
	}
	public static void sum() {
		System.out.println("sum method");
	}

}
