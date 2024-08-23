package ir.freeland.spring.el.model;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Worker {

	@Value("#{ T(java.lang.Math).random() * 100.0 }")
	private long id;

	@Value("#{ systemProperties['user.country'] }")
	private String country;
	
	private Date dateOfBirth;
	
	private String firstName;
	private String lastName;
	private String emailId;
	
	private String[] awards;
	
	public Worker() {
		
	}

	public Worker( String firstName, String country) {
		this.firstName = firstName;		
		this.country = country;
	}
	public Worker( String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	public String[] getAwards() {
		return awards;
	}

	public void setAwards(String[] awards) {
		this.awards = awards;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", country=" + country + ", dateOfBirth="
				+ dateOfBirth + ", firstName=" + firstName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", awards="
				+ Arrays.toString(awards) + "]";
	}
	
}
