package bancodigital;

import java.io.ObjectStreamClass;

public class Cliente {

	private String nome;
	private String cpf;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true; // Verifica se as referências são iguais
		}	
		if (obj == null || getClass() != obj.getClass()){
			return false; // Verifica se o objeto é do mesmo tipo
		}
		Cliente cliente = (Cliente) obj;
		return this.cpf.equals(cliente.getCPF());
	}

	@Override
	public int hashCode() {
		int result = cpf.hashCode();
		return result;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getCPF() {
		return this.cpf;
	}

}
