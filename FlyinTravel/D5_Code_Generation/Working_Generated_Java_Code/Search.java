import java.util.List;

public class Search {
	
	/**
	 * 
	 */
	private Flight flight;
	/**
	 * 
	 */
	private Traveler traveller;
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
	public Flight getFlight() {
	 	 return flight; 
	}
	/**
	 * Setter of flight
	 */
	public void setFlight(Flight flight) { 
		 this.flight = flight; 
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

	public Search() {

	}

	public Search(Integer np, Boolean isone) {

		this.No_of_Passengers = np;
		this.IsOneWay = isone;
	}
}
