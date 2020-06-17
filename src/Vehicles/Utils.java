package Vehicles;

import java.util.*;

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
			
			throw new IllegalArgumentException("The plate must include four numbers, three letters and no special characters");
		}
	}	 
	
	protected String requestDiameter() {	
		
		Scanner scn=new Scanner(System.in);

		System.out.println("Please enter the wheel's diameter, it must be greater than 0,4 and smaller than 4");
		
		String entryUser=scn.nextLine();
		
		return entryUser;
	}

	double setDiameter() {
		
		String entryUser="";
		double diameter=0;
		
		requestDiameter();
		
		if(Double.valueOf(entryUser).isNaN()) {
			
			if(Double.valueOf(entryUser)<4) {
				
				if(Double.valueOf(entryUser)>0.4) {
					
				diameter=Double.valueOf(entryUser).doubleValue();
					
				}else {requestDiameter();	
				}
			}else {requestDiameter();	
			}
		}else{requestDiameter();
		}	
		return diameter;
	}
	
	
}
