package ir.freeland.springboot.validator;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;


public class InputParameter {

  @Min(1)
  @Max(10)
  private int number;

  // Note that this is actually not a valid IP address pattern, since
  // it allows values greater than 255 per octet.
  @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$")
  private String ipAddress;



  public int getNumber() {
	return number;
  }
	
	public void setNumber(int number) {
		this.number = number;
	}

public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }
}
