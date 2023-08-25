import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua Conta !");
        int Numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        String NomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o Saldo !");
        double Saldo = sc.nextDouble();

        sc.close();

        System.out.println();
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                Agencia + ", conta " + Numero +" e seu saldo " + Saldo +" já está disponível para saque.");

    }
}