/*
 * Ex18.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 18) Desenvolva um programa que leia uma cadeia de caracteres e através de uma mensagem
indique se esta cadeia representa uma sequência binária de 8 bit’s ou não.
Ex:
- não é uma sequência de 8bit’s: 01101, 10192898, 10001jaA
- é uma sequência de 8bit’s: 01101011, 10110101, 10000000
 * 
 * 
 */

import java.util.Scanner;
public class Ex18 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String frase="";
		int contador=0;
		System.out.print("Insira uma sequencia binaria: ");
		frase=leiaStr.nextLine();
		if(frase.length()!=8){
			System.out.print("NAO eh uma sequencia de 8 bits");
		}else{
			for(int i=0;i<frase.length();i++){
				if(contador==0){
					if(frase.charAt(i)!='1'&&frase.charAt(i)!='0'){
						System.out.print("NAO eh uma sequencia de 8 bits");
						contador++;
					}
				}
			}
		}
		if(contador==0){
			System.out.print("EH uma sequencia de 8 bits");
		}
	}
}

