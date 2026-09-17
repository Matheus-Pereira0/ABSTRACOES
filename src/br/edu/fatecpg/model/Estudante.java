package br.edu.fatecpg.model;

public class Estudante {
	public double presenca;
	public String curso;
	public double[] notas;
	public int RM;
	public String[] boletim;
	
	public Estudante(Double presenca, String curso, double[] notas, int RM, String boletim[]) {
		this.presenca = presenca;
		this.curso = curso;
		this.notas = notas;
		this.RM = RM;
		this.boletim = boletim;
	}
	
	public void estudar() {
		if(RM == 0) {
		System.out.println("Esse estudante não é aluno.");
		} else {
			System.out.println("Esse estudante está no curso de " + curso + " e possui " + presenca + "% de presença");
		}
	}
	
	public void fazProva() {
		if(RM == 0) {
			System.out.println("Esse estudante não é aluno.");
		} else {
			System.out.println("Esse estudante está fazendo uma prova do curso de " + curso + ".");
		}
	}
}