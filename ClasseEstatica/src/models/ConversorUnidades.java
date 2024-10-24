package models;

public class ConversorUnidades {
	//Declarando atributos
	public static double celcius;
	public static double quilometros;
	public static double gramas;

	//Método estático que converte de celcius para Fahreinheit
	public static double celciusParaFahreinheit(double celsius) {
		return (celcius * 1.8) + 32;
	}
	
	//Método estático que converte de quilometros para milhas
	public static double quilometrosParaMilhas(double quilometros) {
		return quilometros * 0.621371;
	}
	
	//Método estático que converte de gramas para libras
	public static double gramasParaLibras(double gramas) {
		return gramas * 453.597;
	}
}
