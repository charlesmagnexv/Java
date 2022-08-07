/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Ex44{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int contador=0,fatorial=1,fAnterior=1;
		System.out.print("Digite um numero: ");
		contador = leia.nextInt();
		for(int i=0;i<contador;i++){
		    fAnterior = i;
    		for(int c=fAnterior-1;c>=1;c--){
    		    fatorial=fAnterior*c;
    		    fAnterior=fatorial;
    		}
		    System.out.println("Fatorial de "+i+" : "+fatorial);
		}
	}
}
