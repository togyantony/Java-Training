package OOPSConceptPart2;

public interface USBank {
	int min_balance=100;

	public void credit();
	
	public void debit();
	
	public void TransferMoney();
	
	//only method description no method body is allowed in interface.
	//variables are static in nature by default
	//No static methods allowed in interface
   // No main method in interface
   // We cannot create object of interface
   // by default interfaces are abstract in nature
	
	
}
