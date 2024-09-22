package Atividade05;

public class Funcionario {
    public String nome;
    public double salario;
    public int cargo;
    
    public Funcionario(String nome, double salario, int cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public double calculaSalarioLiq() {
        double descontos = 0;
        double beneficios = 0;

        switch (cargo) {
            case 1: 
            	descontos = 600; 
                beneficios = 600 + 300; 
                System.out.println("Benefícios: ");
                System.out.println("Vale-refeição: R$ 600,00");
                System.out.println("Assistência médica: R$ 300,00");
                break;
            case 2: 
                descontos = 600; 
                beneficios = 1000 + 400; 
                System.out.println("Benefícios: ");
                System.out.println("Participação dos lucros: R$ 1.000,00");
                System.out.println("Assistência médica: R$ 400,00");
                break;
            case 3: 
                descontos = 1000; 
                beneficios = 800 + 500; 
                System.out.println("Benefícios: ");
                System.out.println("Vale-refeição: R$ 800,00");
                System.out.println("Curso de capacitação: R$ 500,00");
                break;
            case 4: 
                descontos = 0;
                beneficios = 500 + 600;
                System.out.println("Benefícios: ");
                System.out.println("Assistência psicológica 24h");
                System.out.println("Vale alimentação: R$ 500,00");
                System.out.println("Vale PC Gamer: R$ 600,00");
                break;
            default:
                System.out.println("Opção inválida");
                return 0; 
        }

        double salarioLiquido = salario - descontos + beneficios;
        
        System.out.println("Descontos: R$ " + descontos);
        System.out.println("Salário Bruto: R$ " + salario);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
        
        return salarioLiquido;
    }
}
