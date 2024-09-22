package Atividade04;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int idAluno;
	private List<Double> notas;
	
	
	public Aluno(String nome, int idAluno) {
		this.nome = nome;
		this.idAluno = idAluno;
		this.notas = new ArrayList<>();
	}
	
	public void adicionarNota(double nota){
		notas.add(nota);
	}
	
	public double calculaMedia() {
		double soma=0;
		for(double nota : notas) {
			soma +=nota;
		}
		
		return notas.isEmpty() ? 0 : soma/ notas.size();
	}
	
	public String verificarSituacao() {
		double media = calculaMedia();
		System.out.println("\n\nID do Aluno: " +idAluno);
		System.out.println("Nome do Aluno: " +nome);
		System.out.println("Média: " +media);
		if (media >= 60) {
			return "Aprovado \n";
		} else {
			return "Reprovado! kkkkkkkkkkkkkkkkkkkkkkk \n";
		}
	}
	
	  public String getNome() {
	        return nome;
	    }

	    public int getMatricula() {
	        return idAluno;
	    }

}
