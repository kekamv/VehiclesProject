package Vehicles;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	
	public String getDetails() {
		
		return "Brand: "+brand+" diameter "+diameter;
		
	}
}
