package br.edu.fatecpg.view;
import br.edu.fatecpg.model.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("---------------- FOTOGRAFO ----------------");
        
		Fotografo Fotografo1 = new Fotografo(
        "Retrato",
        "Canon EOS R5",
        "Minimalista",
        "Lightroom"
        );

        Fotografo Fotografo2 = new Fotografo(
        "Fotografia de rua",
        "Sony Alpha 7 III",
        "Documental",
        "Photoshop"
        );
		
		System.out.println("\nEsse Fotografo trabalha com " + Fotografo1.tipoFotografia + " utilizando " + Fotografo1.equipamento);
        Fotografo1.fotografar();


        System.out.println("\nEsse Fotografo trabalha com " + Fotografo2.tipoFotografia + " utilizando " + Fotografo2.equipamento);
        Fotografo2.fotografar();

		
// COLOCAR AS CARASCTICAS

		System.out.println("\n---------------- JORNALISTA ----------------");
		
		Jornalista Jornalista1 = new Jornalista(
        "Política nacional",
        "Jornal",
        "Política",
        "Impresso"
        );

        Jornalista Jornalista2 = new Jornalista(
        "Esportes",
        "Televisão",
        "Futebol",
        "Audiovisual"
        );
		
		System.out.println("\nEsse Jornalista atua na área de " + Jornalista1.areaDeCobertura + " pelo " + Jornalista1.veiculoComunicacao);
        Jornalista1.entrevistar();


        System.out.println("\nEsse Jornalista atua na área de " + Jornalista2.areaDeCobertura + " pela " + Jornalista2.veiculoComunicacao);
        Jornalista2.entrevistar();

		


        System.out.println("\n---------------- ATLETA ----------------");
		
        Atleta Atleta1 = new Atleta(
        "Futebol",
        "Atacante",
        "Profissional",
        "Excelente"
        );

        Atleta Atleta2 = new Atleta(
        "Basquete",
        "Armador",
        "Amador",
        "Bom"
        );
		
		System.out.println("\nEsse Atleta pratica " + Atleta1.modalidade + " e joga como " + Atleta1.posicao);
        Atleta1.treinar();


        System.out.println("\nEsse Atleta pratica " + Atleta2.modalidade + " e joga como " + Atleta2.posicao);
        Atleta2.treinar();

		


		System.out.println("\n---------------- POLITICO ----------------");
		
		Politico Politico1 = new Politico(
        "Vereador",
        "Partido Verde",
        "Municipal",
        "2024-2028"
        );

        Politico Politico2 = new Politico(
        "Deputado Federal",
        "Partido Social Democrático",
        "Federal",
        "2023-2027"
        );
				
		System.out.println("\nEsse Politico ocupa o cargo de " + Politico1.cargo + " e atua na esfera " + Politico1.esferaAtuacao);
        Politico1.proporLeis();


        System.out.println("\nEsse Politico ocupa o cargo de " + Politico2.cargo + " e atua na esfera " + Politico2.esferaAtuacao);
        Politico2.proporLeis();



		System.out.println("\n---------------- PROGRAMADOR ----------------");
				
		Programador Programador1 = new Programador(
        "Java",
        "Desenvolvimento Web",
        "Spring",
        "3 anos"
        );

        Programador Programador2 = new Programador(
        "C#",
        "Desenvolvimento de Sistemas",
        ".NET",
        "1 ano"
        );
						
		System.out.println("\nEsse Programador trabalha com " + Programador1.linguagem + " na área de " + Programador1.area);
        Programador1.programar();


        System.out.println("\nEsse Programador trabalha com " + Programador2.linguagem + " na área de " + Programador2.area);
        Programador2.programar();

	}

}