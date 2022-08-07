/******************************************************************************

                            17)Escreva um programa para solicitar ao usuário a quantidade de elementos da
                            sequência de Primos (N<=20) e gerar um vetor X com os elementos da sequência e
                            imprimir o vetor.

                In Corde Jesu, semper
*******************************************************************************/
import java.util.Scanner;
public class Ex17
{
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int quantidade,contador=0,j=0;
		System.out.print("Digite a quantidade de termos da sequencia de numeros primos: ");
		quantidade=leia.nextInt();
		int vetor[]=new int[quantidade];
		for(int i=1;i<=100;i++){
		    for(int c=1;c<=i;c++){
		        if(i%c==0){
		            contador++;
		        }
		    }
		    if(contador==2){
		        vetor[j]=i;
		        j++;
		    }
		    contador=0;
		}
		
		System.out.println("\n\nExibicao do vetor: \n\n");
		for(int i=0;i<j;i++){
		    System.out.println(vetor[i]);
		}
	}
}
