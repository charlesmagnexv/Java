/*
 * ValoresNegativos.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 8) Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.
 */

import java.util.Scanner;
public class ValoresNegativos {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n,negativos=0,contador=1;
		while(contador<=10){
			System.out.print("Digite um numero: ");
			n = leia.nextInt();
			contador++;
			if(n<0)negativos++;
		}
		System.out.println("Quantidade de numeros negativos: "+negativos);
	}
}

