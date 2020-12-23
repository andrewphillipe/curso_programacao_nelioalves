package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Informa o nome do aluno: ");
		student.name = sc.nextLine();
		System.out.println("Informe a primeira nota: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Informe a terceira nota: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println("Nome: " + student.name);
		System.out.println("Final Grade: " + student.finalGrade());
		
		if (student.finalGrade() > 60) {
			System.out.println("PASS");
		} else {
			
			
			System.out.printf("Missing: %.2f points", student.missingPoints());
		}
		
		
		sc.close();
		

	}

}
