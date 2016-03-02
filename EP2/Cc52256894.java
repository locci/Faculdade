package EP2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Cc52256894 {

	String arquivo = "C:\\Users\\renat\\workspace\\AulasAlexandre\\src\\EP2\\matematica.txt";

	String[] arranjo;
	String[] grupo1;
	String[] grupo2;
	String[] tamanhoMaximo;
	String quebrador1 = "";
	String quebrador2 = "";
	BufferedReader leitura;

	public static void main(String[] args) throws IOException {

		Cc52256894 ca = new Cc52256894();
		ca.uniao();
	}

	public void uniao() throws IOException {

		leitura = new BufferedReader(new FileReader(arquivo));
		arranjo = leitura.readLine().split("u");
		StringTokenizer strToken1 = new StringTokenizer(arranjo[0]);

		while (strToken1.hasMoreTokens()) {
			quebrador1 = quebrador1 + strToken1.nextToken(" { , }u ");
			grupo1 = quebrador1.split("");
		}
		StringTokenizer strToken2 = new StringTokenizer(arranjo[1]);

		while (strToken2.hasMoreTokens()) {
			quebrador2 = quebrador2 + strToken2.nextToken(" { , }u ");
			grupo2 = quebrador2.split("");
		}
		
	}
}
