package bancodigital;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected boolean ativa;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.ativa = true;
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
		}
		else {
			System.out.format("Valor a sacar maior que o saldo. Saldo: %.2f%n", this.saldo);
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (this.saldo >= valor ) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		else {
			System.out.format("Valor a transferir maior que o saldo. Saldo: %.2f%n", this.saldo);
		}
	}

	@Override 
	public boolean isContaAtiva() {
		return this.ativa;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public Cliente getCliente(){
		return this.cliente;
	}

	void cancelarConta() {
		this.ativa = false;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
