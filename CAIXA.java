import java.text.DecimalFormat;
import java.util.Scanner;

/**
*
* @author Thiago Moraes
*
*/


class Main {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###");

    String senha = "12345", senhau, cpf = "111.222.333-44", cpfu;

    int escolhamenu = 0, x = 0;

    double saldo = 1000, valordep, valorsaque;

    do {
          System.out.println("=========================");
      System.out.println(" BEM VINDO ");
      System.out.println("=========================");
      System.out.print("Digite seu CPF: ");
      cpfu = ler.next();
      if (!cpfu.equals(cpf)) {
        System.out.println("Acesso negado");
        return;
      }
      System.out.print("Digite sua senha: ");
      senhau = ler.next();
      if (!senhau.equals(senha)) {
        for (int i = 0; i < 3; i++) {
          if (senhau.equals(senha)) {
            break;
          } else if (i == 2) {
            System.out.println("Conta bloqueada");
            break;
          } else {
            System.out.println("Digite novamente sua senha: ");
            senhau = ler.next();
          }
        }
      }
      do {
        System.out.println("=========================");
        System.out.println(" 1-SALDO ");
        System.out.println(" 2-DEPÓSITO ");
        System.out.println(" 3-SAQUE ");
        System.out.println(" 0-SAIR ");
        System.out.println("=========================");
        System.out.println("Digite a opção desejada: ");
        escolhamenu = ler.nextInt();
        switch (escolhamenu) {
        case (1):
          System.out.println("Seu saldo é de R$ " + df.format(saldo));
          break;
        case (2):
          System.out.println("Digite o valor a ser depositado: ");
          valordep = ler.nextDouble();
          saldo += valordep;
          break;
        case (3):
          System.out.println("Digite o valor a ser sacado: ");
          valorsaque = ler.nextDouble();
          saldo -= valorsaque;
          break;
        case (0):
          System.out.println("Obrigado por utilizar o nosso sistema!");
          break;
        default:
          System.out.println("Digite uma opção entre 0 e 3!");
          break;
        }
      } while (escolhamenu != 0);
      x++;
    } while (x != 0);
  }
}