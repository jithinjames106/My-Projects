import java.util.*;
import java.io.*;


import java.util.List;

public class Flight {

	/**
	 * 
	 */
	private List<Search> search;
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
	private Date Date_flight;
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
	public Date getDate_flight() {
	 	 return Date_flight; 
	}
	/**
	 * Setter of Date
	 */
	public void setDate(Date Date_flight) { 
		 this.Date_flight = Date_flight; 
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


	public Flight() {

	}

	public Flight(String fl_no, String src, String dst, Date dte,Boolean isdom, Integer cap) {

		this.FlightNo = fl_no;
		this.Source = src;
		this.Destination = dst;
		this.Date_flight = dte;
		this.IsDomestic = isdom;
		this.Capacity = cap;
	}

}
