package ir.freeland.assignment.model;

public class AssignmentAddress implements Comparable<Object> {
    
    private String city;
    private String country;
    private String street;

    
    
    public AssignmentAddress(String city, String country, String street) {
    	this.city=city;
        this.country = country;
        this.street = street;
    }

    public String getCity() {
        return city;
    }


    public String getCountry() {
        return country;
    }
    
    public String getStreet() {
        return street;
    }
    

	public void setCity(String city) {
		this.city = city;
	}


	public void setCountry(String country) {
		this.country = country;
	}

	
	public void setStreet(String street) {
		this.street = street;
	}


	@Override
    public String toString() {
        return "Person{ city= " + city + " ,country=" + country +  ", street=" + street + "}";
    }

	@Override
	public int compareTo(Object o) {
		AssignmentAddress other = (AssignmentAddress)o;
		return this.street.compareTo(other.street);
		
	}
}
