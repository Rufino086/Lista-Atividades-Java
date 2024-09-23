package Atividade06;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Digite o nome do Produto: ");
	String nomeProd = scanner.nextLine();
	
	System.out.println("Digite a quantidade há do Produto: ");
	int qtde = scanner.nextInt();
	
	System.out.println("Digite o preço do Produto: ");
	double preco = scanner.nextDouble();
	
	Produto produto = new Produto(nomeProd, qtde, preco);
	
	while (true) {
		System.out.println("\n\n\n\n Insira a opção que você deseja realizar \n");
		System.out.println(" 1- Listar Produtos Cadastrados ");
		System.out.println(" 2- Valor total em estoque  ");
		System.out.println(" 3- Verificar disponibilidade do produto ");
		System.out.println(" 4- Sair ");
		System.out.println("Escolha uma opcao: ");
		int opcao = scanner.nextInt();
		
		 switch (opcao) {
         case 1:
             System.out.println("\n\nProduto: " + produto.getNomeProd());
             System.out.println("Quantidade em estoque: " + produto.getQtde());
             System.out.println("Preço unitário: R$" + produto.getPreco());
             break;

         case 2:
             double valorEstoque = produto.calculaValorEstoque();
             System.out.println("\n\nValor total em estoque: R$" + valorEstoque);
             break;

         case 3:
             System.out.println("\n\nDigite a quantidade que você procura: ");
             int quantidadeDesejada = scanner.nextInt();
             if (produto.verificaDisponibilidade(quantidadeDesejada)) {
                 System.out.println("Produto disponível.");
             } else {
                 System.out.println("Produto indisponível.");
             }
             break;

         case 4:
             System.out.println("Sessão encerrada.");
             scanner.close();
             return;

         default:
             System.out.println("Opção inválida.");
             break;
     }
		
	 }
	}

}
