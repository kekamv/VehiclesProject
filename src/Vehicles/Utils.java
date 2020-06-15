package Vehicles;

public class Utils {
	
	String checkPlate (String plate) {
		//Una matrícula ha de tenir 4 números i dues o tres lletres.
		
		int num=0;
		int letter=0;
		int specialc=0;
		
		for (char c:plate.toCharArray()) {
			
			if (Character.isDigit(c)) {
				num++;
				
			}else if(Character.isAlphabetic(c)) {
				letter++;
			
			}else {specialc++;
			}	
		}
		
		if (num==4 && letter>=2 && letter<=3 &&specialc==0) {
			
			return plate;
					
		}else {
			
			throw new IllegalArgumentException("The plate must include four numbers, three letters "+
					"\nand no special characters");
		}
	}	 
	
	double checkDiameter (double diameter) {

		if (diameter >0.4 && diameter < 4) {
			
			return diameter;
			
		}else { throw new IllegalArgumentException("The diameter must be greater than 0.4 and smaller than 4");
		}
	}

}
