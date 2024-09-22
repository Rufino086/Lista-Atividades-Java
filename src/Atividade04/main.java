package Atividade04;

import java.util.Scanner;

import Atividade03.Retangulo;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o noem do Aluno: ");
		String nome = scanner.nextLine();
		
		System.out.println("\nDigite o ID do Aluno: ");
		int idAluno = scanner.nextInt();
		
		Aluno aluno = new Aluno(nome, idAluno);
		
		while(true) {
			System.out.println(" 1- Inserir notas ");
			System.out.println(" 2- Calcular Média");
			System.out.println(" 3- Status Aluno");
			System.out.println(" 4- Sair");
			System.out.println("Digite oque você deseja fazer: ");
			int opc = scanner.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("Digite a nota (ou -1 para parar): ");
				while (true) {
                    double nota = scanner.nextDouble();
                    if (nota == -1) {
                        break;
                    }
                    aluno.adicionarNota(nota);
                }
				break;
			case 2:
				System.out.println("\nMédia do Aluno: \n" + aluno.calculaMedia());
                break;
			case 3:
				System.out.println("\nStatus do Aluno: \n" + aluno.verificarSituacao());
                break;
			case 4:
				System.out.println("Sessão encerrada.");
                scanner.close();
				return;
			default:
                System.out.println("Opção inválida!");
                break;
			}
			
		}
	}

}
