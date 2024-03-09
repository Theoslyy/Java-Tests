package entities;

public class Conta {
	private double saldo; 
	private String nome; 
	private int numero; // numero tambem pode ser tratado como string ja que nao sera alterado
	public Conta(String nome, int numero, double depositoInicial) {
		this.nome = nome;
		this.numero = numero;
		deposito(depositoInicial); 
		/*
		 O motivo pelo qual usamos a funcao deposito ao inves de so dar this.saldo 
		 vem do fato de que alterar o valor do saldo precisa sempre ser feito por meio da funcao
		 deposito para garantir seguranca 
		*/
	} 
	public Conta(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	public void alterarNome(String nome) {
		this.nome = nome;
	}
	public void deposito(double quantidade) {
		saldo = saldo + quantidade; 
	}
	public void saque(double quantidade) {
		saldo = saldo - (quantidade + 5);
	}
	public int getNumber() {
		return numero;
	}
	public String getName() {
		return nome;
	}
	public double getBalance() {
		return saldo;
	}
	public String toString() {
		return "Conta: " + numero + " " + "Titular: " + nome + " " + "Saldo: $" + String.format("%.2f", saldo); 
	}
}
