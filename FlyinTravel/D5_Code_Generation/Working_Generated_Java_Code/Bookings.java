import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Bookings {

	/**
	 * 
	 */
	private Integer BookingID;
	/**
	 * 
	 */
	private Integer Price;
	/**
	 * 
	 */
	private String SeatNo;
	/**
	 * 
	 */
	private Integer Baggage;
	/**
	 * 
	 */
	private Traveler traveller;
	/**
	 * Getter of BookingID
	 */
	public Integer getBookingID() {
	 	 return BookingID; 
	}
	/**
	 * Setter of BookingID
	 */
	public void setBookingID(Integer BookingID) { 
		 this.BookingID = BookingID; 
	}
	/**
	 * Getter of Price
	 */
	public Integer getPrice() {
	 	 return Price; 
	}
	/**
	 * Setter of Price
	 */
	public void setPrice(Integer Price) { 
		 this.Price = Price; 
	}
	/**
	 * Getter of SeatNo
	 */
	public String getSeatNo() {
	 	 return SeatNo; 
	}
	/**
	 * Setter of SeatNo
	 */
	public void setSeatNo(String SeatNo) { 
		 this.SeatNo = SeatNo; 
	}
	/**
	 * Getter of Baggage
	 */
	public Integer getBaggage() {
	 	 return Baggage; 
	}
	/**
	 * Setter of Baggage
	 */
	public void setBaggage(Integer Baggage) { 
		 this.Baggage = Baggage; 
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
	public void ModifyBooking() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void ViewBooking() throws java.io.IOException { 
		// TODO Auto-generated method
		System.out.println("FlyinTravel - Enter your BookingID");
		Integer input = read.GetInt();
		Integer n=0;
		FlyinTravel fly = new FlyinTravel();
		Bookings tmp = new Bookings();
                for(int i=0;i<fly.booking_list.size();i++)
                {
			if(input < fly.booking_list.size()) {
                        tmp = (Bookings)fly.booking_list.elementAt(i);
			if(tmp.getBookingID() == input) {
					Flight flt = (tmp.getTraveller()).getFlight(tmp.getBookingID());
                                        System.out.println("---Flight No.---Flight Date---Seat No---Source---Dest---");
                                        System.out.println("");
					SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                                        System.out.println("---"+flt.getFlightNo()+"--------"+df.format(flt.getDate_flight())+"----"+tmp.getSeatNo()+"----"+flt.getSource()+"----"+flt.getDestination());
			
			}
			else {
				n=n+1;
				}
			}
			
		}	
		if((n == fly.booking_list.size()) || (input  >= fly.booking_list.size())) {
			System.out.println("No Valid Booking ID");
		}
	 }
	/**
	 * 
	 */
	public void CancelBooking() throws java.io.IOException { 
		// TODO Auto-generated method
		System.out.println("FlyinTravel - Enter your BookingID");
                Integer input = read.GetInt();
                Integer n=0;
                FlyinTravel fly = new FlyinTravel();
                Bookings tmp = new Bookings();
                for(int i=0;i<fly.booking_list.size();i++)
                {
                        if(input < fly.booking_list.size()) {
                        tmp = (Bookings)fly.booking_list.elementAt(i);
                        if(tmp.getBookingID() == input) {
					fly.booking_list.removeElement(tmp);
                                        System.out.println("Booking with ID: " +tmp.getBookingID()+ " Canceled");

                        }
                        else {
                                n=n+1;
                                }
                        }

                }
                if((n == fly.booking_list.size()) || (input  >= fly.booking_list.size())) {
                        System.out.println("No Valid Booking ID");
                }

		
	 } 

	public Bookings() {

	}

	public Bookings (Integer bk_id, Integer price, String seatno, Integer bag) {

		this.BookingID = bk_id;
		this.Price = price;
		this.SeatNo = seatno;
		this.Baggage = bag;
	}

}
