package br.edu.fatecpg.model;

public class Programador {

    public String linguagem;
    public String area;
    public String framework;
    public String experiencia;

    public Programador(String linguagem, String area, String framework, String experiencia) {

        this.linguagem = linguagem;
        this.area = area;
        this.framework = framework;
        this.experiencia = experiencia;

    }

    public void programar() {

        if (experiencia == "") {
            System.out.println("Esse programador não possui experiência.");
        } else {
            System.out.println("O programador está programando.");
        }

    }

    public void corrigirBugs() {

        if (experiencia == "") {
            System.out.println("Esse programador não possui experiência.");
        } else {
            System.out.println("O programador está corrigindo bugs.");
        }

    }

}
