/*
 * Soma10Numeros.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 12) Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos.
 * 
 */

import java.util.Scanner;
public class Soma10Numeros {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,soma=0;
		for(int c = 1; c <= 10; c++){
			System.out.print("Entre com um numero: ");
			numero = leia.nextInt();
			soma += numero;
		}
		System.out.println("Soma dos numeros lidos: "+soma);
	}
}

