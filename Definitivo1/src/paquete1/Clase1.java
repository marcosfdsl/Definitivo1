package paquete1;

import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase");

		String frase = sc.nextLine();

		System.out.println("Introduce un numero");
		int numero=sc.nextInt();
		int factorial=1;
		
		for (int i=2;i<=numero;i++) {
		factorial=factorial * i;	
		}
		
		System.out.println("El factorial del número "+Integer.toString(numero)+ " es " +Integer.toString(factorial));

		System.out.println("Escribe una letra");

		char letra = sc.next().charAt(0);

		System.out.println("La letra " + letra + " se repite " + conteoLetra(frase, letra) + " veces.");

		double segundos = 0;
		
		segundos = pedirDatos(segundos);
		
		pasarAHoras(segundos, segundos);
		
		}

	public static int conteoLetra(String frase, char letra) {

		int contador = 0;
		
		for (char l : frase.toCharArray()) {

		if(l == letra)

		contador++;

		}

		return contador;

		}
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static double pedirDatos(double segundos) {
		
		System.out.println("Introduce un número entero");
		
		segundos = entrada.nextInt();
		
		return segundos;
		
	}
	
	public static void pasarAHoras (double segundos, double segundosAux) {
		
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
		
		System.out.printf("%.0f segundos son %.0f horas, %.0f minutos y %.0f segundos.", segundosAux, horas, minutos, segundos);
		
	} 
}
