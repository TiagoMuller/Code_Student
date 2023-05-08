package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double mediaStudent() {
		return  n1 + n2 + n3;
	}
	
	public String verify() {
		if(mediaStudent() > 60) {
			return "\nPASS";
		}else {
			double result = 60 - mediaStudent();
			return "\nFAILED" + "\nMISSING " + result + " POINTS";
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", mediaStudent()) + verify();
	}
}
