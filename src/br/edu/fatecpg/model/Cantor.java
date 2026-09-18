package br.edu.fatecpg.model;
import java.util.Arrays;

public class Cantor {
	public String voz;
	public String generoMusical;
	public String[] repertorio;
	public String identidadeVisual;
	
	public Cantor(String voz, String generoMusical, String[] repertorio, String identidadeVisual) {
		this.voz = voz;
		this.generoMusical = generoMusical;
		this.repertorio = repertorio;
		this.identidadeVisual = identidadeVisual;
	}
	
	public void Cantar() {
		System.out.println("O cantor está cantando: '♫ Lá Lá Lá! ♫' ");
	}
	
	public void Ensaiar() {
		if(this.repertorio.length != 0) {
		System.out.println("O cantor está ensaiando: " + Arrays.toString(this.repertorio));
		} else {
			System.out.println("O cantor está ensaiando!");
		}
	}
}
