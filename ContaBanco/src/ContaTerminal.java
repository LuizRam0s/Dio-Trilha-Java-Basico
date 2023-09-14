import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem vindo ao Banco Sandanter,\nPara começar por favor digite seu nome:");
        nomeCliente= sc.nextLine();
        System.out.println("Por favor, agora digite a agencia:");
        agencia = sc.nextLine();
        System.out.println("Por favor, agora digite o numero da conta:");
        numero = sc.nextInt();
        System.out.println("Digite seu saldo:");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +
                numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}