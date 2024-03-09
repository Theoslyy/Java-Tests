package application;

import java.util.Scanner;
import entities.Conta;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta cliente; 
		System.out.printf("Qual o nome do titular? ");
		String titular = sc.nextLine();
		System.out.printf("Qual o numero da conta? ");
		int numero = sc.nextInt();
		System.out.printf("Pressione 1 caso deseje fazer um deposito inicial e 2 caso contrario ");
		int check = sc.nextInt();
		if (check == 1) {
			System.out.printf("Deposito: ");
			double deposito = sc.nextDouble();
			cliente = new Conta(titular, numero, deposito);
		}
		else if (check == 2) {
			cliente = new Conta(titular, numero);

		}
		else{
			System.out.printf("Operacao nao disponivel, iniciaremos sua conta sem deposito inicial");
			cliente = new Conta(titular, numero);
		}
		System.out.printf("Qual o deposito a ser feito? ");
		double deposito = sc.nextDouble();
		cliente.deposito(deposito);
		System.out.println(cliente);
		System.out.printf("E agora, qual o valor a ser sacado? %n Lembre que o banco cobra uma taxa de 5 reais por saque. ");
		double saque = sc.nextDouble();
		cliente.saque(saque);
		System.out.println(cliente);
		sc.close();
		
	}

}
