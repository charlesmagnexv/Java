/*
 * LerEImprimir.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 4) Escreva um programa em Java para ler um valor N e imprimir todos os valores inteiros entre 1 
 * (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.
 */

import java.util.Scanner;
public class LerEImprimir {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, contador = 1;
		System.out.print("Digite um numero: ");
		n = leia.nextInt();
		if(n<=0){
			System.out.println("0 E NUMEROS NEGATIVOS NAO SAO NUMEROS VALIDOS.");
		}else{
			while(contador <= n){
				System.out.println(contador);
				contador++;
			}
		}
	}
}

