package br.edu.fatecpg.model;

public class Advogado {

	public String areaJuridica;
	public String especializacao;
	public String numeroOAB;
	public String tipoCliente;

	public Advogado(String areaJuridica, String especializacao, String numeroOAB, String tipoCliente) {
		this.areaJuridica = areaJuridica;
		this.especializacao = especializacao;
		this.numeroOAB = numeroOAB;
		this.tipoCliente = tipoCliente;
	}

	public void defender() {
		if(numeroOAB == "") {
			System.out.println("Esse profissional não possui autorização para ser advogado.");
		} else {
			System.out.println("O advogado está defendendo seu cliente.");
		}
	}

	public void representar() {
		if(numeroOAB == "") {
			System.out.println("Esse profissional não possui autorização para ser advogado.");
		} else {
			System.out.println("O advogado está representando seu cliente.");
		}
	}
}