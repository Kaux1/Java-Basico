import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int saldo = 238;

        System.out.println("Digite seu nome");
        String nome = scan.next();

        System.out.println("digite o Numero da sua conta");
        int numeroConta = scan.nextInt(0);

        System.out.println("digite a agencia");
        int agencia = scan.nextInt();

        System.out.println("Olá"+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é"+ agencia + " conta"+ numeroConta + "e seu saldo já está disponível para saque");
    }
}
