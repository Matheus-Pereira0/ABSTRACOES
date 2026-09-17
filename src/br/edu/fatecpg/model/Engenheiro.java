package br.edu.fatecpg.model;

public class Engenheiro {

    public String area;
    public String formacao;
    public String funcao;
    public String CREA;

    public Engenheiro(String area, String formacao, String funcao, String CREA) {

        this.area = area;
        this.formacao = formacao;
        this.funcao = funcao;
        this.CREA = CREA;

    }

    public void planejar() {

        if (CREA == "") {
            System.out.println("Esse profissional não possui autorização para ser engenheiro.");
        } else {
            System.out.println("O engenheiro está planejando um projeto.");
        }

    }

    public void calcular() {

        if (CREA == "") {
            System.out.println("Esse profissional não possui autorização para ser engenheiro.");
        } else {
            System.out.println("O engenheiro está realizando cálculos para o projeto.");
        }

    }

}