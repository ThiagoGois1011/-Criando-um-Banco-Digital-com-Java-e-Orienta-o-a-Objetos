import java.util.ArrayList;

public class ContaPoupanca extends Conta {


	public ContaPoupanca(Cliente cliente, String chavePix) {
		super(cliente, chavePix);
		
	}

	public boolean transferenciaPix(String chavePixParaTransferencia, double valor){
		Banco banco = new Banco();

		ArrayList<Conta> lista = banco.getContas();

		boolean transacao = false;

		for (int i = 0; i < lista.size(); i++) {
			Conta item = lista.get(i);

			if(item.getChavePix().equals(chavePixParaTransferencia)){
				this.sacar(valor);
				item.depositar(valor);
				transacao = true;
				System.out.println("Pix feito com sucesso!!");
			}
		}

		if(!transacao){
			System.out.println("Chave pix não existe!!");
		}
		return true;
	}


	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
