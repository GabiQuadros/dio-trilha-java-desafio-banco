import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
     
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        // | Atributo     | Tipo    | Exemplo       |
        // | ------------ | ------- | ------------- |
        // | Numero       | Inteiro | 1021          |
        // | Agencia      | Texto   | 067-8         |
        // | Nome Cliente | Texto   | MARIO ANDRADE |
        // | Saldo        | Decimal | 237.48        |

       
        double saldo = 237.48;

        System.out.println("Por favor, digite o numero da conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();


    

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}