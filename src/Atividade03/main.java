package Atividade03;

import java.util.Scanner;

import Atividade02.ContaBancaria;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a altura do retângulo: ");
		double altura = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println("Digite a largura do retângulo: ");
		double base = scanner.nextDouble();
		
		Retangulo retangulo = new Retangulo(altura,base);
		
		while(true) {
			System.out.println("\n Digite a operação que você deseja saber");
			System.out.println(" 1--> Resultado Area");
			System.out.println(" 2--> Resultado Perimetro");
			System.out.println(" 3--> Sair");
			int opc = scanner.nextInt();
			scanner.nextLine();
			
			switch(opc) {
			case 1:
				System.out.println("Area: "+ retangulo.calcularArea());
				break;
			case 2:
				System.out.println("Perimetro: "+ retangulo.calculaPerimetro());
				break;
			case 3:
				scanner.close();
				return;
			}
		}
	}

}
