import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        int contaNumero = 1021;
        double contaSaldo = 1.123;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Olá, obrigado por acessar o BancoJava.");
        System.out.print("BancoJava: Por favor, para criar uma conta, insira seu nome: ");
        String nome = scanner.next();
        System.out.println("Seja Bem Vindo " + nome + " ao BancoJava.");
        System.out.println("BancoJava: Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        System.out.println(nome + ", Número da Conta: " + contaNumero);
        System.out.println("Tudo pronto, escreva 'concluir' para criar sua conta!");
        String finalizar = scanner.next();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + contaNumero + " e seu saldo " + contaSaldo + " já está disponível para saque.");


        //Programa: "Por favor, digite o número da Agência !"
    /* 
     "Olá [Nome Cliente], obrigado por criar uma conta 
     em nosso banco, sua agência é [Agencia], conta [Numero] e 
     seu saldo [Saldo] já está disponível para saque".
    */

    }
}
