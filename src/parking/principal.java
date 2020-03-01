package parking;

import java.util.Scanner;
public class principal {

	private static Scanner leer;

	public static void main(String[] args) {
		vehiculo vehiculo1 = new vehiculo();
		tarifa tarifa1 = new tarifa();
		

		Scanner leer = new Scanner(System.in);
		//INFORMACION VEHICULO
		System.out.println("Ingrese placa del vehiculo:");
		String placa = leer.nextLine();
		vehiculo1.setPlaca(placa);
		
		System.out.println("Ingrese el modelo (año) del vehiculo debe ser mayor a 1950: ");
		int modelo = leer.nextInt();
		vehiculo1.setModelo(modelo);
		
		System.out.println("Ingrese el tipo de vehiculo:\n 'V' (Vehiculo)\n 'M' (Motocicleta)\n 'B' (Bicicleta): ");
		String tipo = leer.next();
		vehiculo1.setTipo(tipo);
		
		tarifa1.settarifaTipoVehiculo(tipo);

		//INFORMACION DE LA TARIFA

		System.out.println("Ingrese el tiempo de servicio:");
		int tiempo = leer.nextInt();
		tarifa1.setTiempo(tiempo);
		
		System.out.println("Tiempo Parqueadero? :\n 'D' Diurno \n 'N' Nocturno ");
		String tiempoTarifa = leer.next();
		tarifa1.setTiempoTarifa(tiempoTarifa);
		
		System.out.println("La placa es: "+vehiculo1.getPlaca()+
				"\n Tipo de vehiculo:"+vehiculo1.getTipo()+
				"\n Modelo del vehiculo: "+vehiculo1.getModelo()+
				"\n Tiempo de servicio: "+tarifa1.getTiempo());
		
			if (tarifa1.getTiempoTarifa().equals ("N") || tarifa1.getTiempoTarifa().equals ("n")) {
				System.out.print("Recargo Nocturno: 1000");
				int recargo = 1000;
				if (vehiculo1.getTipo().equals ("V") || vehiculo1.getTipo().equals("v")) {
					int valorMinuto = 60;
					if (tarifa1.getTiempo() > 180) {
						int valorTotal = (valorMinuto)*tarifa1.getTiempo()+9000;
						System.out.println("\nTotal a pagar: "+ valorTotal);
					}else {
						int valorTotal = (valorMinuto)*tarifa1.getTiempo();
						int suma = valorTotal+recargo;
						System.out.println("\nTotal a pagar: "+suma);
					}
				}
				if (vehiculo1.getTipo().contentEquals("M") || vehiculo1.getTipo().equals("m")) {
					int valorMinuto= 40;
					if (tarifa1.getTiempo() > 180) {
						int valorTotal = (valorMinuto)*tarifa1.getTiempo()+7000;
						System.out.println("\nTotal a pagar: "+ valorTotal);
					}else {
						int valorTotal = valorMinuto*tarifa1.getTiempo();
						int suma = valorTotal+recargo;
						System.out.println("\nTotal a pagar: "+suma);
					}
				}
				if (vehiculo1.getTipo().equals("B") || vehiculo1.getTipo().equals("b")) {
					int valorMinuto = 20;
					if (tarifa1.getTiempo() > 180) {
						int valorTotal = valorMinuto*tarifa1.getTiempo()+4000;
						System.out.println("Total a pagar: "+valorTotal);
					}else {
						int valorTotal = valorMinuto*tarifa1.getTiempo();
						int suma = valorTotal+recargo;
						System.out.println("\nTotal a pagar: "+ suma);
					}
				}
			} else {
				System.out.print("Reacrgo nocturno: No aplica");
			}
			
			
			
		
	}

}
