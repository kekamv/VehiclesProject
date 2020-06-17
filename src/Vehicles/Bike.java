package Vehicles;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheels (Wheel frontWheel,Wheel backWheel){
		
		this.wheels.add(frontWheel);
		this.wheels.add(backWheel);
	}
		
	public String getBikeDetails () {

		return "The bike was created with following settings: "+
				"\nPlate: "+plate+
				"\nBrand: "+brand+
				"\nColour: "+color+
				"\n"+wheels.size()+" wheels:"+
				"\n"+"\t"+"front weel: "+wheels.get(0).getDetails()+
				"\n"+"\t"+"back weel: "+wheels.get(1).getDetails();
	}
}
