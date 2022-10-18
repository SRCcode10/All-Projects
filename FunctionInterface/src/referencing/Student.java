package referencing;

public class Student {
	private int id;
	private int salary;
	private String name;
	
	public Student(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void bonusCalculation() {
		this.salary = this.salary + 1000;
	}
	
	public static void ok() {
		System.out.println("ok");
	}
	
}
