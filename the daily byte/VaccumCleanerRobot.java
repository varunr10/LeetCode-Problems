package com.dailybyte;

public class VaccumCleanerRobot {
	public static boolean routeVaccumCleaner(String input) {
		
		if(input.contentEquals("") || input == null) return false;
			
		int leftRight = 0;
		int topDown = 0;

		for(Character c : input.toCharArray()) {

			if(c.equals('L'))
				leftRight -= 1;
			if(c.equals('R'))
				leftRight += 1;
			if(c.equals('U'))
				topDown += 1;
			if(c.equals('D'))
				topDown -= 1;
		}	
		return (topDown == 0 && leftRight == 0) ? true : false;
	}

	public static void main(String[] args) {

		System.out.println(routeVaccumCleaner("LR")); 		//True
		System.out.println(routeVaccumCleaner("URURD"));	//False
 		System.out.println(routeVaccumCleaner("RUULLDRD")); //True
	}
}
