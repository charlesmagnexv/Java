/*
 * EMaiorNaoEMaior.java
 * Marco Vinicius dos Santos de Paula
 *1) Escreva um programa em Java para ler um valor e escrever a mensagem É MAIOR QUE
10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!.
 */

import java.util.Scanner;
public class EMaiorNaoEMaior {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
		System.out.print("Digite um numero: ");
		n = leia.nextInt();
		if(n > 10){
			System.out.println("Eh maior!");
		}else{
			System.out.println("Nao eh maior!");
		}
	}
}

