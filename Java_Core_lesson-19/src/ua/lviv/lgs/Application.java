package ua.lviv.lgs;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Application {
	
	public static void main(String[] args) throws Exception {		
		
		File file = new File("serialization.txt");
		Employee employee = new Employee("Richard", 55, 239.55);
		Methods method = new Methods();
		System.out.println(employee);
		method.deserialize(file);
		method.serialize(file, employee);
		System.out.println(employee);
		Employee employee2 = (Employee) method.deserialize(file);
		System.out.println(employee2);
		
		ArrayList<Employee> people = new ArrayList<>();
		people.add(new Employee("Gwen", 10, 211.22));
		people.add(new Employee("Jack", 22, 333.00));
		people.add(new Employee("Jordy", 21, 1220.11));
		people.add(new Employee("Patrick", 7, 123.12));
		people.add(new Employee("Parkson", 1, 2213.123));
		people.add(new Employee("Lillith", 123, 999.12));
		people.add(new Employee("Nick", 4, 991.12));
		method.serialize(file, people);
		method.deserialize(file);
		System.out.println(people);
		
	}
}
