import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();
        scanner.nextLine(); // Adicionado para consumir a nova linha restante após scanner.next()
        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", 
            nomeCliente, agencia, numero, saldo);
        scanner.close();
    }
}