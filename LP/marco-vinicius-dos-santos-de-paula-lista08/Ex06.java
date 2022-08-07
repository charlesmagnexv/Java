/******************************************************************************

                           6) Escreva um programa para
                            ler 2 vetores de dimensão n (n<=15) e
                            comparar os elementos do primeiro vetor com o segundo e informar a
                            posição em que os elementos são iguais.
                            
                            Marco Vinicius dos Santos de Paula

*******************************************************************************/
import java.util.Scanner;
public class Ex06
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int numeroElementos;
	    do{
	        System.out.print("Digite a quantidade de elementos do vetor: ");
	        numeroElementos=leia.nextInt();
	        if(numeroElementos>15){
	            System.out.println("PROIBIDO A ENTRADA DE NUMEROS MAIORES DO QUE 15");
	        }
	    }while(numeroElementos>15);
	    int vetor[]=new int[numeroElementos];
	    int vetor2[]=new int[numeroElementos];
	    for(int i=0;i<vetor.length;i++){
	        System.out.print("Digite um elemento do vetor 1: ");
	        vetor[i]=leia.nextInt();
	        System.out.print("Digite um elemento do vetor 2: ");
	        vetor2[i]=leia.nextInt();
	    }
	    System.out.println("\n\nExibição do vetor\n\n");
	    for(int i=0;i<vetor.length;i++){
	        if(vetor[i]==vetor2[i]){
	            System.out.println("Os vetores sao iguais na posicao "+i);
	        }
	    }
	}
}
