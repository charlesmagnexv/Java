/*
 * Ex23.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 23) Elabore um programa para obter o nome completo de uma pessoa e a seguir forneça o
sobrenome do nome completo informado. Por exemplo, para o nome completo: Omero
Francisco Bertol, o programa deverá fornecer como resultado: Bertol.
 * 
 * 
 */

import java.util.Scanner;
public class Ex23 {
	
	public static void main (String[] args) {
		Scanner leiaStr=new Scanner(System.in);
		String frase="",frase2[];
		int posicaoSobrenome;
		System.out.print("Insira uma frase: ");
		frase = leiaStr.nextLine();
		posicaoSobrenome=frase.length();
		frase2=frase.split(" ");
		for(int i=0;i<frase2.length;i++){
			if(i==frase2.length-1){
				System.out.println("\n"+frase2[i]);
			}
		}
	}
}

