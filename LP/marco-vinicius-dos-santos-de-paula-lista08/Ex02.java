/******************************************************************************

                           2) Escreva um programa para ler um vetor B de 15 posições e imprimir em ordem invertida.
                            
                            Marco Vinicius dos Santos de Paula

*******************************************************************************/
import java.util.Scanner;
public class Ex02
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int vetor[]=new int[15];
	    for(int i=0;i<vetor.length;i++){
	        System.out.println("Digite um elemento do vetor: ");
	        vetor[i]=leia.nextInt();
	    }
	    System.out.println("\nExibição do vetor");
	    for(int i=vetor.length-1;i>=0;i--){
	        System.out.println(vetor[i]);
	    }
	}
}
