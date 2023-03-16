package OOPSConceptPart2;

public class BMW extends Car {
	
// when two methods with same name and same number of arguments are 
//available in parent and child classes then its called method overriding
	
	public void start() {
		System.out.println("BMW start..");
	}
	
	public void theftSafety() {
		System.out.println("BMW theftSafety..");
	}

}
