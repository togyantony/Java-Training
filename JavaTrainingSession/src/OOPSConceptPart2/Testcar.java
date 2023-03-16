package OOPSConceptPart2;

public class Testcar {

	public static void main(String[] args) {
		//static or compile time polimorphism
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		
		Car c =new Car();
		c.start();
		c.stop();
		
		
		Car c1=new BMW();//child class object can be refered by parent class reference
		//is called dynamic or runtime polimorphism
		c1.start();
	}

}
