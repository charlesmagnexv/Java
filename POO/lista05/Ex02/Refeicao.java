/*
 * Refeicao.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 2) Imagine o problema de sair com os amigos para uma refeição em um restaurante e ao final ter que
	dividir a conta para cada pessoa. Outra coisa importante, os 10% do garçom é opcional. Criar uma classe
	para solucionar o problema proposto, onde tem o valor da conta a ser paga (sem os 10% do garçom), a
	quantidade de pessoas que dividirão essa conta e se vai
	ser pago os 10% do garçom, sim ou não. Valide os
	dados inseridos não permitindo absurdos.
 * 
 * 
 */


public class Refeicao {
	private int numeroPessoas;
	private double valorConta;
	private boolean gorjeta;
	public Refeicao () {
		numeroPessoas = 0 ;
		valorConta = 0;
		gorjeta = false;
	}
	public void setNumeroPessoas ( int numeroPessoas ) {
		this.numeroPessoas = numeroPessoas;
	}
	public void setValorConta ( double valorConta ) {
		this.valorConta = valorConta;
	}
	public void setGorjeta ( boolean gorjeta ) {
		this.gorjeta = gorjeta;
	}
	public int getNumeroPessoas () {
		return numeroPessoas;
	}
	public double getValorConta () {
		return valorConta;
	}
	public String getGorjeta () {
		if( gorjeta ){
			return "Sera paga a gorjeta do garcom";
		}else{
			return "NAO sera paga a gorjeta do garcom";
		}
	}
	@Override
	public String toString () {
		return "\nQuantidade de pessoas: " + getNumeroPessoas() +
		       "\nValor da conta: " + getValorConta() +
		       "\nGorjeta: " + getGorjeta();
	}
}

