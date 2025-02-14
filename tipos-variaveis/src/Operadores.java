public class Operadores {
  public static void main(String[] args) {
    String nomeUm = "João";
    String nomeDois = new String("João");

    System.out.println(nomeUm == nomeDois);

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if (numero1 < numero2) { // true
      System.out.println("a nossa condição é verdadeira");

    }

    System.out.println("numeroUm é igual a numeroDois " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente ao numeroDois " + simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior que numeroDois " + simNao);
  }
}
