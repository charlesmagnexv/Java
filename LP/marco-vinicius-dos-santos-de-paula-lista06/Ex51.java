/*
 * Ex51.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 51) Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima o resultado.
 * 
 * 
 */

import java.util.Scanner;
public class Ex51 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int termos,fibonacci=0,termoAnterior=0,fAtual=1;
		do{
			System.out.print("Entre com a quantidade de termos da sequencia: ");
			termos = leia.nextInt();
			if(termos<=0){
				System.out.println("\tEntre com um valor maior do que 0");
			}
		}while(termos<=0);
		termos--;
		System.out.print("0 ");
		for(int i = 1; i <= termos ;i++){
			fibonacci=termoAnterior+fAtual;
			fAtual=termoAnterior;
			termoAnterior=fibonacci;
			System.out.print(fibonacci+" ");
			fibonacci=0;
		}
	}
}

