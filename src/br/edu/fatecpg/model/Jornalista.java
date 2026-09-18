package br.edu.fatecpg.model;

public class Jornalista {

    public String areaDeCobertura;
    public String veiculoComunicacao;
    public String especializacao;
    public String tipoMidia;

    public Jornalista(String areaDeCobertura, String veiculoComunicacao, String especializacao, String tipoMidia) {

        this.areaDeCobertura = areaDeCobertura;
        this.veiculoComunicacao = veiculoComunicacao;
        this.especializacao = especializacao;
        this.tipoMidia = tipoMidia;

    }

    public void entrevistar() {

        if (especializacao == "") {
            System.out.println("Esse jornalista não possui especialização.");
        } else {
            System.out.println("O jornalista está realizando uma entrevista.");
        }

    }

    public void noticiar() {

        if (especializacao == "") {
            System.out.println("Esse jornalista não possui especialização.");
        } else {
            System.out.println("O jornalista está noticiando.");
        }

    }

}
