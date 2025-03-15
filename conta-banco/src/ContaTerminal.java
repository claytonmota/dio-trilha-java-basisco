import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
        Scanner  scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agencia com o dígito: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo em conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        System.out.println("\nSua conta foi criada.");         
        
        scanner.close();
    }
}
