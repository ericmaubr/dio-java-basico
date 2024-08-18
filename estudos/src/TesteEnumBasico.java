
enum DiaDaSemana {
  SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

public class TesteEnumBasico {
  public static void main(String[] args) {
    // Não é possível usar `new` para criar um valor de enum
    // DiaDaSemana hoje = new DiaDaSemana(); // Isso não compila

    // Usando diretamente o valor do enum
    DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

    System.out.println("Hoje é: " + hoje);
}
}
