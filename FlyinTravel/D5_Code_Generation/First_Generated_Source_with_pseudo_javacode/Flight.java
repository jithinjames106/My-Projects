

import java.util.List;
import java.util.Date;

public class Flight {

	/**
	 * 
	 */
	private List<Traveler> traveller;
	/**
	 * 
	 */
	private String FlightNo;
	/**
	 * 
	 */
	private String Source;
	/**
	 * 
	 */
	private String Destination;
	/**
	 * 
	 */
	private Date Date;
	/**
	 * 
	 */
	private Boolean IsDomestic;
	/**
	 * 
	 */
	private Integer Capacity;
	/**
	 * 
	 */
	private Admin admin;
	/**
	 * Getter of traveller
	 */
	public List<Traveler> getTraveller() {
	 	 return traveller; 
	}
	/**
	 * Setter of traveller
	 */
	public void setTraveller(List<Traveler> traveller) { 
		 this.traveller = traveller; 
	}
	/**
	 * Getter of FlightNo
	 */
	public String getFlightNo() {
	 	 return FlightNo; 
	}
	/**
	 * Setter of FlightNo
	 */
	public void setFlightNo(String FlightNo) { 
		 this.FlightNo = FlightNo; 
	}
	/**
	 * Getter of Source
	 */
	public String getSource() {
	 	 return Source; 
	}
	/**
	 * Setter of Source
	 */
	public void setSource(String Source) { 
		 this.Source = Source; 
	}
	/**
	 * Getter of Destination
	 */
	public String getDestination() {
	 	 return Destination; 
	}
	/**
	 * Setter of Destination
	 */
	public void setDestination(String Destination) { 
		 this.Destination = Destination; 
	}
	/**
	 * Getter of Date
	 */
	public Date getDate() {
	 	 return Date; 
	}
	/**
	 * Setter of Date
	 */
	public void setDate(Date Date) { 
		 this.Date = Date; 
	}
	/**
	 * Getter of IsDomestic
	 */
	public Boolean getIsDomestic() {
	 	 return IsDomestic; 
	}
	/**
	 * Setter of IsDomestic
	 */
	public void setIsDomestic(Boolean IsDomestic) { 
		 this.IsDomestic = IsDomestic; 
	}
	/**
	 * Getter of Capacity
	 */
	public Integer getCapacity() {
	 	 return Capacity; 
	}
	/**
	 * Setter of Capacity
	 */
	public void setCapacity(Integer Capacity) { 
		 this.Capacity = Capacity; 
	}
	/**
	 * Getter of admin
	 */
	public Admin getAdmin() {
	 	 return admin; 
	}
	/**
	 * Setter of admin
	 */
	public void setAdmin(Admin admin) { 
		 this.admin = admin; 
	} 

}