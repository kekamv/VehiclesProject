package Vehicles;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		
		//Un diametre de la roda ha de ser superior a 0.4 i inferior a 4
		this.brand = brand;
		this.diameter = new Utils().checkDiameter(diameter);
			
	}
	
	public String getDetails() {
		
		return "Brand: "+brand+" diameter "+diameter;
		
	}
}
