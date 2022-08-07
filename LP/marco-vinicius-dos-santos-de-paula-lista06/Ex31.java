/*
 * Ex31.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 31) Escreva um programa que solicite ao usuário a quantidade de termos, validando 
 * a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o 
 * programa, caso seja positivo imprimir a sequência de termos: 1, 2, 3, 4, ...
 * 
 * 
 */

import java.util.Scanner;
public class Ex31 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,i=1;
		System.out.print("Insira um numero: ");
		numero = leia.nextInt();
		if(numero>0){
			while(i<=numero){
				System.out.print(i+", ");
				i++;
			}
		}else if(numero<0){
			while(numero<0){
				System.out.print("Insira um numero: ");
				numero = leia.nextInt();
			}
			if(numero>0){
				while(i<=numero){
					System.out.print(i+", ");
					i++;
				}
			}
		}
	}
}

