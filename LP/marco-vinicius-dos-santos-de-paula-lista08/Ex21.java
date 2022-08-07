/******************************************************************************

                            21)Escreva um programa para ler um vetor AB de 10 posições com elementos
                            fornecidos pelo usuário. Para cada elemento ímpar encontrado, multiplique ele por
                            dois, gerando assim um vetor de elementos pares e ao final exiba o resultado.
                            
                            In Corde Jesu, semper.

*******************************************************************************/
import java.util.Scanner;
public class Ex21
{
	public static void main(String[] args) {
	    Scanner leia=new Scanner(System.in);
	    int vetor[]=new int[10];
	    
	    for(int i=0;i<vetor.length;i++){
	        System.out.print("Insira o elemento "+i+" do vetor: ");
	        vetor[i]=leia.nextInt();
	        if(vetor[i]%2!=0){
	            vetor[i]*=2;
	        }
	    }
	    for(int i=0;i<vetor.length;i++){
	        System.out.println("Elemento "+i+" do vetor: "+vetor[i]);
	    }
	}
}
