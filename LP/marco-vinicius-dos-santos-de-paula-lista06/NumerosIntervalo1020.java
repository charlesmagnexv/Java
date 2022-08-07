/*
 * NumerosIntervalo1020.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 9) Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos estão no 
 * intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.
 */

import java.util.Scanner;
public class NumerosIntervalo1020 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n,dentroIntervalo = 0,foraIntervalo = 0,contador=1;
		do{
			System.out.print("Digite um numero: ");
			n = leia.nextInt();
			contador++;
			if(n>=10 && n<=20) dentroIntervalo++;
			else foraIntervalo++;
		}while(contador<=10);
		System.out.println("Numeros dentro do intervalo [10-20]: "+dentroIntervalo);
		System.out.println("Numeros fora intervalo [10-20]: "+foraIntervalo);
	}
}

