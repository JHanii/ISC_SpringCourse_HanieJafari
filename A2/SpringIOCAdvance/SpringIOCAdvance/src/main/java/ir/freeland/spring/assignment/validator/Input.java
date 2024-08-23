package ir.freeland.spring.assignment.validator;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Email;


public class Input {
  //null vs empty
  //An empty string is a string instance of zero length, 
  //whereas a null string has no value at all
	
  //NotEmpty	The annotated element must not be null nor empty.
  //NotNull	    The annotated element must not be null.
	
  // So NotEmpty can be used to cover both
  @NotEmpty
  private String notEmptyID;

  //Email	The string has to be a well-formed email address.
  @Email
  private String email;

  public String getID() {
    return notEmptyID;
  }

  public void setID(String notEmptyID) {
    this.notEmptyID = notEmptyID;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
