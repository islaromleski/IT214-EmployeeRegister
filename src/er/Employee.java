package er;

public class Employee {

	private int employeeID;
	private String firstName;
	private String lastName;
	private String city;
	private String country;
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	public void setEmployeeID(int newID) {
		this.employeeID = newID;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}

	public String getCity() {
		return this.city;
	}
	
	public void setCity(String newCity) {
		this.city = newCity;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String newCountry) {
		this.country = newCountry;
	}
	
	@Override
	public String toString() {
		String aMessage = "";
		aMessage += "Employee ID: " + this.getEmployeeID() + "\n";
		aMessage += "First Name: " + this.getFirstName() + "\n";
		aMessage += "Last Name: " + this.getLastName() + "\n";
		aMessage += "City: " + this.getCity() + "\n";
		aMessage += "Country: " + this.getCountry() + "\n";
		
		return aMessage;
	}
}
