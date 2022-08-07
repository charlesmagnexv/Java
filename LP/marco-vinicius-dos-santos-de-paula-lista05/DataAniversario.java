/*
 * DataAniversario.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 5) Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu).
 */

import java.util.Scanner;
public class DataAniversario {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int anoNascimento, anoAtual;
		System.out.print("Digite o ano em que nasceste: ");
		anoNascimento = leia.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = leia.nextInt();
		if(anoNascimento <= 0|| anoAtual <= 0){
			System.out.println("Entrada invalida");
		}else{
			if((anoAtual-anoNascimento) >= 18){
				System.out.println("Pode votar!");
			}else{
				System.out.println("Nao pode votar!");
			}
		}
	}
}

