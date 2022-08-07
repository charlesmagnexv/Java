/******************************************************************************

                           3) Escreva um programa para ler um vetor C de N posições, onde N é menor ou igual a 20 e imprimir seus elementos. O 
                           usuário deve informar o número de posições e os elementos.
                            
                            Marco Vinicius dos Santos de Paula

*******************************************************************************/
import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int numeroElementos;
	    do{
	        System.out.print("Digite a quantidade de elementos do vetor: ");
	        numeroElementos=leia.nextInt();
	    }while(numeroElementos>20);
	    int vetor[]=new int[numeroElementos];
	    for(int i=0;i<vetor.length;i++){
	        System.out.print("Digite um elemento do vetor: ");
	        vetor[i]=leia.nextInt();
	    }
	    System.out.println("\n\nExibição do vetor\n\n");
	    for(int i=0;i<vetor.length;i++){
	        System.out.println(vetor[i]);
	    }
	}
}
