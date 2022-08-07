/*
 * Operacoes.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 11) Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
e ‘/’. Calcule e mostre a operação efetuada e o seu resultado.
 */

import java.util.Scanner;
public class Operacoes {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		int n1,n2;
		String operacao;
		System.out.print("Digite um numero: ");
		n1 = leia.nextInt();
		System.out.print("Digite outro numero: ");
		n2 = leia.nextInt();
		System.out.print("Insira a operacao(+,-,*,/): ");
		operacao = leiaStr.nextLine();
		switch(operacao){
			case "+":
				System.out.println("A soma dos numeros: "+(n1+n2));
				break;
			case "-":
				System.out.println("A subtracao entre os numeros: "+(n1-n2));
				break;
			case "*":
				System.out.println("A multiplicacao entre os numeros: "+(n1*n2));
				break;
			case "/":
				System.out.println("A divisao entre os numeros: "+((double)n1/n2));
				break;
			default:
				System.out.println("Comando invalido");
		}
	}
}

