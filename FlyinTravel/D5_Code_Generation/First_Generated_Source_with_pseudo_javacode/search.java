import java.util.List;

public class search {
	
	/**
	 * 
	 */
	private List<Flight> flight;
	/**
	 * 
	 */
	private List<Traveler> traveller;
	/**
	 * 
	 */
	private Integer No_of_Passengers;
	/**
	 * 
	 */
	private Boolean IsOneWay;
	/**
	 * 
	 */
	/**
	 * Getter of flight
	 */
	public List<Flight> getFlight() {
	 	 return flight; 
	}
	/**
	 * Setter of flight
	 */
	public void setFlight(List<Flight> flight) { 
		 this.flight = flight; 
	}
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
	 * Getter of No_of_Passengers
	 */
	public Integer getNo_of_Passengers() {
	 	 return No_of_Passengers; 
	}
	/**
	 * Setter of No_of_Passengers
	 */
	public void setNo_of_Passengers(Integer No_of_Passengers) { 
		 this.No_of_Passengers = No_of_Passengers; 
	}
	/**
	 * Getter of IsOneWay
	 */
	public Boolean getIsOneWay() {
	 	 return IsOneWay; 
	}
	/**
	 * Setter of IsOneWay
	 */
	public void setIsOneWay(Boolean IsOneWay) { 
		 this.IsOneWay = IsOneWay; 
	}
}
