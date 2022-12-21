package paquete1;

import java.util.*;

//PASAR SEGUNDOS A MHORAS Y MINUTOS

public class Clase1 {

	public static Scanner entrada = new Scanner(System.in);
	
	public static double pedirDatos(double segundos) {
		
		System.out.println("Introduce un número entero");
		
		segundos = entrada.nextInt();
		
		return segundos;
		
	}
	
	public static void pasarAHoras (double segundos) {
		
		double minutos = 0;
		
		double horas = 0;
		
		while (segundos >= 60) {
			
			if (segundos >= 60) {
			
				segundos = segundos - 60;
				
				minutos++;
			
			}
		}
		
		while (minutos >= 60) {
		
			if (minutos >= 60) {
			
				minutos = minutos - 60;
				
				horas++;
			
			}
		}
		
		System.out.printf(segundos + " son %.0f horas, %.0f minutos y %.0f.", horas, minutos, segundos);
		
	}
	
	public static void main(String[] args) {

		double segundos = 0;
		
		segundos = pedirDatos(segundos);
		
		pasarAHoras(segundos);

	}

}
