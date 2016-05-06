import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;


import java.util.List;

public class Traveler {

	/**
	 * 
	 */
	private List<Payment> payment;
	/**
	 * 
	 */
        private List<Search> search;
        /**
         * 
         */
	private String Name;
	/**
	 * 
	 */
	private Integer Age;
	/**
	 * 
	 */
	private char Gender;
	/**
	 * 
	 */
	private String Location;
	/**
	 * 
	 */
	private String Email;
	/**
	 * 
	 */
	private Integer PhoneNumber;
	/**
	 * 
	 */
	private List<Bookings> bookings;
	/**
	 * Getter of payment
	 */
	public List<Payment> getPayment() {
	 	 return payment; 
	}
	/**
	 * Setter of payment
	 */
	public void setPayment(List<Payment> payment) { 
		 this.payment = payment; 
	}
        /**
         * Getter of search
         */
        public List<Search> getSearch() {
                 return search;
        }
        /**
         * Setter of search
         */
        public void setSearch(List<Search> search) {
                 this.search = search;
        }
	/**
	 * Getter of Name
	 */
	public String getName() {
	 	 return Name; 
	}
	/**
	 * Setter of Name
	 */
	public void setName(String Name) { 
		 this.Name = Name; 
	}
	/**
	 * Getter of Age
	 */
	public Integer getAge() {
	 	 return Age; 
	}
	/**
	 * Setter of Age
	 */
	public void setAge(Integer Age) { 
		 this.Age = Age; 
	}
	/**
	 * Getter of Gender
	 */
	public char getGender() {
	 	 return Gender; 
	}
	/**
	 * Setter of Gender
	 */
	public void setGender(char Gender) { 
		 this.Gender = Gender; 
	}
	/**
	 * Getter of Location
	 */
	public String getLocation() {
	 	 return Location; 
	}
	/**
	 * Setter of Location
	 */
	public void setLocation(String Location) { 
		 this.Location = Location; 
	}
	/**
	 * Getter of Email
	 */
	public String getEmail() {
	 	 return Email; 
	}
	/**
	 * Setter of Email
	 */
	public void setEmail(String Email) { 
		 this.Email = Email; 
	}
	/**
	 * Getter of PhoneNumber
	 */
	public Integer getPhoneNumber() {
	 	 return PhoneNumber; 
	}
	/**
	 * Setter of PhoneNumber
	 */
	public void setPhoneNumber(Integer PhoneNumber) { 
		 this.PhoneNumber = PhoneNumber; 
	}
	/**
	 * Getter of bookings
	 */
	public List<Bookings> getBookings() {
	 	 return bookings; 
	}
	/**
	 * Setter of bookings
	 */
	public void setBookings(List<Bookings> bookings) { 
		 this.bookings = bookings; 
	}
        /**
         * 
         */
	public Flight getFlight(Integer i) {
		return search.get(i).getFlight();

	}
        /**
         * 
         */
	public void setFlight(Flight flight,Integer i) {
		search.get(i).setFlight(flight);
	}
	/**
	 * 
	 */
	public void SearchFlights() throws java.io.IOException { 
		// TODO Auto-generated method
		System.out.println("Search Results \n ");
		int n =0, bk=0,b=3;
		FlyinTravel fly = new FlyinTravel();
		Flight flt = new Flight();
		Flight flt_sch = search.get(b).getFlight();
		for(int i=0; i<fly.flight_list.size(); i++)
		{
			flt = (Flight)fly.flight_list.elementAt(i);
			
			if(flt.getSource().equals(flt_sch.getSource()) && flt.getDestination().equals(flt_sch.getDestination())) {
				if(flt.getDate_flight().equals(flt_sch.getDate_flight()) && flt.getIsDomestic().equals(flt_sch.getIsDomestic())) {
					System.out.println("---Flight No.---Flight Date---NO.Seats---Source---Dest---");
					System.out.println("");
					bk = bk+1;
					SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");	
					System.out.println("---"+flt.getFlightNo()+"--------"+df.format(flt.getDate_flight())+"----"+flt.getCapacity()+"----"+flt.getSource()+"----"+flt.getDestination());
				}
				
			}
			else{

				n=n+1;
			}
		}
		if ( n == fly.flight_list.size()) {
			System.out.println("Sorry!!! No Flights Found");							}
	
		if (search.get(b).getIsOneWay().equals(false)) {
			n =0;
	                for(int i=0; i<fly.flight_list.size(); i++)
        	        {
                	        flt = (Flight)fly.flight_list.elementAt(i);

                        	if(flt.getSource().equals(flt_sch.getDestination()) && flt.getDestination().equals(flt_sch.getSource())) {
                                	if(flt.getDate_flight().equals(flt_sch.getDate_flight()) && flt.getIsDomestic().equals(flt_sch.getIsDomestic())) {
                        			System.out.println("\n Return Flight Details");
	                        		System.out.println("---Flight No.---Flight Date---NO.Seats---Source---Dest---");
			                        System.out.println("");
						bk = bk+1;
                	                        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                        	                System.out.println("---"+flt.getFlightNo()+"--------"+df.format(flt.getDate_flight())+"----"+flt.getCapacity()+"----"+flt.getSource()+"----"+flt.getDestination());
                                	}

                        	}
                        	else{

                                	n=n+1;
                        	}
                	}
                	if ( n == fly.flight_list.size()) {
                        	System.out.println("Sorry!!! No Flights Found");		
			
			}
		}
		if (bk != 0) {
                        System.out.println("\n" + bk + " Flights Found");		
                        System.out.println("Do you want to book the Flights found: (Enter \'yes\' to book or \'no\'to quit)");		
			String bk_str = read.GetString();
			if (bk_str.equals("yes")) {
				BookFlights(b);
			}

		}
		b=b+1;
	 }
	/**
	 * 
	 */
	public void BookFlights(Integer b) throws java.io.IOException { 
		// TODO Auto-generated method
		FlyinTravel fly = new FlyinTravel();
		Flight flt = new Flight();
		Integer n =0;
		List<Integer> bk_list = new ArrayList<Integer>();
		System.out.println("Enter no of flights you wish to book");		
		Integer n_fl = read.GetInt();
		do {
		for(int i=0;i<n_fl;i++) {
			System.out.println("Enter the FlightNo: " +(i+1));		
			String fl_no = read.GetString();
			for(int j=0; j<fly.flight_list.size();j++) {
				flt = (Flight)fly.flight_list.elementAt(j);
				if(flt.getFlightNo().equals(fl_no)) {
					flt.setCapacity(flt.getCapacity() - search.get(b).getNo_of_Passengers());
					setFlight(flt,b);
					bk_list.add(j);
				}
				else {
					n=n+1;
				}
			}
		
		}
		if(n==((n_fl) * fly.flight_list.size()))
		{
			System.out.println("Flight no is invalid: Please enter correct Flight no and bklist size " +bk_list.size() );		
		}
			
		}while(n_fl != bk_list.size());
		Member m = new Member();
		Integer x=0;
		for(int k=0; k<fly.usr_list.size(); k++)
		{
			m=(Member)fly.usr_list.elementAt(k);
			if(m.getName().equals(Name) && m.getAge().equals(Age))
			{
					
				System.out.println("you are a member ");		
			}
			else {
				x=x+1;
			}

		}
		if(x == fly.usr_list.size()) {
			System.out.println("You are Booking flight as a Guest ");		
			Credit_Debitcard_Interac cdi = new Credit_Debitcard_Interac();
			List<Credit_Debitcard_Interac> cdi_list = new ArrayList<Credit_Debitcard_Interac>();
			String s = "Bank";
			cdi.setAmount(300);
			cdi.setModeofpayment(s);
			Integer y = cdi.MakePayment();	
			if (y == 2) {
				System.out.println("Payment canceled");		
				return;
			}
			else if(y==1) {
				cdi.CreateTransaction();
				if(cdi.getTransactionID() != null) {
					Bank_System bank = new Bank_System("Scotiabank");
					cdi.setBank_system(bank);
					cdi_list.add(cdi);
					bank.setCredit_debitcard_interac(cdi_list);
					Integer ret = bank.ValidateTransaction();
					if(ret==1) {
						
						System.out.println("Bank Validation Success");	
						Bookings book = new Bookings((b),300,"1A 1B 1C",15);
						book.setTraveller(this);
						List<Bookings> book_list = new ArrayList<Bookings>();
						book_list.add(book);
						setBookings(book_list);
						fly.booking_list.addElement(book);
						System.out.println("Booking Successful BookingID:" +book.getBookingID());	
								
					}
					else if(ret==2) {
						System.out.println("Bank Validation Failed");		
						return;						
					}
				}
			}
		}

				
		
	 } 

	public Traveler() {

	}

}
