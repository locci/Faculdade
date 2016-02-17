package Exercicio00;

import java.util.Scanner;

public class Felinae extends Felideos {

	private String especie;
	private static Scanner teclado = new Scanner(System.in);

	public Felinae() {
		setEspecie();
	}

	public String getEspecie() {
		return especie;
	}
	public String setEspecie() {
		System.out.println(
				"Qual a espécie de Felinae você deseja criar?\n01 - Guepardo\n02 - Suçuarana\n03 - Lince\n04 - Gato Doméstico");
		int opcao = teclado.nextInt();

		switch (opcao) {
		case 1:
			return this.especie = "Guepardo";
		case 2:
			return this.especie = "Suçuarana";
		case 3:
			return this.especie = "Lince";
		case 4:
			this.setConviverComHumano(true);
			return this.especie = "Gato Doméstico";
		default:
			this.especie = "Espécie não identificada";
		}
		return especie;
	}
	
	public String toString() {
		return "Classe: " + this.getClasse() + " / Ordem: " + this.getOrdem() + " / Espécie: " + this.getEspecie() +". \n";
	}
}
