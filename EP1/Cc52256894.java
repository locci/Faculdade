package EP1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cc52256894 {

	String coor = "C:\\Users\\renat\\workspace\\AulasAlexandre\\src\\EP1\\coor";
	String logHorm = "C:\\Users\\renat\\workspace\\AulasAlexandre\\src\\EP1\\logHorm";

	String[][] hormonios = new String[100000][100];
	String[] coordenada;
	String[] coluna;
	int linhaAtual = 0;
	private BufferedReader leitura;

	public static void main(String[] args) throws IOException {

		Cc52256894 ca = new Cc52256894();
		ca.dividirCoor();
		ca.dividirLogHorm();
		ca.leituraLogHorm();

	}

	public void dividirCoor() throws IOException {

		leitura = new BufferedReader(new FileReader(coor));
		coordenada = leitura.readLine().split(" ");
	}

	public void dividirLogHorm() throws IOException {

		leitura = new BufferedReader(new FileReader(logHorm));
		String linha;

		while ((linha = leitura.readLine()) != null) {
			coluna = linha.split(" ");
			for (int i = 0; i < coluna.length; i++) {
				this.hormonios[linhaAtual][i] = coluna[i];
			}
			linhaAtual++;
		}
	}

	public void leituraLogHorm() throws IOException {

		String nome = "";

		for (int i = 0; i < coordenada.length; i++) {

			int linha = Integer.parseInt(coordenada[i]);
			int coluna = Integer.parseInt(coordenada[i = i + 1]);

			try {
				if (hormonios[linha][coluna] != null) {
					nome = nome.concat("\n" + hormonios[linha][coluna]);
				} else {
					nome = nome.concat("\n" + "-1");
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				nome = nome.concat("\n" + "-1");
			}
		}
		System.out.println(nome);
	}

}
