/*
 * Lista04Ex04.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 4) [POO-017] Um professor, muito legal, fez 3 provas durante um semestre, mas só vai 
 * levar em conta as duas notas mais altas para calcular a média. Crie um programa que solicite ao 
 * usuário o valor double das 3 notas, mostre como seria a média com essas 3 provas, a média com as 2 
 * notas mais altas, bem como a nota mais alta e a nota mais baixa. Tente criar apenas um método para retornar 
 * essas médias. Este método deverá receber as 3 notas como parâmetros de entrada e retornar os valores solicitados. 
 * As notas devem ser de zero a dez e qualquer valor diferente deverá ser desconsiderado, assumindo zero.
	Entrada:                       Saída:                Cálculo:
	Entre com a nota 1: 6          Média maiores: 7      [ (6 + 8) / 2 ]
	Entre com a nota 2: 8          Média aritmética: 6   [ (6 + 8 + 4) / 3 ]
	Entre com a nota 3: 4          Maior nota: 8         [ 6, 8, 4 ]
	                               Menor nota: 4         [ 6, 8, 4 ]
	Entre com a nota 1: 6          Média maiores: 7      [ (6 + 8) / 2 ]
	Entre com a nota 2: 8          Média aritmética: 4,7 [ (6 + 8 + 0 ) / 3 ]
	Entre com a nota 3: 14         Maior nota: 8         [ 6, 8, 0 ]
	                               Menor nota: 0         [ 6, 8, 0 ]
 * 
 * 
 */

import java.util.Scanner;
public class Lista04Ex04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner( System.in );
		double n1, n2, n3;
		System.out.print( "Entre com a nota 1: " );
		n1 = leia.nextDouble();
		if( n1 > 10 || n1 < 0 ){
			n1 = 0;
		}
		System.out.print( "Entre com a nota 2: " );
		n2 = leia.nextDouble();
		if( n2 > 10 || n2 < 0 ){
			n2 = 0;
		}
		System.out.print( "Entre com a nota 3: " );
		n3 = leia.nextDouble();
		if( n3 > 10 || n3 < 0 ){
			n3 = 0;
		}
		double vetor[] = notas( n1, n2, n3 );
		System.out.println( "Media maiores: " + vetor[0] );
		System.out.println( "Media aritmetica: " + vetor[1] );
		System.out.println( "Maior nota: " + vetor[2] );
		System.out.println( "Menor nota: " + vetor[3] );
	}
	static double[] notas( double n1, double n2, double n3 ){
		double vetorNotas[] = new double[4];
		double menor, maior, maior1;
		maior1 = Math.max( n1, n2 );
		maior = Math.max( maior1, n3 );
		menor = Math.min( n1, n2 );
		menor = Math.min( menor, n3 );
		if( n1 > n2 && n1 > n3 && n2 > n3 ){
			vetorNotas[0] = ( n1 + n2 ) / 2 ;
		}else if( n1 > n2 && n1 > n3 && n3 > n2 ){
			vetorNotas[0] = ( n1 + n3 ) / 2 ;
		}else if( n2 > n1 && n2 > n3 && n1 > n3 ){
			vetorNotas[0] = ( n2 + n1 ) / 2 ;
		}else if( n2 > n1 && n2 > n3 && n3 > n1 ){
			vetorNotas[0] = ( n2 + n3 ) / 2 ;
		}else if( n3 > n1 && n3 > n2 && n1 > n2 ){
			vetorNotas[0] = ( n3 + n1 ) / 2 ;
		}else if( n3 > n1 && n3 > n2 && n2 > n1 ){
			vetorNotas[0] = ( n3 + n2 ) / 2 ;
		}
		vetorNotas[1] = ( n1 + n2 + n3 ) / 3;
		vetorNotas[2] = maior;
		vetorNotas[3] = menor;
		return vetorNotas;
	}
}

