/*
 * Ex24.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 24) Escreva um programa em Java que imprima a tabuada do 1 ao 10, para os números de 0 a 10.
 * 
 * 
 */


public class Ex24 {
	
	public static void main (String[] args) {
		int i;
		for(i=1;i<=10;i++){
			System.out.println("\n\n");
			for(int c=0;c<=10;c++){
				System.out.println(i+"x"+c+" = "+(i*c));
			}
		}
	}
}

