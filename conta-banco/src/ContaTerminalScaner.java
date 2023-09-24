import java.util.Locale;
import java.util.Scanner;

public class ContaTerminalScaner {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da sua conta !");
    int numeroConta = scanner.nextInt();
    System.out.println("Qual seu nome?");
    String nomeCliente = scanner.next();
    System.out.println("Por favor, digite o número da Agência !");
    String agencia = scanner.next();
    System.out.println("Por favor, digite o seu saldo atual");
    double saldo = scanner.nextDouble();
    scanner.close();
    System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

