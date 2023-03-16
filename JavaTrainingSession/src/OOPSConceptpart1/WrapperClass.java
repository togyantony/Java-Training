package OOPSConceptpart1;

public class WrapperClass {

	public static void main(String[] args) {
		String i ="100";
		System.out.println(i+20);
		int r= Integer.parseInt(i);
		System.out.println(r+20);
		
		
		String y="12.33";
		System.out.println(y+10);
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		
		int j=200;
		System.out.println(j+10);
		String s = String.valueOf(j);
		System.out.println(s+10);
	}

}
