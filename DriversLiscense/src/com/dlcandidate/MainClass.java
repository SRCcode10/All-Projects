package com.dlcandidate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainClass {

	public static void main(String[] args) {
		
		Log log = LogFactory.getLog(MainClass.class);
		
		candidate dl1 = new candidate("sanjit", 21, 1, 0);
		try {
			dl1.check();
		}
		catch (Exception e){
			log.error("error occured");
			
		}

//		dl1.checkAge();
//		dl1.verifyMedical();
//		dl1.verifyPolice();
		
		candidate dl2 = new candidate("Tushar", 24, 0, 1);
		dl2.checkAge();
		dl2.verifyMedical();
		dl2.verifyPolice();
		
		candidate dl3 = new candidate("aditya", 17, 1, 1);
		dl3.checkAge();
		dl3.verifyMedical();
		dl3.verifyPolice();
		
		candidate dl4 = new candidate("sarthak", 22, 0, 0);
		dl4.checkAge();
		dl4.verifyMedical();
		dl4.verifyPolice();
	}

}
