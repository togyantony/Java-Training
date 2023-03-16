package OOPSConceptpart1;

public class Car {
	//class vars
	int mod;
	int wheels;
	
	public static void main(String args[]) {
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		
		a.mod=2015;
		a.wheels=4;
		
		b.mod=2014;
		b.wheels=4;
		
		c.mod =2013;
		c.wheels=4;
		
				
		
		System.out.println(a.mod);
		
		a=c;
		System.out.println(a.mod);
		
	}

}
