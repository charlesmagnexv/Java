/******************************************************************************

                            16)Escreva um programa para solicitar ao usuário a quantidade de
                            elementos da sequência de Fibonacci (N<=20) e gerar um vetor V com os
                            elementos da sequência e imprimir o vetor.

                In Corde Jesu, semper
*******************************************************************************/
import java.util.Scanner;
public class Ex16
{
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int quantidade,termo=0,termoProxi=0,termoAnterior=1;
		System.out.print("Digite a quantidade de termos da sequencia de FIbonacci: ");
		quantidade=leia.nextInt();
		int vetor[]=new int[quantidade];
		for(int i=0;i<quantidade;i++){
		    vetor[i]=termoProxi;
		    termoProxi=0;
		    termoProxi=termo+termoAnterior;
		    termoAnterior=termo;
		    termo=termoProxi;
		}
		
		System.out.println("Exibicao do vetor: ");
		for(int i=0;i<vetor.length;i++){
		    System.out.println(vetor[i]);
		}
	}
}
