package com.hassen.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
	
		Gorilla gorilla   = new  Gorilla(100);
		
		
		
		gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.EatBananas();
        gorilla.EatBananas();
        gorilla.Climb();

        gorilla.displayEnergy(); // expected output: Energy level: 95

	}

}
