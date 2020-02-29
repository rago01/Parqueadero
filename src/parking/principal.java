package parking;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		vehiculo vehiculo1 = new vehiculo();
		tarifa tarifa1 = new tarifa();
		
		
		//INFORMACION VEHICULO
		System.out.println("Ingrese placa del vehiculo:");
		String placa = leer.nextLine();
		vehiculo1.setPlaca(placa);
		
		System.out.println("Ingrese el modelo (año) del vehiculo: ");
		String modelo = leer.nextLine();
		vehiculo1.setPlaca(modelo);
		
		System.out.println("Ingrese el tipo de vehiculo: ");
		String tipoV = leer.nextLine();
		vehiculo1.setPlaca(tipoV);
		
		System.out.println("La placa es: "+vehiculo1.getPlaca());
		
	}

}
