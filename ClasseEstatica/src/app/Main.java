package app;
import models.*; //Importando package models


public class Main {
	public static void main(String[] args) {
		
		//Utilizando o método que converte de celcius para Fahreinheit
		double gramas = 20.0;
		double libras = ConversorUnidades.gramasParaLibras(gramas);
		System.out.println("Gramas: " + gramas + "\nLibras: " + libras + "\n");
		
		//Utilizando o método que converte de quilometros para milhas
		double quilometros = 20.0;
		double milhas = ConversorUnidades.quilometrosParaMilhas(quilometros);
		System.out.println("Quilometros: " + quilometros + "\nMilhas: " + milhas + "\n");

		//Utilizando o método que converte de gramas para libras
		double celcius = 20.0;
		double Fahreinheit = ConversorUnidades.celciusParaFahreinheit(celcius);
		System.out.println("Celcius: " + celcius + "\nFahreinheit: " + Fahreinheit + "\n");

	}

}
