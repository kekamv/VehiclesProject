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
		
		System.out.println(bwheels_Car1.size()); //esta línea es de control, relacionada con mi consulta al final del ejercicio
		
		
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
	
	/*Jonatan, por favor resuélveme esta duda: si en la clase Car, método 
	 * addTwoWheels(List<Wheel> wheels ) comento así
	 * 
		//this.wheels.add(leftWheel);
		//this.wheels.add(rightWheel);
	* 
	*el resultado que obtengo al imprimir el tamaño de la arraylist es el mismo que si no comento esas líneas ¿??
	*/
	
	/*A continuación incluyo una prueba con otros datos para simular el comportamiento del una matriz similar de String 
	 * y obtengo los resultados esperados, el tamaño de la matriz es 4
	*/
		
		// equivalente a List <Wheel>bwheels_Car1= new ArrayList<Wheel>();
		List <String> pruebaWheels= new ArrayList<String>(); 
		
		
		//equivalente a backWheel_Car1
		String var1="lala";
		
		/*equivalente a 
		 * bwheels_Car1.add(backWheel_Car1);
		 * bwheels_Car1.add(backWheel_Car1);
		 */
		
		pruebaWheels.add(var1);
		pruebaWheels.add(var1);
		
		//aquí entraría en el método addTwoWheels(List<Wheel> wheels )
		String rightWheel = pruebaWheels.get(0);
		String leftWheel = pruebaWheels.get(1);

		pruebaWheels.add(leftWheel);
		pruebaWheels.add(rightWheel);
		
/*aquí el resultado es un array de 4 elementos, que es lo que esperaba encontrar si no comentase ninguna línea del método
 * addTwoWheels(List<Wheel> wheels )  
 */	
		System.out.println(pruebaWheels); 
		
	}

}
