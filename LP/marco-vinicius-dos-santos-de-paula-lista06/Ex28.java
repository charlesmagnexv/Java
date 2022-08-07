/*
 * Ex28.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 28) Escreva um programa em Java que imprima sequência 4:
	1, 2 3 4 5 6 7 8 9 10
	2, 3 4 5 6 7 8 9 10
	3, 4 5 6 7 8 9 10
	4, 5 6 7 8 9 10
	5, 6 7 8 9 10
	6, 7 8 9 10
	7, 8 9 10
	8, 9 10
	9, 10
	10,
 * 
 * 
 */


public class Ex28 {
	
	public static void main (String[] args) {
		int controle = 1;
		int c=1;
		for(int i=1;i<=10;i++){
			System.out.print("\n");
			System.out.print(i+", ");
			c=1;
			for(c=controle+c;c<=10;c++){
				System.out.print(c+" ");
			}
			controle++;
		}
	}
}

