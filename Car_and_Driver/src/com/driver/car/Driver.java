package com.driver.car;
public class Driver extends Car {

	
	// Constructor
	
	public Driver(int gas) {
		super(gas);
		
	}
   // Methods

	
  public void  drive () {
		 System.out.println("Drive four times");
		 gas--;	
		status();
	}

  public void  boost () {
		 System.out.println("Use boosters once");
		 gas-=3;	
		 status();
	}
	
  public void  refuel () {
		 System.out.println("Refuel three times");
		 gas+=2;	
		 status();
	}
}
