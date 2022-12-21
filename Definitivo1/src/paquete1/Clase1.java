package paquete1;

import java.util.Scanner;

public class Clase1 {
	
	//F1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String string1 = "Entornos de desarrollo es la mejor asignatura";
		String string2 = "Bases de datos es muy entretenida";
		
		System.out.println("Cuantas veces quieres que se repitan: ");
		int rep = sc.nextInt();
		
		System.out.println("\nRepitiendo... \n");
		for(int i=0;i<rep;i++) {
			System.out.println(string1);
			System.out.println(string2);
		}
	}

}
