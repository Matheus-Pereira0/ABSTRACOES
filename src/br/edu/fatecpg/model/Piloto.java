package br.edu.fatecpg.model;

public class Piloto {
	public String tipoDeLicenca;
	public String aeronaveHabilitada;
	public String[] horasDeVoo;
	public String categoria;
	
	public Piloto(String tipoDeLicenca, String aeronaveHabilitada, String[] horasDeVoo, String categoria) {
		this.tipoDeLicenca = tipoDeLicenca;
		this.aeronaveHabilitada = aeronaveHabilitada;
		this.horasDeVoo = horasDeVoo;
		this.categoria = categoria;
	}
	
	public void Pilotar() {
		System.out.println("O piloto está pilotando a aeronave " + this.aeronaveHabilitada);
	}
	
	public void Pousar() {
		System.out.println("O piloto está pousando... 🛬");
	}
}