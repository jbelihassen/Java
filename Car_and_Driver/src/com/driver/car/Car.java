package com.driver.car;

public class Car {
	
	 //  Members variables //
	
	   public int gas = 10;
	 
	 //  Constructor  //
	
	   public Car(int gas) {
	        this.gas = gas;
	    }
	      
	 //  Methods  // 
	   
	public void status(){
	  System.out.println("Gas remaining: "+gas+"/10");
	  
	    }

	// GETTERS AND SETTERS


	public int getGas() {
		return gas;
	}


	public void setGas(int gas) {
		this.gas = gas;
	}
	
}
