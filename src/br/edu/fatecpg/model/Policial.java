package br.edu.fatecpg.model;

public class Policial {
	public String patente;
	public String unidade;
	public String funcao;
	public String especializacao;
	
	public Policial(String patente, String unidade, String funcao, String especializacao) {
		this.patente = patente;
		this.unidade = unidade;
		this.funcao = funcao;
		this.especializacao = especializacao;
	}
	
	public void Patrulhar() {
		System.out.println("O policial está patrulhando!");
	}
	
	public void Investigar() {
		System.out.println("O policial está investigando.");
	}
}