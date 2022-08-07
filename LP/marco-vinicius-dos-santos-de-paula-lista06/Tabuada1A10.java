/*
 * Tabuada1A10.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 7) Escreva um programa em Java para ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 
 * 1 a 10 do valor lido.
 * 
 */

import java.util.Scanner;
public class Tabuada1A10 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 0;
		while(n<=0){
			System.out.print("Digite um numero: ");
			n = leia.nextInt();
		}
		for(int i = 1; i <= 10; i++){
			System.out.println(n+"x"+i+" = "+(n*i));
		}
	}
}

