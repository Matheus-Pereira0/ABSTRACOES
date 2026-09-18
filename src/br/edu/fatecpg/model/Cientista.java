package br.edu.fatecpg.model;

public class Cientista {

	public String areaPesquisa;
	public String formacao;
	public String linhaEstudo;
	public String laboratorio;

	public Cientista(String areaPesquisa, String formacao, String linhaEstudo, String laboratorio) {
		this.areaPesquisa = areaPesquisa;
		this.formacao = formacao;
		this.linhaEstudo = linhaEstudo;
		this.laboratorio = laboratorio;
	}

	public void pesquisar() {
		if(laboratorio == "") {
			System.out.println("O cientista não possui um laboratório definido.");
		} else {
			System.out.println("O cientista está pesquisando sobre " + linhaEstudo + ".");
		}
	}

	public void experimentar() {
		if(laboratorio == "") {
			System.out.println("O cientista não possui um laboratório definido.");
		} else {
			System.out.println("O cientista está realizando um experimento.");
		}
	}
}