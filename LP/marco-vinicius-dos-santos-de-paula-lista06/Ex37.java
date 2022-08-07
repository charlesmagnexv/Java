/*
 * Ex37.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 37) Escreva um programa que solicite ao usuário a quantidade de termos, 
 * validando a entrada, sendo o valor negativo, solicitar nova entrada, sendo 
 * o valor ZERO, finalizar o programa, caso seja positivo imprimir a sequência de termos: 1, 1/2, 2/3, 3/4, 4/5, ...
 * 
 * 
 */

import java.util.Scanner;
public class Ex37 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, i=2, c=1;
		System.out.print("Diigite um numero: ");
		numero = leia.nextInt();
		if(numero>0){
			System.out.print("1, ");
			while(i<=5){
				System.out.print(c+"/"+i+", ");
				i++;
				c++;
			}
			System.out.print("...");
		}else if(numero<0){
			while(numero<0){
				System.out.print("Diigite um numero: ");
				numero = leia.nextInt();
			}
			if(numero>0){
				System.out.print("1, ");
				while(i<=5){
					System.out.print(c+"/"+i+", ");
					i++;
					c++;
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

