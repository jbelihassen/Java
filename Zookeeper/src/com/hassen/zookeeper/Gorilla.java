package com.hassen.zookeeper;

public class Gorilla extends Mammal {
		
	public Gorilla(int energyLevel) {
		super(energyLevel);
		
	}

		public void  throwSomething () {
			 System.out.println("gorilla has thrown something, as well as decrease the energy level by 5");
			 energyLevel-=5;
			 displayEnergy(); 
			
		}

	  public void  EatBananas () {
			 System.out.println("satisfaction and increase its energy by 10");
			 energyLevel+=10;
			 displayEnergy();
						
		}
		
	  public void  Climb () {
			 System.out.println("the gorilla has climbed a tree and decrease its energy by 10");
			 energyLevel-=10;
			 displayEnergy();
			 			
		}
		

}
