package Vehicles;

public class Products {

	Vehicle addProduct (String Product, String Plate, String Brand, String Colour) {

		Vehicle product = null;

		switch (Product) {
	
		case "B":
			product= new Bike(Plate, Brand, Colour);
			break;
	
		case "C":
			product= new Car(Plate, Brand, Colour);
			break;
	
		default:
			System.out.println("Please enter /nB for a bike n/C for a car");	
		}
		return product;
	}	
	

}
