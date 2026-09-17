package br.edu.fatecpg.view;
import br.edu.fatecpg.model.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("---------------- PROFESSOR ----------------");
		Professor Professor1 = new Professor(67, true, true, "Roblox");
		Professor Professor2 = new Professor(20, false, false, "Portugues");
		
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
	}

}
