package OOPSConceptpart1;

public class LocalVsGlobalVar {

	String name= "Aloshi";
	int age =4;
	
	public static void main(String[] args) {
		
		LocalVsGlobalVar obj =new LocalVsGlobalVar();
		int i=10;
		System.out.println(i);
		System.out.println(obj.age);
		System.out.println(obj.name);

	}
	
	public void sum() {
		int i =20;
		int j= 30;
		
	}

}
