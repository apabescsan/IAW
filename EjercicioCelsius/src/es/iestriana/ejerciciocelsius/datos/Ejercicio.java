package es.iestriana.ejerciciocelsius.datos;

import java.util.Scanner;

public class Ejercicio {
	
	/*
	 * Programa que realice la conversi�n de grados Celsius a Fahrenheit
	 * Los grados celsius debe introducirlos el usuario
	 */

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Grados Celsius: ");
		double gradosCelsius = sc.nextDouble();
		// Convertir a Fahrenheit
		double gradosFahrenheit = (gradosCelsius * 1.8) + 32;
		
		System.out.println(gradosCelsius + " grados celsius son " + gradosFahrenheit + " grados fahrenheit");
	}

}
