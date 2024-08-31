package ir.freeland.springboot.persistence.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Card {
	private String number;
	private String cvv2;
	private String password;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCvv2() {
		return cvv2;
	}
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
