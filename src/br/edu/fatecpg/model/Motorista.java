package br.edu.fatecpg.model;

public class Motorista {
	public String cnh;
	public String veiculo;
	public String rota;
	public String experiencia;
	
	public Motorista(String cnh, String veiculo, String rota, String experiencia) {
		this.cnh = cnh;
		this.veiculo = veiculo;
		this.rota = rota;
		this.experiencia = experiencia;
	}
	
	public void Dirigir() {
		System.out.println("O motorista está dirigindo, Vrum! Vrum!");
	}
	
	public void Transportar() {
		System.out.println("O motorista está transportando pela rota: " + this.rota);
	}
}