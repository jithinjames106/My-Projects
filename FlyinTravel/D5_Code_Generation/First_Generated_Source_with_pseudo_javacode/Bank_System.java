

import java.util.List;

public class Bank_System {

	/**
	 * 
	 */
	private String BankName;
	/**
	 * 
	 */
	private List<Credit_Debitcard_Interac> credit_debitcard_interac;
	/**
	 * Getter of BankName
	 */
	public String getBankName() {
	 	 return BankName; 
	}
	/**
	 * Setter of BankName
	 */
	public void setBankName(String BankName) { 
		 this.BankName = BankName; 
	}
	/**
	 * Getter of credit_debitcard_interac
	 */
	public List<Credit_Debitcard_Interac> getCredit_debitcard_interac() {
	 	 return credit_debitcard_interac; 
	}
	/**
	 * Setter of credit_debitcard_interac
	 */
	public void setCredit_debitcard_interac(List<Credit_Debitcard_Interac> credit_debitcard_interac) { 
		 this.credit_debitcard_interac = credit_debitcard_interac; 
	}
	/**
	 * 
	 */
	public Integer ValidateTransaction() { 
		// TODO Auto-generated method
		return 0;
	 } 

}