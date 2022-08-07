/*
 * Ex42.java
 * 
 * Construa um programa para mostrar o fatorial dos números inteiros na faixa de 1 a 10.
 * 
 * 
 */

import java.util.Scanner;
public class Ex42 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int fatorial=1,fAnterior;
		for(int numero=1;numero<=10;numero++){
			fAnterior=numero;
			if(numero==0){
				System.out.println("O fatorial de "+numero+" eh: 1");
			}else{
				for(int i = numero-1;i>=1;i--){
					fatorial=i*fAnterior;
					fAnterior=fatorial;
				}
				System.out.println("Fatorial de "+numero+" = "+fatorial);
			}
		}
	}
}

