/******************************************************************************

                            20)Escreva um programa para ler um vetor AA de 10 posições com
                            elementos fornecidos pelo usuário e colocar os elementos em ordem
                            decrescente. Ao final imprimir o vetor Z ordenado.
                            
                            In Corde Jesu, semper.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
public class Ex20
{
	public static void main(String[] args) {
	    Scanner leia=new Scanner(System.in);
	    int vetor[]=new int[10];
	    
	    for(int i=0;i<vetor.length;i++){
	        System.out.print("Insira o elemento "+i+" do vetor: ");
	        vetor[i]=leia.nextInt();
	    }
	    Arrays.sort(vetor);
	    List listaNumeros=Arrays.asList(vetor);
	    Collections.reverse(listaNumeros);
	    for(int i=0;i<vetor.length;i++){
	        System.out.println("Elemento "+i+" do vetor: "+listaNumeros[i]);
	    }
	}
}
