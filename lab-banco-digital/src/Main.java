import bancodigital.Banco;
import bancodigital.Cliente;
import bancodigital.Conta;
import bancodigital.ContaCorrente;
import bancodigital.ContaPoupanca;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco();
		banco.setNome("Banco Milionario");
		System.out.println("Quantidade de contas: " + banco.quantidadeContas());

		// cadastro de clientes
		Cliente cliente01 = new Cliente("Joao Silva", "123456-22");
		Cliente cliente02 = new Cliente("Jose Carlos Silveira", "345678-10");

		// criando contas para o cliente01
		Conta ccCliente01 = banco.criaContaCorrente(cliente01);
		Conta poupCliente01 = banco.criaContaPoupanca(cliente01);
		ccCliente01.depositar(100);

		// criando conta para o cliente02
		Conta ccCliente02 = banco.criaContaCorrente(cliente02);
		ccCliente02.depositar(2393.23);

		// transferindo $$ para a poupança do cliente01
		ccCliente01.transferir(10, poupCliente01);
		
		// imprimindo extratos 
		ccCliente01.imprimirExtrato();
		System.out.println("***********");
		poupCliente01.imprimirExtrato();
		System.out.println("***********");
		ccCliente02.imprimirExtrato();

		System.out.println("***********");

		System.out.format("Quantidade de contas: %d%n", banco.quantidadeContas());
		
		// Saldo depositado no banco
		double saldoAcumuladoContaCorrente = 0;
		double saldoAcumuladoContaPoupanca = 0;
		for (Conta conta: banco.getContas()) {
			if (conta != null){
				if (conta instanceof ContaCorrente) {
					saldoAcumuladoContaCorrente += conta.getSaldo();
				}
				else {
					saldoAcumuladoContaPoupanca += conta.getSaldo();
				}
			}
		} 
		System.out.format("Saldo Conta Corrente: %.2f%n", saldoAcumuladoContaCorrente);
		System.out.format("Saldo Conta Poupança: %.2f%n", saldoAcumuladoContaPoupanca);
		System.out.format("Saldo total: %.2f%n", (saldoAcumuladoContaCorrente + saldoAcumuladoContaPoupanca));		

		// listando os clientes
		Set<Cliente> clientes = banco.listarClientes();

		System.out.println("***********");
		System.out.format("Quantidade de Clientes: %d%n", clientes.size());
		for(Cliente cliente: clientes){
			System.out.format("Cliente: %s, CPF: %s%n", cliente.getNome(), cliente.getCPF());
		}
		
		// cancelando a conta poupança
		System.out.println("***********");
		poupCliente01.sacar(poupCliente01.getSaldo());
		banco.cancelarConta(2);
		System.out.format("Conta %d está ativa? %b%n", poupCliente01.getNumero(), poupCliente01.isContaAtiva());

	}

}
