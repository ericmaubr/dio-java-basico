# Evolução do Banco Digital

A versão inicial é baseada no código disponibilizado em (https://github.com/falvojr/lab-banco-digital-oo)

Para organizar o código e mudar a visibilidade de alguns métodos, foi criado o pacote bancodigital.

A classe de testes Main está fora deste pacote.

Apesar de ser possível criar diretamente uma conta através das classes ContaCorrente e ContaPoupanca, fiz com que as contas sejam criadas através dos métodos criaContaCorrente e criaContaPoupanca da classe Banco.

Do ponto de vista de encapsulamento, faz mais sentido o banco criar as contas e mantê-las de maneira organizada.

Quando uma conta é criada, ela é adicionado a uma lista de contas, facilitando percorrer todas as listas criadas no banco.

Outros métodos de Banco:

- cancelarConta: utilizado para cancelar uma conta. Uma conta só pode ser cancelada se tiver saldo zero, caso contrário, o banco não deixa cancelar a conta.
- quantidadeContas: retorna quantas contas foram cadastradas no banco
- listarClientes: retorna a lista de clientes. Se um cliente tiver mais de uma conta, aparecerá apenas uma vez. Utilize um Set para implementar esse método.

Classe Conta

- cancelarConta: esse método está visível apenas dentro do pacote. As regras de negócio para cancelar a conta está definido no método cancelarConta em Banco.

Classe Cliente

Implementei o método equals e hashCode para garantir que objetos de Cliente com o mesmo CPF sejam considerados iguais, evitando listar de maneira repetida no método listarCliente em Banco.
