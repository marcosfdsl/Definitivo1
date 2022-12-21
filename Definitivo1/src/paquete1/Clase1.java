package paquete1;

import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {
		
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=src.nextInt();
		int factorial=1;
		
		for (int i=2;i<=numero;i++) {
		factorial=factorial * i;	
		}
	System.out.println("El factorial del número "+Integer.toString(numero)+ " es " +Integer.toString(factorial));
	}


	}
