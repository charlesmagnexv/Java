/*
 * Ex012.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 12) Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos.
 * 
 * 
 */

import java.util.Scanner;
public class Ex012 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, soma=0;
		for(int i = 1; i <= 10; i++){
			System.out.print("Digite um numero: ");
			numero = leia.nextInt();
			soma += numero;
		}
		System.out.println("Soma total dos numeros: "+soma);
	}
}

