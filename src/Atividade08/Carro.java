package Atividade08;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidade;

    public Carro(String marca, String modelo, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public double getVelocidadeAtual() {
        return this.velocidade;
    }

    public void acelerar() {
        System.out.println("Sua velocidade atual é: Km/h " + this.velocidade);
        System.out.println("Você recebeu um boost! + 25 km/h");
        this.velocidade += 25.00;  // Corrigido: somando apenas 25 à velocidade atual
    }

    public void frear() {
        System.out.println("Você escolheu frear o carro!");
        System.out.println("\nERRO!! Sistema ABS inativo!");
        this.velocidade = Math.max(0, this.velocidade - 5.00); // Reduz a velocidade, mas não deixa negativa
    }

    public void exibirStatus() {
        System.out.println("=== Status do Carro ===");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade Atual: Km/h " + this.velocidade);
        System.out.println("=======================");
    }
}
