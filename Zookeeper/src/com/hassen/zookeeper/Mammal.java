package com.hassen.zookeeper;

public class Mammal {
	
 //	Member variables
	public int energyLevel;

	
	
// METHODS
	 
	 public void displayEnergy() {
		 System.out.println(String.format("energyLevel: %d \n",this.getEnergyLevel()));
		
	 }	
	
	
	
 // CONSTRUCTOR	
	public Mammal(int energyLevel) {
     this.energyLevel = energyLevel;
	
    }

	
	

 // GETTERS AND SETTERS	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	

}
