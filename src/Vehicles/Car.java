package Vehicles;

import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels ) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
		
	public String getCarDetails () {

		return "The car was created with following settings: "+
				"\nPlate: "+plate+
				"\nBrand: "+brand+
				"\nColour: "+color+
				"\n"+wheels.size()+" wheels:"+
				"\n"+"\t"+"left front weel: "+wheels.get(0).getDetails()+
				"\n"+"\t"+"right front weel: "+wheels.get(1).getDetails()+
				"\n"+"\t"+"left back weel: "+wheels.get(2).getDetails()+
				"\n"+"\t"+"right back weel: "+wheels.get(3).getDetails();
		
	}
}
