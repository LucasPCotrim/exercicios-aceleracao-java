import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número para a tabela de multiplicação: ");
		int num = input.nextInt();

		exibirTabelaDeMultiplicacao(num);
		
		input.close();
	}

	public static void exibirTabelaDeMultiplicacao(int num) {
		System.out.println("\nTabela de multiplicação de " + num + ":");
		for (int i = 1; i <= 10; i++) {
			 System.out.println(num + " x " + i + " = " + (num * i));
		}
 }
}
