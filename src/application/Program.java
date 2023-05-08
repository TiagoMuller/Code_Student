package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();

		System.out.println("Enter name: ");
		student.name = sc.nextLine();
		System.out.println("n1: ");
		student.n1 = sc.nextDouble();
		System.out.println("n2: ");
		student.n2 = sc.nextDouble();
		System.out.println("n3: ");
		student.n3 = sc.nextDouble();
		
		System.out.println(student.toString());
		sc.close();
	}

}
