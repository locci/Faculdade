package Exercicio00;

import java.util.Scanner;

public class Machairodontinae extends Felideos {

	private String especie;
	private static Scanner teclado = new Scanner(System.in);

	public Machairodontinae() {
		setEspecie();
	}

	public String getEspecie() {
		return especie;
	}
	public String setEspecie() {
		System.out.println(
				"Qual a espécie de Machairodontinae você deseja criar?\n01 - Dente­de­Sabre");
		int opcao = teclado.nextInt();

		switch (opcao) {
		case 1:
			return this.especie = "Dente­de­Sabre";
		default:
			this.especie = "Espécie não identificada";
		}
		return especie;
	}
	
	public String toString() {
		return "Classe: " + this.getClasse() + " / Ordem: " + this.getOrdem() + " / Espécie: " + this.getEspecie() +". \n";
	}
}
