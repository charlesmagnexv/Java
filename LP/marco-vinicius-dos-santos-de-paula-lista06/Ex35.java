/*
 * Ex35.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 35) Escreva um programa que solicite ao usuário a quantidade de termos, 
 * validando a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor 
 * ZERO, finalizar o programa, caso seja positivo imprimir a sequência de termos: 1, -1, 2, -2, 3, -3, ...
 * 
 * 
 */

import java.util.Scanner;
public class Ex35 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, i=1;
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		if(numero>0){
			while(i<=3){
				System.out.print(i+", "+(-1*i)+", ");
				i++;
			}
			System.out.print("...");
		}else if(numero<0){
			while(numero<0){
				System.out.print("Digite um numero: ");
				numero = leia.nextInt();
			}
			if(numero>0){
				while(i<=3){
					System.out.print(i+", "+(-1*i)+", ");
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

