package br.edu.fatecpg.model;

public class Arquiteto {

	public String tituloArquitetonico;
	public String CAU;
	public String especializacao;
	public String tipoProjeto;

	public Arquiteto(String tituloArquitetonico, String CAU, String especializacao, String tipoProjeto) {
		this.tituloArquitetonico = tituloArquitetonico;
		this.CAU = CAU;
		this.especializacao = especializacao;
		this.tipoProjeto = tipoProjeto;
	}

	public void projetar() {
		if(CAU == "") {
			System.out.println("Esse profissional não possui autorização para ser arquiteto.");
		} else {
			System.out.println("O arquiteto está projetando um projeto " + tipoProjeto + ".");
		}
	}

	public void planejar() {
		if(CAU == "") {
			System.out.println("Esse profissional não possui autorização para ser arquiteto.");
		} else {
			System.out.println("O arquiteto está planejando um projeto.");
		}
	}
}