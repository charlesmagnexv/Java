/******************************************************************************

                           7) Escreva um programa para
                            ler um vetor E (de inteiros), de tamanho N (N<=20),
                            determinar e imprimir o maior e o menor elemento deste vetor.
                            
                            Marco Vinicius dos Santos de Paula

*******************************************************************************/
import java.util.Scanner;
public class Ex07
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int numeroElementos,menor,maior;
	    do{
	        System.out.print("Digite a quantidade de elementos do vetor: ");
	        numeroElementos=leia.nextInt();
	        if(numeroElementos>20){
	            System.out.println("PROIBIDO A ENTRADA DE NUMEROS MAIORES DO QUE 20");
	        }
	    }while(numeroElementos>20);
	    int vetor[]=new int[numeroElementos];
	    System.out.print("Digite um elemento do vetor 1: ");
	    vetor[0]=leia.nextInt();
	    maior=vetor[0];
	    menor=vetor[0];
	    for(int i=1;i<vetor.length;i++){
	        System.out.print("Digite um elemento do vetor 1: ");
	        vetor[i]=leia.nextInt();
	        if(vetor[i]>maior){
	            maior=vetor[i];
	        }
	        if(vetor[i]<menor){
	            menor=vetor[i];
	        }
	    }
	    System.out.println("\n\nExibição do maior e do menor\n\n");
	    
	    System.out.println("O menor elemento deste vetor: "+menor);
	    System.out.println("O maior elemento deste vetor: "+maior);
	}
}
