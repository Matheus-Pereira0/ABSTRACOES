package br.edu.fatecpg.model;

public class Professor {
	public int idade;
	public Boolean qualificacao = false;
	public Boolean pedagogia;
	public String aConhecimento;
	
	public Professor(int idade, Boolean qualificacao, Boolean pedagogia, String aConhecimento) {
		this.idade = idade;
		this.qualificacao = qualificacao;
		this.pedagogia = pedagogia;
		this.aConhecimento = aConhecimento;
	}
	
	public void darAula() {
		if(qualificacao) {
		System.out.println("O Professor está dando aula de " + aConhecimento);
		} else {
			System.out.println("O Professor não é apto para dar aula");
		}
	}
	
	public void planejarAula() {
		if(qualificacao) {
		System.out.println("O Professor está planejando aula de " + aConhecimento);
		} else {
			System.out.println("O Professor não é apto para dar aula");
		}
	}
}