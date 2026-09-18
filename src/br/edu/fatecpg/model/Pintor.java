package br.edu.fatecpg.model;

public class Pintor {

	public String tecnicaUtilizada;
	public String materiais;
	public String estiloArtistico;
	public String areaAtuacao;

	public Pintor(String tecnicaUtilizada, String materiais, String estiloArtistico, String areaAtuacao) {
		this.tecnicaUtilizada = tecnicaUtilizada;
		this.materiais = materiais;
		this.estiloArtistico = estiloArtistico;
		this.areaAtuacao = areaAtuacao;
	}

	public void pintar() {
		if(materiais == "") {
			System.out.println("O pintor não possui materiais para pintar.");
		} else {
			System.out.println("O pintor está pintando utilizando a técnica " + tecnicaUtilizada + ".");
		}
	}

	public void restaurar() {
		if(materiais == "") {
			System.out.println("O pintor não possui materiais para trabalhar.");
		} else {
			System.out.println("O pintor está restaurando uma pintura.");
		}
	}
}