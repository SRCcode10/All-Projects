package referencing;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, 15000, "iehf");
		Bonus b=s1::bonusCalculation;
		b.addBonus();
		System.out.println(s1);
		
		Bonus b1 = Student::ok;
		b1.addBonus();
		

	}

}
