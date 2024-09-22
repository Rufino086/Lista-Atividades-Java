package Atividade05;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do Funcionario: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o salario bruto do funcionario: ");
        double salario = scanner.nextDouble();
        
        System.out.println("\nDigite o cargo do funcionario: ");
        System.out.println(" 1-> Analista de Recursos Humanos");
        System.out.println(" 2-> Contador");
        System.out.println(" 3-> Gestor de Benefícios");
        System.out.println(" 4-> Garoto(a) de Programa \n");
        int cargo = scanner.nextInt();
        
        Funcionario funcionario = new Funcionario(nome, salario, cargo);
        
        while (true) {
            System.out.println("Digite a operação que deseja realizar ");
            System.out.println("( 1 ) - Salário Bruto ");
            System.out.println("( 2 ) - Salário Líquido");
            System.out.println("( 3 ) - Sair ");
            int opc = scanner.nextInt();    
            
            switch (opc) {
                case 1:
                    System.out.println("\n O salário Bruto do Funcionario é: R$ " + salario);
                    System.out.println("\n");
                    break;
                case 2:
                    double salarioliquido = funcionario.calculaSalarioLiq();
                    System.out.println("\n O salário líquido do Funcionario é: R$ " + salarioliquido);
                    System.out.println("\n");
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("\n Opção inválida! \n");
                    break;
            }
        }
    }
}
