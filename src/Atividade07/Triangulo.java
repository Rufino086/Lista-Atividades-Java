package Atividade07;

public class Triangulo {
	public double ld1;
	public double ld2;
	public double ld3;
	
	public Triangulo(double ld1, double ld2, double ld3) {
		this.ld1=ld1;
		this.ld2=ld2;
		this.ld3=ld3;
	}
	
	public boolean  ehTriangulo() {
		return (ld1 + ld2 > ld3) && (ld1 + ld3 > ld2) && (ld2 + ld3 > ld1);
	}
	
	public double calculaArea() {
		if(!ehTriangulo()) {
			System.out.println("Os lados informados não formam um trinagulo! ");
			return 0;
			}
		
		double perimetro = (ld1 + ld2 + ld3) /2;
		return Math.sqrt(perimetro * (perimetro - ld1) * (perimetro - ld2) * (perimetro - ld3));
	}
	
}
