package com.uncheckedEcxeptionDemo;

public class Main {

	public static void main(String[] args) {
		try {
			Employee e = getEmp();
			int num = 10/0;
			e.print();
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
		 catch(Exception e) {
		    System.out.println("Any Other Exception");
		}
		System.out.println("Program Executed");
		    
		private static Employee getEmp() {
		    	Employee e = null;
		    	return e;
		    }
	}

}
