package paquete1;

import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase");

		String frase = sc.nextLine();
		
		Scanner src= new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=src.nextInt();
		int factorial=1;
		
		for (int i=2;i<=numero;i++) {
		factorial=factorial * i;	
		}
	System.out.println("El factorial del número "+Integer.toString(numero)+ " es " +Integer.toString(factorial));

		System.out.println("Escribe una letra");

		char letra = sc.next().charAt(0);

		System.out.println("La letra " + letra + " se repite " + conteoLetra(frase, letra) + " veces.");

		}

		public static int conteoLetra(String frase, char letra) {

		int contador = 0;
		
		for (char l : frase.toCharArray()) {

		if(l == letra)

		contador++;

		}

		return contador;

		}
}
