package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {

    HSBCBank HS =new HSBCBank ();
    HS.carLoan();
    HS.credit();
    HS.debit();
    HS.educationLoan();
    HS.TransferMoney();
    HS.MutualFund();
    
    
    //dynamic polimorphism
   //child class object can be refered by parent interface reference 
    
    USBank B =new HSBCBank();
    B.credit();
    B.debit();
    
    

	}

}
