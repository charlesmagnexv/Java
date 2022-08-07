/*
 * Ex38.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 38) Escreva um programa que solicite ao usuário a quantidade de 
 * termos, validando a entrada, sendo o valor negativo, solicitar nova 
 * entrada, sendo o valor ZERO, finalizar o programa, caso seja positivo 
 * imprimir a sequência de termos: 0 (0/1), 1/2, 2/3, 3/4, 4/5, ...
 * 
 * 
 */

import java.util.Scanner;
public class Ex38 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,i=1,c=2;
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		if(numero>0){
			System.out.print(" 0 ");
			System.out.print(" (0/1), ");
			while(c<=5){
				System.out.print(i+"/"+c+", ");
				i++;
				c++;
			}
			System.out.print("...");
		}else if(numero<0){
			while(numero<0){
				System.out.print("Digite um numero: ");
				numero = leia.nextInt();
			}
			if(numero>0){
				System.out.print(" 0 ");
				System.out.print(" (0/1), ");
				while(c<=5){
					System.out.print(i+"/"+c+", ");
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

