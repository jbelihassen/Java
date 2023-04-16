package com.hassen.zookeeper;

public class Bat extends Mammal {

	public Bat(int energyLevel) {
		super(energyLevel);
			
	}
	
	
    public void  fly() {
			 System.out.println("the sound of a bat taking off and decrease its energy by 50");
			 energyLevel-=50;
			 displayEnergy(); 
			 

		}

	public void  eatHumans() {
			 System.out.println("the so- well, never mind, just increase its energy by 25");
			 energyLevel+=25;	
			 displayEnergy(); 
		}
		
	public void  attackTown() {
			 System.out.println("the sound of a town on fire and decrease its energy by 100.");
			 energyLevel-=100;
			 displayEnergy(); 
			 			
		}

}
