package EP3;

public class Cc52256894 {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		c.teste1("falha");
		c.teste2("falha");
	}
}

class Cliente {

	public void teste1(String teste) {

		ClienteComum cc = new ClienteComum();
		try {
			cc.cadastro();
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao cadastrar cliente comum.");
		}

	}

	public void teste2(String teste) {

		ClienteEspecial ce = new ClienteEspecial();
		try {
			ce.cadastro();
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao cadastrar cliente especial.");
		}
	}
}

class ClienteComum extends Cliente {

	public void cadastro() throws IllegalArgumentException {
		String st = "falha";

		if (st.equals("falha")) {
			throw new IllegalArgumentException();
		}
	}
}

class ClienteEspecial extends Cliente {

	public void cadastro() throws IllegalArgumentException {
		String st = "falha";

		if (st.equals("falha")) {
			throw new IllegalArgumentException();
		}
	}
}
