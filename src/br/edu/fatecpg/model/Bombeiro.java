package br.edu.fatecpg.model;

public class Bombeiro {
	public String patente;
	public String especializacao;
	public String unidade;
	public String treinamento;
	
	public Bombeiro(String patente, String especializacao, String unidade, String treinamento) {
		this.patente = patente;
		this.especializacao = especializacao;
		this.unidade = unidade;
		this.treinamento = treinamento;
	}
	
	public void Resgatar() {
		System.out.println("O bombeiro está resgatando o civil!");
	}
	
	public void CombaterIncendio() {
		System.out.println("O bombeiro está combatendo o incêndio! 💦🔥");
	}
}
