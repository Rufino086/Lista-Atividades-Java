package Atividade02;

import java.util.Scanner;

public class main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Digite o ID da conta:  ");
		int idConta = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Digite o nome do titular da conta:  ");
		String nome = scanner.nextLine();
		
		double saldo = 00.01;
		
		ContaBancaria conta = new ContaBancaria(idConta,nome,saldo);
		
		while (true) {
			System.out.println("\n\n\n\n Insira a opção que você deseja realizar \n");
			System.out.println(" 1- Verificar Status Atual ");
			System.out.println(" 2- Realizar deposito ");
			System.out.println(" 3- Realizar saque ");
			System.out.println(" 4- Sair ");
			System.out.println("Escolha uma opcao: ");
			int opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("ID:" +idConta);
				System.out.println("Nome: "+nome);
				System.out.println("\n Saldo Atual: "+conta.consultaSaldo());
				break;
			case 2:
				System.out.println("\n Digite o valor que você deseja depositar: \n R$: ");
				double valor = scanner.nextDouble();
				conta.deposito(valor);
				System.out.println("\n Operação Concluida!\n Saldo atual: R$"+conta.consultaSaldo());
				break;
			case 3:
				System.out.println("Digite o valor do saque que você deseja realziar: \n R$ ");
				valor = scanner.nextDouble();
				conta.sacar(valor);
				System.out.println("\n Operação Concluida! \n Saldo atual: R$"+conta.consultaSaldo());
				break;
			case 4:
				System.out.println("Sessão Encerrada");
				scanner.close();
				return;
			default:
				System.out.println("\n Opção invalida! ");
				scanner.close();
				break;
			}
			
		}
		
 }
}
