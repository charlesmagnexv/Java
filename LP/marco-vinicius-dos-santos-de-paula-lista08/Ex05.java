/******************************************************************************

                           5) Escreva um programa para
                            ler 2 vetores de dimensão n (n<=15) e calcular a soma
                            entre eles gerando um terceiro vetor de mesma dimensão.
                            
                            Marco Vinicius dos Santos de Paula

*******************************************************************************/
import java.util.Scanner;
public class Ex05
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
	    int vetor3[]=new int[numeroElementos];
	    for(int i=0;i<vetor.length;i++){
	        System.out.print("Digite um elemento do vetor 1: ");
	        vetor[i]=leia.nextInt();
	        System.out.print("Digite um elemento do vetor 2: ");
	        vetor2[i]=leia.nextInt();
	        vetor3[i]=vetor[i]+vetor2[i];
	    }
	    System.out.println("\n\nExibição do vetor\n\n");
	    for(int i=0;i<vetor3.length;i++){
	        System.out.println(vetor3[i]);
	    }
	}
}
