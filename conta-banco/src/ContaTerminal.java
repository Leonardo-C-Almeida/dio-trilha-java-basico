import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = sc.nextInt();
        
        System.out.println("Por favor, digite a Agência !");
        String agencia = sc.next();
        
        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = sc.next();
        
        System.out.println("Por favor, digite o valor do saldo !");
        float saldo = sc.nextFloat();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " 
        + "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");


    }
}
