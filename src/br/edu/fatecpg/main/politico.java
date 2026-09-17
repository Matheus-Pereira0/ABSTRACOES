package br.edu.fatecpg.model; 
 
public class Politico { 
 
    public String cargo; 
    public String partido; 
    public String esferaAtuacao; 
    public String mandato = false; 
 
    public Politico(String cargo, String partido, String esferaAtuacao, String mandato) { 
 
        this.cargo = cargo; 
        this.partido = partido; 
        this.esferaAtuacao = esferaAtuacao; 
        this.mandato = mandato; 
 
    } 
 
    public void proporLeis() { 
 
        if (mandato == "") { 
            System.out.println("Esse político não possui mandato."); 
        } else { 
            System.out.println("O político está propondo leis."); 
        } 
 
    } 
 
    public void representar() { 
 
        if (mandato == "") { 
            System.out.println("Esse político não possui mandato."); 
        } else { 
            System.out.println("O político está representando a população."); 
        } 
 
    } 
 
}