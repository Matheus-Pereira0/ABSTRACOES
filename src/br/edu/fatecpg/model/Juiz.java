package br.edu.fatecpg.model;

public class Juiz {

	public String vara;
	public String areaJuridica;
	public String comarca;
	public String instancia;

	public Juiz(String vara, String areaJuridica, String comarca, String instancia) {
		this.vara = vara;
		this.areaJuridica = areaJuridica;
		this.comarca = comarca;
		this.instancia = instancia;
	}

	public void julgar() {
		if(vara == "") {
			System.out.println("O juiz não possui uma vara definida.");
		} else {
			System.out.println("O juiz está julgando um processo da área " + areaJuridica + ".");
		}
	}

	public void sentenciar() {
		if(vara == "") {
			System.out.println("O juiz não possui uma vara definida.");
		} else {
			System.out.println("O juiz está dando uma sentença.");
		}
	}
}