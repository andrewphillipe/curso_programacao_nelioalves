package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employ = new Employee();
		
		System.out.println("Name: ");
		employ.name = sc.nextLine();
		System.out.println("Salary: ");
		employ.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employ.tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + employ);
		
		System.out.println("Which percentage to increase salary? ");
		double employIncrease = sc.nextDouble();
		employ.increaseSalary(employIncrease);
		
		System.out.println("Updated data: " + employ);
		
		
		sc.close();
	}

}
