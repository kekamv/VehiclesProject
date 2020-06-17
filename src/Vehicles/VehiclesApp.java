package Vehicles;

import java.util.*;

public class VehiclesApp {

	public static void main(String[] args) {

		//User requested subclass and super class arg:plate, brand, color
		String Product=""; String Plate=""; String Brand=""; String Colour="";
		
		Product= new Entries().enterType(Product);

		Plate = new Entries().enterPlate(Plate);
		
		Brand = new Entries().enterBrand(Brand);
		
		Colour = new Entries().enterColour(Colour);
		
		//Set up of back and front wheels
		
		System.out.println("Plese enter the following back wheel's details");
		System.out.println();
		
		Wheel bwheel=null;
		bwheel=new Entries().enterWheels();

		System.out.println("Plese enter the following front wheel's details");
		System.out.println();
		
		Wheel fwheel=null;
		fwheel=new Entries().enterWheels();
		
		//Set up of vehicle w/wheels and downcasting to appropriate subclass
		
		Vehicle vehicle1=new Products().addProduct(Product, Plate, Brand, Colour);
		
		if (Product.equalsIgnoreCase("C")) {
			Car vehicle1C= (Car)vehicle1;
			
			List <Wheel>bwheelsC= new ArrayList<Wheel>();
			bwheelsC.add(bwheel);
			bwheelsC.add(bwheel);
			
			List <Wheel>fwheelsC= new ArrayList<Wheel>();
			fwheelsC.add(fwheel);
			fwheelsC.add(fwheel);	
			
			try {
				vehicle1C.addWheels(fwheelsC, bwheelsC);
				System.out.print(vehicle1C.getCarDetails());
				
			} catch (Exception e) {
				
				System.out.println("Only identical pairs of wheels are allowed, please review your entry and "
						+ "/nrun the program again");
			}	
				
		}else if (Product.equalsIgnoreCase("B")) {
			Bike vehicle1B= (Bike)vehicle1;
			
			vehicle1B.addWheels(fwheel, bwheel);
			System.out.print(vehicle1B.getBikeDetails());	

		} else {
			System.out.println("Unexpected error occurred");
		}
		
	}
}
