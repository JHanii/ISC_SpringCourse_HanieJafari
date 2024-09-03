package generated;

import java.util.List;

public class Office{
	List<Staff> staff;
	String name;
	String address;
	public List<Staff> getStaff() {
		return staff;
	}
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Office [staff=" + staff + ", name=" + name + ", address="
				+ address + "]";
	}
	
	
	
}
