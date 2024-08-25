package bancodigital;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


public class Banco {

	private String nome;
	private ArrayList<Conta> contas = new ArrayList<>();

	public Banco() {
		// inicializa a lista de contas com uma conta na posição zero
		// assim fica fácil indexar as contas pelo número delas
		contas.add(null);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}

	public ContaCorrente criaContaCorrente(Cliente cliente) {
		ContaCorrente cc = new ContaCorrente(cliente);
		contas.add(cc);
		return cc;
	}

	public ContaPoupanca criaContaPoupanca(Cliente cliente){
		ContaPoupanca cc = new ContaPoupanca(cliente);
		contas.add(cc);
		return cc;
	}

	public boolean contaExiste(int numeroCC) {
		return (numeroCC <= this.quantidadeContas());
	}

	public boolean cancelarConta(int numeroCC) {
		Conta cc;
		boolean retorno = false;

		if (this.contaExiste(numeroCC)) {
			cc = contas.get(numeroCC);

			if (cc.getSaldo() == 0) {
				cc.cancelarConta();
				retorno = true;
			}
			else {
				System.out.println("Para cancelar uma conta, ela precisa ter saldo zero.");
				System.out.format("A conta %d possui saldo %.2f%n", numeroCC ,cc.getSaldo());
			}
		}
		else {
			System.out.format("Conta %d não encontrada.%n", numeroCC);
		}

		return retorno;
		
	}

	public int quantidadeContas() {
		return this.contas.size()-1;
	}

	public Set<Cliente> listarClientes() {
		Set<Cliente> clientes = new HashSet<>();

		for(Conta conta: this.contas) {
			if (conta != null) {
				clientes.add(conta.getCliente());
			}
		}

		return clientes;
	}

}
