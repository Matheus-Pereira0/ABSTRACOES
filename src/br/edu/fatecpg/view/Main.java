package br.edu.fatecpg.view;
import br.edu.fatecpg.model.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("---------------- PROFESSOR ----------------");
		Professor Professor1 = new Professor(
				67, 
				true, 
				true, 
				"Roblox"
				);
		Professor Professor2 = new Professor(
				20, 
				false, 
				false, 
				"Portugues"
				);
		
		System.out.println("Esse professor tem " + Professor1.idade + " Anos.");
		Professor1.darAula();
		
		System.out.println("\nEsse professor tem " + Professor2.idade + " Anos.");
		Professor2.darAula();
		
		System.out.println("\n---------------- ESTUDANTE ----------------");
		
		Estudante Estudante1 = new Estudante(
			    92.00,
			    "IFEM",
			    new double[]{5.5, 3.5, 9.0, 10.0},
			    123456789,
			    new String[]{"Matemática", "Português", "Programação", "Banco de Dados"}
			);
		Estudante Estudante2 = new Estudante(
			    80.00,
			    "Administração",
			    new double[]{7.0, 8.5, 6.0, 9.0},
			    987654321,
			    new String[]{"Matemática", "Português", "Marketing", "Excel"}
			);
		
		System.out.println("Este estudante está fazendo " + Estudante1.boletim);
		Estudante1.estudar();
		
		System.out.println("Este estudante está fazendo " + Estudante2.boletim);
		Estudante2.estudar();
		
		System.out.println("\n---------------- MÉDICO ----------------");
				
		Medico Medico1 = new Medico(
			    "Cardiologia",
			    "Medicina",
			    "10 anos",
			    "CRM123456"
			);
		
		Medico Medico2 = new Medico(
			    "Dermatologia",
			    "Medicina",
			    "5 anos",
			    ""
			);
				
		System.out.println("\nEsse médico tem especialidade em " + Medico1.especialidade);
		Medico1.administrarMedicamento();
		
		System.out.println("\nEsse médico tem especialidade em " + Medico2.especialidade);
		Medico2.administrarMedicamento();
		
		System.out.println("\n---------------- ENGENHEIRO ----------------");
		
		Engenheiro Engenheiro1 = new Engenheiro(
			    "Engenharia Civil",
			    "Engenharia",
			    "Projetista",
			    "CREA123456"
			);

		Engenheiro Engenheiro2 = new Engenheiro(
			    "Engenharia Mecânica",
			    "Engenharia",
			    "Manutenção",
			    "CREA987654"
			);
				
		System.out.println("\nEsse Engenheiro tem função de " + Engenheiro1.funcao);
		Engenheiro1.planejar();
			
		System.out.println("\nEsse Engenheiro tem função de " + Engenheiro2.funcao);
		Engenheiro2.planejar();
				
		System.out.println("\n---------------- ATOR ----------------");
				
		Ator Ator1 = new Ator(
			    "DRT123456",
			    "Artes Cênicas",
			    "Teatro",
			    "João"
			);

		Ator Ator2 = new Ator(
			    "DRT654321",
			    "Artes Cênicas",
			    "Cinema",
			    "Pedro"
			);
						
		System.out.println("\nEsse Ator tem especialidade em " + Ator1.Especialidade);
		Ator1.atuar();
						
		System.out.println("\nEsse Ator tem especialidade em " + Ator2.Especialidade);
		Ator2.atuar();
		
		System.out.println("\n---------------- CANTOR ----------------");
		
		Cantor Cantor1 = new Cantor(
				"Tenor",
				"Metal",
				new String[] {"Eagle Fly Free", "Crazy Train"},
				"Estética Bgseada em um contraste e alta densidade."
				);

		Cantor Cantor2 = new Cantor(
				"Meio-Soprano",
				"City Japanese Pop",
				new String[] {"Mayonaka no Door / Stay With Me", "Plastic Love", "Neat Na Gojo San-Ji"},
				"Estética retrô de Tóquio à noite."
				);
						
		System.out.println("\nEsse Cantor tem a voz: " + Cantor1.voz);
		Cantor1.Cantar();
						
		System.out.println("\nEsse Cantor tem a voz: " + Cantor2.voz);
		Cantor2.Ensaiar();
		
		System.out.println("\n---------------- POLICIAL ----------------");
		
		Policial Policial1 = new Policial(
				"Sargento",
				"BOPE",
				"Atirador de Elite",
				"Operações Urbanas em Áreas de Alto Risco"
				);

		Policial Policial2 = new Policial(
				"Inspetor",
				"DEIC",
				"Investigador de Crimes Cibernéticos",
				"Análise de Dados Forenses e Criptoativos"
				);
						
		System.out.println("\nEsse Polical tem a patente: " + Policial1.patente);
		Policial1.Patrulhar();
						
		System.out.println("\nEsse Polical tem a patente: " + Policial2.patente);
		Policial2.Investigar();
		
		System.out.println("\n---------------- BOMBEIRO ----------------");
		
		Bombeiro Bombeiro1 = new Bombeiro(
				"Cabo",
				"Salvamento Aquático e Atendimento Pré-Hospitalar",
				"GMAR",
				"Sobrevivência em Mar Aberto e Pilotagem de Embarcações de Resgate"
				);

		Bombeiro Bombeiro2 = new Bombeiro(
				"Tenente",
				"Combate a Incêndios Florestais e Operações Heliotransportadas",
				"Prevfogo",
				"Táticas de Contra-fogo, Sobrevivência em Selva e Rapel de Aeronaves"
				);
						
		System.out.println("\nEsse bombeiro está na unidade: " + Bombeiro1.unidade);
		Bombeiro1.CombaterIncendio();
						
		System.out.println("\nEsse bombeiro está na unidade: " + Bombeiro2.unidade);
		Bombeiro2.CombaterIncendio();
	}

}
