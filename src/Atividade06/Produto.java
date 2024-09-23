package Atividade06;

import java.util.Scanner;

public class Produto {
	Scanner scanner = new Scanner(System.in);
	public String nomeProd;
	public int qtde;
	public double preco;
	
	public Produto(String nomeProd, int qtde, double preco) {
		this.nomeProd = nomeProd;
		this.qtde = qtde;
		this.preco = preco;
	}
	
	public double calculaValorEstoque() {
		return qtde * preco;
	}
	
	public boolean verificaDisponibilidade(int quantidadeDesejada) {
        return qtde >= quantidadeDesejada;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public int getQtde() {
        return qtde;
    }

    public double getPreco() {
        return preco;
    }
	
}
