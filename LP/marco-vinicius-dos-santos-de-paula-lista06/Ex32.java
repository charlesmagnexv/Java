/*
 * Ex32.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 32) Escreva um programa que solicite ao usuário a quantidade de termos, validando 
 * a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar 
 * o programa, caso seja positivo imprimir a sequência de termos: 0, 2, 4, 6, ...
 * 
 * 
 */

import java.util.Scanner;
public class Ex32 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,i=0;
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		if(numero>0){
			while(i<=6){
				System.out.print(i+", ");
				i+=2;
			}
			System.out.print("...");
		}else if(numero<0){
			while(numero<0){
				System.out.print("Digite um numero: ");
				numero = leia.nextInt();
			}
			if(numero>0){
				while(i<=6){
					System.out.print(i+", ");
					i+=2;
				}
			}else{
				System.out.println("Finalizar o programa!");
			}
		}else{
			System.out.println("Finalizar o programa!");
		}
	}
}

