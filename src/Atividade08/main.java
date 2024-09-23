package Atividade08;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a Marca do veiculo: ");
        String marca = scanner.nextLine();
        
        System.out.println("Digite o Modelo do veiculo: ");
        String modelo = scanner.nextLine();
        
        System.out.println("Digite a Velocidade Atual: ");
        double velocidade = scanner.nextDouble();
        scanner.nextLine();
        
        Carro carro = new Carro(marca, modelo, velocidade); 
        
        while (true) {
            System.out.println("=== Painel de Controle ===");
            System.out.println("| 1-> Exibir Velocidade  |");
            System.out.println("| 2-> Acelerar           |");
            System.out.println("| 3-> Frear !!           |");
            System.out.println("| 4-> Status do Carro    |");
            System.out.println("| 5-> Sair               |");
            System.out.println("==========================");
            int opc = scanner.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Velocidade Atual: Km/h " + carro.getVelocidadeAtual()); 
                    break;
                case 2:
                    carro.acelerar();  
                    System.out.println("Velocidade Atual: Km/h " + carro.getVelocidadeAtual());
                    break;
                case 3:
                    carro.frear();  
                    System.out.println("Velocidade Atual: Km/h " + carro.getVelocidadeAtual());
                    break;
                case 4:
                    carro.exibirStatus(); 
                    break;
                case 5:
                    System.out.println("Saindo...");
                    System.out.println("Bancos ejetados com sucesso!...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
