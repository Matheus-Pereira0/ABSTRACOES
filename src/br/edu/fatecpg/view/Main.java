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
		
		System.out.println("\n---------------- MOTORISTA ----------------");
		
		Motorista Motorista1 = new Motorista(
				"D",
				"Ambulância de Suporte Avançado",
				"Base Central -> Hospital de Clínicas via Avenida Paulista",
				"5 anos atuando como condutor de veículos de emergência no SAMU"
				);

		Motorista Motorista2 = new Motorista(
				"E",
				"Caminhão Carreta Bitrem Randon",
				"Terminal Portuário de Santos -> Distrito Industrial de Campinas via Rodovia dos Bandeirantes",
				"12 anos de experiência em transporte rodoviário de cargas pesadas"
				);
						
		System.out.println("\nEsse motorista tem a experiência: " + Motorista1.experiencia);
		Motorista1.Transportar();
						
		System.out.println("\nEsse motorista tem a experiência: " + Motorista2.experiencia);
		Motorista2.Transportar();
		
		System.out.println("\n---------------- PILOTO ----------------");
		
		Piloto Piloto1 = new Piloto(
				"PLA",
				"Boeing 737-800 / Airbus A320",
				new String[]{"Total: 4500h", "Voo Noturno: 1200h", "Instrumentos: 1800h"},
				"Comandante Internacional"
				);

		Piloto Piloto2 = new Piloto(
				"PPA / PAG",
				"Embraer EMB-202 Ipanema",
				new String[] {"Total: 850h", "Operações Agrícolas: 600h", "Voo Visual: 850h"},
				"Piloto Operacional Sênior"
				);
						
		System.out.println("\nEsse piloto está na categoria de " + Piloto1.categoria);
		Piloto1.Pousar();
						
		System.out.println("\nEsse piloto está na categoria de " + Piloto2.categoria);
		Piloto2.Pilotar();

				System.out.println("\n---------------- ADVOGADO ----------------");
		
		Advogado Advogado1 = new Advogado(
				"Direito Criminal",
				"Direito Penal",
				"OAB123456",
				"Pessoa Física"
		);

		Advogado Advogado2 = new Advogado(
				"Direito Trabalhista",
				"Direito do Trabalho",
				"OAB654321",
				"Empresa"
		);
		
		System.out.println("\nEsse Advogado atua na área de " + Advogado1.areaJuridica);
		Advogado1.defender();

		System.out.println("\nEsse Advogado atua na área de " + Advogado2.areaJuridica);
		Advogado2.representar();


		System.out.println("\n---------------- JUIZ ----------------");
		
		Juiz Juiz1 = new Juiz(
				"1ª Vara Criminal",
				"Direito Criminal",
				"Santos",
				"Primeira Instância"
		);

		Juiz Juiz2 = new Juiz(
				"2ª Vara Civil",
				"Direito Civil",
				"Praia Grande",
				"Primeira Instância"
		);
		
		System.out.println("\nEsse Juiz trabalha na " + Juiz1.vara);
		Juiz1.julgar();

		System.out.println("\nEsse Juiz trabalha na " + Juiz2.vara);
		Juiz2.sentenciar();


		System.out.println("\n---------------- ARQUITETO ----------------");
		
		Arquiteto Arquiteto1 = new Arquiteto(
				"Arquiteto e Urbanista",
				"CAU123456",
				"Arquitetura de Interiores",
				"Residencial"
		);

		Arquiteto Arquiteto2 = new Arquiteto(
				"Arquiteto e Urbanista",
				"CAU654321",
				"Urbanismo",
				"Comercial"
		);
		
		System.out.println("\nEsse Arquiteto tem especialização em " + Arquiteto1.especializacao);
		Arquiteto1.projetar();

		System.out.println("\nEsse Arquiteto tem especialização em " + Arquiteto2.especializacao);
		Arquiteto2.planejar();


		System.out.println("\n---------------- CIENTISTA ----------------");
		
		Cientista Cientista1 = new Cientista(
				"Biologia",
				"Biomedicina",
				"Genética",
				"Laboratório de Biologia"
		);

		Cientista Cientista2 = new Cientista(
				"Química",
				"Química",
				"Reações Químicas",
				"Laboratório de Química"
		);
		
		System.out.println("\nEsse Cientista atua na área de " + Cientista1.areaPesquisa);
		Cientista1.pesquisar();

		System.out.println("\nEsse Cientista atua na área de " + Cientista2.areaPesquisa);
		Cientista2.experimentar();


		System.out.println("\n---------------- PINTOR ----------------");
		
		Pintor Pintor1 = new Pintor(
				"Pintura a Óleo",
				"Tinta e Tela",
				"Realismo",
				"Retratos"
		);

		Pintor Pintor2 = new Pintor(
				"Aquarela",
				"Tinta e Papel",
				"Abstrato",
				"Paisagens"
		);
		
		System.out.println("\nEsse Pintor utiliza a técnica " + Pintor1.tecnicaUtilizada);
		Pintor1.pintar();

		System.out.println("\nEsse Pintor utiliza a técnica " + Pintor2.tecnicaUtilizada);
		Pintor2.restaurar();
		
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
	}

}
