package Atividade07;

import java.util.Scanner;
/*Crie uma classe chamada “Triângulo” com atributos para armazenar os três lados do
triângulo. Implemente métodos para verificar se é um triângulo válido e calcular sua área.*/

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o 1° lado do Triangulo:   ");
		double ld1 = scanner.nextDouble();
		
		System.out.println("Digite o 2° lado do Triangulo:   ");
		double ld2 = scanner.nextDouble();
		
		System.out.println("Digite o 3° lado do Triangulo:   ");
		double ld3 = scanner.nextDouble();
		
		Triangulo triangulo = new Triangulo(ld1, ld2, ld3);
		
		while (true) {
			System.out.println("Esolha uma opção:  ");
			System.out.println(" 1--> É um triangulo?  ");
			System.out.println(" 2--> Saber a área ");
			System.out.println(" 3--> Sair ");
			int opc = scanner.nextInt();
			
			 switch (opc) {
	         case 1:
	             if (triangulo.ehTriangulo()) {
	                 System.out.println("Sim, voce formou um Triangulo!");
	             } else {
	                 System.out.println("isso NÃO é um TRIANGULO");
	             }
	             break;
	         case 2:
	             double area = triangulo.calculaArea();
	             if (area > 0) {
	                 System.out.println("A area do triangulo eh: " + area);
	             }
	             break;
	         case 3:
	             System.out.println("Saindo...");
	             scanner.close();
	             return;
	         default:
	             System.out.println("Opção inválida!");
	     }
		}
	}

}
