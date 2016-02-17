package Exercicio00;

import java.util.Scanner;

public class Felideos {

	private String classe;
	private String ordem;
	private Boolean conviverComHumano = false;

	public Felideos() {
		this.classe = "Mamífero";
		this.ordem = "Carnívoro";
	}

	public String getClasse() {
		return classe;
	}

	public String getOrdem() {
		return ordem;
	}

	public Boolean getConviverComHumano() {
		return conviverComHumano;
	}

	public void setConviverComHumano(Boolean conviverComHumano) {
		this.conviverComHumano = conviverComHumano;
	}

	public void andarSobreOsDedos() {

		System.out.println(this + "É um Mamíferos Digitígrados, ou seja, ele anda sobre os dedos.\n----");

	}

	public void comerCarne() {

		System.out.println(this + "É um Carnívoro, pois ele se alimenta de carne.\n----");

	}

	public void conviverComHumano() {

		if (this.conviverComHumano == true) {
			System.out.println(this + "Convive com os seres humanos por cerca de 10 mil anos.\n----");
		} else {
			System.out.println(this + "Não convive os seres humanos.\n----");
		}
	}
}
