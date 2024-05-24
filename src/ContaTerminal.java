import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
    public static void main(String[] args) throws Exception {
        // to do:
        // conhecer e importar a classe scanner
        // obter pela scanner os valores digitados no terminal
        // exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo disponível em sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está disponível para saque.");
    }
}
