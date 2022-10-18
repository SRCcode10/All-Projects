package com.StudenList;

public class MainTest {

	public static void main(String[] args) {
		Student s1 = new Student(1, "sanjit", "abc");
	    Student s2 = new Student(2, "namam", "abc");
	    Student s3 = new Student(3, "goko", "vsd");
	    Student s4 = new Student(4, "sapan", "abc");
	    Student s5 = new Student(5, "hash", "abc");
	    
	    List<Student> nameofStudent = new LinkedList<>();
	     nameofStudent.add(s1);
	     nameofStudent.add(s2);
	     nameofStudent.add(s3);
	     nameofStudent.add(s4);
	     nameofStudent.add(s5);
	     
	     System.out.println(nameofStudent);

	}

}
