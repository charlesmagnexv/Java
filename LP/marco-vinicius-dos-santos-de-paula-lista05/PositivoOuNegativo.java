/*
 * PositivoOuNegativo.java
 * Marco Vinicius dos Santos de Paula
 *2) Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo
(considere o valor zero como positivo).
 */

import java.util.Scanner;
public class PositivoOuNegativo {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.print("Digite um numero: ");
		n = ler.nextInt();
		if(n >= 0){
			System.out.println("Eh positivo");
		}else{
			System.out.println("Eh negativo");
		}
	}
}

