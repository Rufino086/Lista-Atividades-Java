package Atividade03;

public class Retangulo {
	public double altura;
	public double base;
	
	public Retangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}
	
	
	public double getAltura() {
		return altura;
	}
	
	public double getBase() {
		return base;
	}
	
	
	public double calcularArea() {
		return altura * base;
	}
	
	public double calculaPerimetro() {
		return 2 * (altura + base);
	}
	
}
