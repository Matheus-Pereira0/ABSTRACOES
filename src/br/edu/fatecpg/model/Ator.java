package br.edu.fatecpg.model;

public class Ator {

    public String DRT;
    public String formacao;
    public String Especialidade;
    public String Nome;

    public Ator(String DRT, String formacao, String Especialidade, String Nome) {

        this.DRT = DRT;
        this.formacao = formacao;
        this.Especialidade = Especialidade;
        this.Nome = Nome;

    }

    public void atuar() {

        if (DRT == "") {

            System.out.println("Essa pessoa não possui autorização para ser ator.");

        } else {

            System.out.println("O ator " + Nome + " está atuando.");

        }

    }

    public void ensaiar() {

        if (DRT == "") {

            System.out.println("Essa pessoa não possui autorização para ser ator.");

        } else {

            System.out.println("O ator " + Nome + " está ensaiando.");

        }

    }

}