import java.util.*;
import java.io.*;


public class Payment {

	/**
	 * 
	 */
	private Integer PaymentID;
	/**
	 * 
	 */
	private Integer Amount;
	/**
	 * 
	 */
	private String Modeofpayment;
	/**
	 * 
	 */
	private Traveler traveller;
	/**
	 * Getter of PaymentID
	 */
	public Integer getPaymentID() {
	 	 return PaymentID; 
	}
	/**
	 * Setter of PaymentID
	 */
	public void setPaymentID(Integer PaymentID) { 
		 this.PaymentID = PaymentID; 
	}
	/**
	 * Getter of Amount
	 */
	public Integer getAmount() {
	 	 return Amount; 
	}
	/**
	 * Setter of Amount
	 */
	public void setAmount(Integer Amount) { 
		 this.Amount = Amount; 
	}
        /**
         * Getter of Modeofpayment
         */
        public String getModeofpayment() {
                 return Modeofpayment;
        }
        /**
         * Setter of Modeofpayment
         */
        public void setModeofpayment(String Modeofpayment) {
                 this.Modeofpayment = Modeofpayment;
        }
	/**
	 * Getter of traveller
	 */
	public Traveler getTraveller() {
	 	 return traveller; 
	}
	/**
	 * Setter of traveller
	 */
	public void setTraveller(Traveler traveller) { 
		 this.traveller = traveller; 
	}
	/**
	 * 
	 */
	public Integer MakePayment()  throws java.io.IOException { 
		// TODO Auto-generated method
		System.out.println("Total Amount to be paid " +Amount+ "CAD" );
		System.out.println("Do you wish make payment: Enter \'yes\' or \'no\'");
                String s_op = read.GetString();		
		if (s_op.equals("yes")) {
			return 1;
		}
		else if (s_op.equals("no")){
			return 2;
		}
		return 0;
	 }
	/**
	 * 
	 */
	public void ViewPayment() { 
		// TODO Auto-generated method
	 } 
	public Payment() {

	}

}
