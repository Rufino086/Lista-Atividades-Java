package Atividade01;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do Circulo: ");
		double raio = scanner.nextDouble();
		
		Circulo circulo = new Circulo(raio);
		
		double area = circulo.calculaArea();
	    double perimetro = circulo.calculaPerimetro();
	     
		System.out.println("A área do circulo é: " + area);
		System.out.println("O perímetro do circulo é: " + perimetro);
	}
}
