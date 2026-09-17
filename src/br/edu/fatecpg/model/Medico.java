package br.edu.fatecpg.model;

public class Medico {
	public String especialidade;
	public String formacao;
	public String experiencia;
	public String CRM;
	
	public Medico(String especialidade, String formacao, String experiencia, String CRM) {
		this.especialidade = especialidade;
		this.formacao = formacao;
		this.experiencia = experiencia;
		this.CRM = CRM;
	}
	
	public void administrarMedicamento() {
		if(CRM == "") {
		System.out.println("Esse profissional não possui autorização para ser médico.");
		} else {
			System.out.println("O médico está administrando um medicamento.");
		}
	}
	
	public void examinar() {
		if(CRM == "") {
			System.out.println("Esse profissional não possui autorização para ser médico.");
			} else {
				System.out.println("O médico está examinando um paciente.");
		}
	}
}