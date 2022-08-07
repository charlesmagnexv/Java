/*
 * LerEImprimir02.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 5) Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso 
 * o valor informado (para N) não seja maior que 0, deverá ser lido um novo valor para N.
 */

import java.util.Scanner;
public class LerEImprimir02 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 0, contador = 1;
		while(n<=0){
			System.out.print("Digite um numero: ");
			n = leia.nextInt();
		}
		while(contador<=n){
			System.out.println(contador);
			contador++;
		}
		
		
		
		
		
		/*System.out.print("Digite um numero: ");
		n = leia.nextInt();
		if(n<=0){
			while(n<=0){
				System.out.print("Digite um numero: ");
				n = leia.nextInt();
			}
			if(n>0){
				while(contador <= n){
					System.out.println(contador);
					contador++;
				}
			}
		}*/
		
		
	}
}

