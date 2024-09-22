package Atividade01;

import java.util.Scanner;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        return Math.PI * raio * raio;
    }

    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
}
