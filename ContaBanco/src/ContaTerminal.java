
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);

    //System.out.println("Delimiter:" + sc.delimiter() + "**");

    String agencia, nomeCliente;
    int cc;
    double saldo;

    System.out.println("Digite o número da Agência");
    agencia = sc.next();

    System.out.println("Digite a conta corrente");
    cc = sc.nextInt();

    System.out.println("Digite o nome do correntista");
    sc.nextLine(); // consome o \n do inteiro anterior
    nomeCliente = sc.nextLine();
    //nomeCliente = "";

    System.out.println("Digite o saldo inicial");
    saldo = sc.nextDouble();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, cc, saldo);
    System.out.println();

    sc.close();
  }

}
