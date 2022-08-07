/*
 * Lista03Ex06.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 6) [POO-011] Crie um programa que solicite ao usuário números inteiros. A cada número inserido, perguntar ao usuário se ele deseja informar outro número. Através de um método, verifique e retorne o menor dos valores.
	Entrada: 									Saída:
	Entre com um número inteiro: 8 				O menor é: 2
	Inserir outro [s/n]: s
	Entre com um número inteiro: 2
	Inserir outro [s/n]: n
	Entre com um número inteiro: -48 			O menor é: -48
	Inserir outro [s/n]: n
	Entre com um número inteiro: 17 			O menor é: 17
	Inserir outro [s/n]: s
	Entre com outro número inteiro: 17
	Inserir outro [s/n]: s
	Entre com outro número inteiro: 34
	Inserir outro [s/n]: n
 * 
 * 
 */

import java.util.Scanner;
public class Lista03Ex06 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		int numero, numeroMenor = 0, contador = 0;
		String simOuNao = "";
		do{
			contador ++;
			System.out.print("Entre com um numero inteiro: \t");
			numero = leia.nextInt();
			System.out.print("Inserir outro [s/n]: \t");
			simOuNao = leiaStr.nextLine().toLowerCase();
			if( contador == 1 ){
				numeroMenor = numero;//a partir do momento em que ele recebe o "numero" o 0 da inicialização é desconsiderado
			}else{
				numeroMenor = menor(numero, numeroMenor);//passei o próprio retorno como parâmetro, a fim de que o método não perca o fio da meada e posa comparar o "numero" com o numero que atualmente é o maior
			}
			if(simOuNao.equals("n")){
				System.out.println("O menor eh: " + numeroMenor);
			}
		}while(!simOuNao.equals("n"));
	}
	static int menor(int numero, int numeroMenor){
		if(numero < numeroMenor){
			return numero;
		}else{
			return numeroMenor;
		}
	}
}

