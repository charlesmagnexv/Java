/*
 * Ex36.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 36) Escreva um programa que solicite ao usuário a quantidade de termos, validando a 
 * entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o 
 * programa, caso seja positivo imprimir a sequência de termos: 1, 1/2, 1/3, 1/4, 1/5, ...
 * 
 * 
 */

import java.util.Scanner;
public class Ex36 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, i=2;
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		if(numero>0){
			System.out.print("1, ");
			while(i<=5){
				System.out.print("1/"+i+", ");
				i++;
			}
			System.out.print("...");
		}else if(numero<0){
			while(numero<0){
				System.out.print("Digite um numero: ");
				numero = leia.nextInt();
			}
			if(numero>0){
				System.out.print("1, ");
				while(i<=5){
					System.out.print("1/"+i+", ");
					i++;
				}
				System.out.print("...");
			}else{
				System.out.println("Fim do programa!");
			}
		}else{
			System.out.println("Fim do programa!");
		}
	}
}

