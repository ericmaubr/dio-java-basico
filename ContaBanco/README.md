# DIO - Trilha Java Básico

www.dio.me

#### Autores

- [Eric Mauricio](https://github.com/ericmaubr)

## Desafio

Essa é a resolução do desafio proposto em https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/sintaxe

O objetivo é criar um programa que recebe 4 parâmetros de entrada e apresenta uma saída num formato pré-definido.

Entrada:
| Atributo | Tipo | Exemplo |
| ------------ | ------- | ------------- |
| Numero | Inteiro | 1021 |
| Agencia | Texto | 067-8 |
| Nome Cliente | Texto | MARIO ANDRADE |
| Saldo | Decimal | 237.48 |

Saída:
_"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"._

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

Eu fiz uma pequena evolução de maneira a aceitar a linha inteira como Nome Cliente, ao invés de separar nome e sobrenome.
Para isso, fiz uso do nextLine().

Também usei o Locale e useLocale para garantir que a entrada do saldo esteja no formato americano, ie, utilizando "." para decimal.
