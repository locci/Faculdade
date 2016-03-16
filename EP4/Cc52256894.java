package EP4;

/**
 * @author Renato Souto Maior
 */

public class Cc52256894 {

	public static void main(String[] args) {

		Padrao padrao = new Cc52256894().new Padrao();
		Economico economico = new Cc52256894().new Economico();
		Potente potente = new Cc52256894().new Potente();

	}

	class Padrao {

		public int descongelar(String valor) {
			return 1;
		}

		public int cozinhar(String valor) {
			return 1;
		}

		public int timer(String valor) {
			return 1;
		}

		public int fazerPipoca(String valor) {
			return 1;
		}

		public int fazerCha(String valor) {
			return 1;
		}

		public int grelhar(String valor) {
			return 1;
		}
	}

	class Economico extends Padrao implements NovaFuncaoEconomico {

		int tempoMaximoDeCozimento;
		int potenciaMaxima;

		public int cozimentoBaixo(String valor) {
			return 1;
		}

		public int pesarPeixes(String valor) {
			return 1;
		}

		public int pesarCarne(String valor) {
			return 0;
		}

		public int pesarAves(String valor) {
			return 0;
		}
	}

	class Potente extends Padrao implements NovaFuncaoPotente {

		int tempoMaximoDeCozimento;
		int potenciaMaxima;

		public int cozimentoAlto(String valor) {
			return 1;
		}

		public int superDescongelante(String valor) {
			return 0;
		}

		public int superTostado(String valor) {
			return 0;
		}
	}

	interface NovaFuncaoEconomico {

		public abstract int pesarCarne(String valor);

		public abstract int pesarAves(String valor);
	}

	interface NovaFuncaoPotente {

		public abstract int superDescongelante(String valor);

		public abstract int superTostado(String valor);
	}
}
