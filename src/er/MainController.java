package er;

public class MainController {

	public static void main(String[] args) {

		//Creates a view from the ConsoleView object.
		ConsoleView aView = new ConsoleView();
		
		//Creates employees from the Employee object.
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();

		//Set values for each employee.
		employee1.setEmployeeID(1);
		employee1.setFirstName("John");
		employee1.setLastName("Doe");
		employee1.setCity("Austin");
		employee1.setCountry("United States of America");
		
		employee2.setEmployeeID(2);
		employee2.setFirstName("Jane");
		employee2.setLastName("Smith");
		employee2.setCity("London");
		employee2.setCountry("United Kingdom");
		
		employee3.setEmployeeID(3);
		employee3.setFirstName("Sam");
		employee3.setLastName("Retsky");
		employee3.setCity("New York City");
		employee3.setCountry("United States of America");
		
		employee4.setEmployeeID(4);
		employee4.setFirstName("Tanaka");
		employee4.setLastName("Ai");
		employee4.setCity("Tokyo");
		employee4.setCountry("Japan");
		
		employee5.setEmployeeID(5);
		employee5.setFirstName("Hana");
		employee5.setLastName("Lake");
		employee5.setCity("Sydney");
		employee5.setCountry("Australia");		
		
		//Print each employee's information to the console.
		aView.print(employee1.toString());
		aView.print(employee2.toString());
		aView.print(employee3.toString());
		aView.print(employee4.toString());
		aView.print(employee5.toString());

	}
	
}