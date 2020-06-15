package Vehicles;

import java.util.*;

public class VehiclesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fase 1
//1) Demanar a l’usuari la matrícula del cotxe, la marca i el seu color.

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please enter your plate number");
		
		String Plate=scn.nextLine();
		
		System.out.println("Please enter the car's brand");
		
		String Brand=scn.nextLine();
		
		System.out.println("Please enter the car's colour");
		
		String Colour=scn.nextLine();
	
		
//2) Crear el cotxe amb les dades anteriors. 
				
		Car Car1= new Car(Plate, Brand, Colour);
						
		
//3) Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre.

		System.out.println("Please enter the backwheel's brand");
		
		String Brand_back_Car1=scn.nextLine();
		
		System.out.println("Please enter the backwheel's diameter");
		
		double Diameter_Back_Car1=scn.nextDouble();
		
		scn.nextLine();
		
		Wheel backWheel_Car1= new Wheel(Brand_back_Car1, Diameter_Back_Car1);
		
		List <Wheel>bwheels_Car1= new ArrayList<Wheel>();
		
		bwheels_Car1.add(backWheel_Car1);
		
		bwheels_Car1.add(backWheel_Car1);
		
		try {
			
			Car1.addTwoWheels(bwheels_Car1);
			
		} catch (Exception e) {
			
			System.out.println("Only identical pairs of wheels are allowed, please review your entry and "
					+ "/nrun the program again");
		}
		
		System.out.println("The size of the weehls list ist "+bwheels_Car1.size()); 
		
		
//4) Afegir-li dues rodes davanteres demanant a l’usuari la marca i el diametre.
		
		System.out.println("Please enter the frontwheel's brand");
		
		String Brand_front_Car1=scn.nextLine();
		
		System.out.println("Please enter the frontwheel's diameter");
		
		double Diameter_front_Car1=scn.nextDouble();
		
		Wheel frontWheel_Car1= new Wheel(Brand_front_Car1, Diameter_front_Car1);
		
		List <Wheel>fwheels_Car1= new ArrayList<Wheel>();
		
		fwheels_Car1.add(frontWheel_Car1);
		
		fwheels_Car1.add(frontWheel_Car1);
		
		try {
			
			Car1.addTwoWheels(fwheels_Car1);
			
		} catch (Exception e) {
			
			System.out.println("Only identical pairs of wheels are allowed, please review your entry and "
					+ "/nrun the program again");
		}
	scn.close();
	}

}
