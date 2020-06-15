package Vehicles;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		
//Una matrícula ha de tenir 4 números i dues o tres lletres.
		
		this.plate = new Utils().checkPlate(plate);
		this.brand = brand;
		this.color = color;
		
	}
	
	
}
