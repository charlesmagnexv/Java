/******************************************************************************

                           4) Escreva um programa para
                            ler um vetor D de N posições, onde N é menor
                            ou igual a 20 e imprimir seus elementos. O usuário deve informar o número
                            de posições e os elementos. O programa deve validar a quantidade de
                            posições, não permitindo que o usuário forneça um valor inválido.
                            
                            Marco Vinicius dos Santos de Paula

*******************************************************************************/
import java.util.Scanner;
public class Ex04
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int numeroElementos;
	    do{
	        System.out.print("Digite a quantidade de elementos do vetor: ");
	        numeroElementos=leia.nextInt();
	        if(numeroElementos>20){
	            System.out.println("PROIBIDO A ENTRADA DE NUMEROS MAIORES DO QUE 20");
	        }
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
