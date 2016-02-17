package Exercicio00;

import java.util.Scanner;

public class Pantherinae extends Felideos {

	private String especie;
	private static Scanner teclado = new Scanner(System.in);

	public Pantherinae() {
		setEspecie();
	}

	public String getEspecie() {
		return especie;
	}

	public String setEspecie() {
		System.out.println(
				"Qual a espécie de Pantherinae você deseja criar?\n01 - Tigres\n02 - Leão\n03 - Onça-Pintada\n04 - Leopardo");
		int opcao = teclado.nextInt();

		switch (opcao) {
		case 1:
			return this.especie = "Tigre";
		case 2:
			return this.especie = "Leão";
		case 3:
			return this.especie = "Onça-Pintada";
		case 4:
			return this.especie = "Leopardo";
		default:
			this.especie = "Espécie não identificada";
		}
		return especie;
	}
	
	public String toString() {
		return "Classe: " + this.getClasse() + " / Ordem: " + this.getOrdem() + " / Espécie: " + this.getEspecie() +". \n";
	}

}
