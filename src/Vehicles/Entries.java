package Vehicles;

import java.util.*;

public class Entries {
	
	Scanner scn=new Scanner(System.in);
	
	String enterType (String vType) {
		
		do {
			System.out.println("Please enter the vehicle's type \nB for a bike \nC for a car");
			vType=scn.nextLine().toUpperCase();
			
		}while (!vType.equalsIgnoreCase("B") && !vType.equalsIgnoreCase("C"));

		return vType;
	}
	
	public String enterPlate (String Plate) {
		
		try{
			System.out.println("Please enter the plate number");
			Plate=new Utils().checkPlate(scn.nextLine());
		
		} catch(Exception e) {
			
			System.out.println("The plate must include four numbers, three letters and no special characters");
			enterPlate (Plate);
		}
		
		return Plate;
	}

	String enterBrand (String Brand) {
		
		System.out.println("Please enter the vehicle's brand");
		
		Brand=scn.nextLine();
		
		return Brand;
	}
	
	
	String enterColour (String Colour) {
		
		System.out.println("Please enter the vehicle's colour");
		
		Colour=scn.nextLine();
		
		return Colour;	
	}
	
	Wheel enterWheels () {
		
		System.out.println("Please enter the wheel's brand");
		
		String brandW=scn.nextLine();
		
		double diameter=0;
		
		String entryUser;

		do {
			entryUser=new Utils().requestDiameter();
			try{
				if(Double.valueOf(entryUser)<4 && Double.valueOf(entryUser)>0.4) {
						
				diameter=Double.valueOf(entryUser).doubleValue();
						
				}else {entryUser=new Utils().requestDiameter();
				}
			}catch (NumberFormatException nfe) {
					
				System.out.println("Please note numbers use comma as decimal separator");
			}
		}
		while(diameter==0);	
		
		Wheel wheel;
			
		return wheel= new Wheel(brandW, diameter);
		
	}
}
