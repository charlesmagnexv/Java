/******************************************************************************

           48)Solicite ao usuário a quantidade de termos da sequência de números primos e imprima o resultado.

*******************************************************************************/
import java.util.Scanner;
public class Ex48{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int contador=0,primo=0;
	    System.out.print("Insra um numero: ");
	    contador = leia.nextInt();
    	for(int c=1;c<=contador;c++){
    	    primo=0;
        	for(int i=1;i<=c;i++){
        	    if(c%i==0){
        	       primo++;
        	    }
        	}
        	if(primo==2){
        	   System.out.println(c);
        	}
    	}
	}
}
