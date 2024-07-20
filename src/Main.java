
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		Cliente andre = new Cliente();

		venilton.setNome("Venilton");
		andre.setNome("André");
		
		ContaPoupanca poupancaVenilton = new ContaPoupanca(venilton, "emailTesteVenilton@gmail.com");
		ContaPoupanca poupancaAndre = new ContaPoupanca(andre, "emailTesteAndre@gmail.com");

		poupancaVenilton.depositar(200);

		poupancaVenilton.imprimirExtrato();
		poupancaAndre.imprimirExtrato();

		poupancaVenilton.transferenciaPix("emailTesteAndre@gmail.com", 100);

		poupancaVenilton.imprimirExtrato();
		poupancaAndre.imprimirExtrato();
		
		
	}

}
