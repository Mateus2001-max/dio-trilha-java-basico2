import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		contar(parametroUm, parametroDois);
	}
    static void contar(int parametroUm, int parametroDois){
        if(parametroUm > parametroDois){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        for(int n=0; parametroUm <= parametroDois; n++){
            System.out.println("Imprimindo o número " + n);
            parametroUm++;
        }  
    }
  

}
