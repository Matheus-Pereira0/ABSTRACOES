package br.edu.fatecpg.model; 
 
public class Fotografo { 
 
    public String tipoFotografia; 
    public String equipamento; 
    public String estilo; 
    public String tecnicaEdicao; 
 
    public Fotografo(String tipoFotografia, String equipamento, String estilo, String tecnicaEdicao) { 
 
        this.tipoFotografia = tipoFotografia; 
        this.equipamento = equipamento; 
        this.estilo = estilo; 
        this.tecnicaEdicao = tecnicaEdicao; 
 
    } 
 
    public void fotografar() { 
 
        if (equipamento == "") { 
            System.out.println("Esse profissional não possui equipamento para fotografar."); 
        } else { 
            System.out.println("O fotógrafo está realizando uma fotografia."); 
        } 
 
    } 
 
    public void editar() { 
 
        if (tecnicaEdicao == "") { 
            System.out.println("Esse profissional não possui técnica de edição."); 
        } else { 
            System.out.println("O fotógrafo está editando uma fotografia."); 
        } 
 
    } 
 
}