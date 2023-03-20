package OOPSConceptPart2;

public class HSBCBank implements USBank,Brazilbank {
//if a class is implimenting an interface it is mandatory to override all the methods of that interface.
	
	@Override
	public void credit() {
		
		System.out.println(">>> credit");
		
	}

	@Override
	public void debit() {
		System.out.println(">>> debit");
		
	}

	@Override
	public void TransferMoney() {
		System.out.println(">>> money");
		
	}
	
	public void educationLoan() {
		System.out.println(">>> hsbc edutionLoan");
	}

	public void carLoan() {
		System.out.println(">>> hsbc CarLoan");
	}

	@Override
	public void MutualFund() {
		System.out.println(">>> brazil MutualFund");
		
	}
	
}
