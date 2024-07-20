import java.util.ArrayList;

public class Banco {

	private String nome;
	private static ArrayList<Conta> contas = new ArrayList<Conta>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

}
