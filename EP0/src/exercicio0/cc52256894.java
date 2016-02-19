package exercicio0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class cc52256894 {

	String linha = " ";
	int quantidadeLinha;

	public void leitura() throws IOException {

		BufferedReader leituraArquivo = new BufferedReader(
				new FileReader("/home/alexandre/Desktop/arquivo"));

		while (true) {
			if (getLinha() == " ") {

			} else {
				if (getLinha() != null) {
					System.out.println(getLinha());
					setQtde(getQtde() + 1);
				} else {
					break;
				}
			}
			setLinha(leituraArquivo.readLine());
		}
		leituraArquivo.close();
		System.out.println("\nA Quantidade de linhas: " + getQtde());
	}

	public int getQtde() {
		return quantidadeLinha;
	}

	public void setQtde(int qtde) {
		this.quantidadeLinha = qtde;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public static void main(String[] args) throws IOException {

		new cc52256894().leitura();
	}
}