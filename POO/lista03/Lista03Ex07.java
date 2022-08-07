/*
 * Lista03Ex07.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 7) [POO-012] Crie um programa que pergunte ao usuário se ele deseja lançar/jogar um dado. 
 * Por meio de um método chamado dado(), retorne, através de sorteio aleatório, um número de 1 até 6. O programa 
 * deve ser executado enquanto o usuário quiser continuar jogando o dado.
	Entrada: 				Saída:
	Jogar o dado [s/n]: s 	Saiu: 4
	Jogar o dado [s/n]: s 	Saiu: 3
	Jogar o dado [s/n]: s 	Saiu: 1
	Jogar o dado [s/n]: n
	Jogar o dado [s/n]: s 	Saiu: 6
	Jogar o dado [s/n]: n
	Jogar o dado [s/n]: n
 * 
 * 
 */

import java.util.Scanner;
public class Lista03Ex07 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String pergunta = "";
		do{
			System.out.print("Deseja jogar o dado [s/n]: \t");
			pergunta = leiaStr.nextLine().toLowerCase();
			if( pergunta.equals("s") ){
				System.out.print( "Saiu: \t" + dado() + "\n" );
			}
		}while( !pergunta.equals("n") );
	}
	static int dado(){
		return (int)((Math.random()*6)+1);
	}
}

