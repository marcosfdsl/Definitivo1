package paquete1;

import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_YELLOW = "\u001B[33m";
		final String ANSI_GREEN = "\u001B[32m";
		Scanner entrada = new Scanner(System.in);
		System.out.println(ANSI_YELLOW+"Introduce una palabra: "+ANSI_RESET);
		String palabra1 = entrada.nextLine();
		char letras[]= palabra1.toCharArray();
		StringBuilder palabra = new StringBuilder(palabra1);
		for(int i=0;i<palabra1.length();i++) {
		    palabra.insert(i+i,letras[i]);
		}
		System.out.println(ANSI_GREEN+palabra);

	}

}
