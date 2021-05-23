package com.infy.SampleMaven;

import org.springframework.beans.factory.annotation.Autowired;

public class MobileService {
	   private long mobileNumber;
	   private String model;
	   @Autowired(required = false)
	   private MobileFeautre mobileFeautre;
	   
	   
	   public MobileService() {
		System.out.println("MobileService constructor…");
	   }
	   
	   public MobileService(long param1, String param2) {
		   this.mobileNumber = param1;
		   this.model=param2;
	   }
	   
	   public void sampleMethod() {
		   
		   System.out.println("Inside Mobileservice class with mobile model "+ this.model+" and mobile number "+this.mobileNumber);
		   mobileFeautre.feautreMethod();
	   }
}
