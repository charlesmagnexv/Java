/*
 * Ex27.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 27) Escreva um programa em Java que imprima sequência 3:
	1, 1 2 3 4 5 6 7 8 9 10
	2, 1 2 3 4 5 6 7 8 9
	3, 1 2 3 4 5 6 7 8
	4, 1 2 3 4 5 6 7
	5, 1 2 3 4 5 6
	6, 1 2 3 4 5
	7, 1 2 3 4
	8, 1 2 3
	9, 1 2
	10, 1
 * 
 * 
 */


public class Ex27 {
	
	public static void main (String[] args) {
		int controle=10;
		for(int i=1;i<=10;i++){
			System.out.print("\n");
			System.out.print(i+", ");
			for(int c=1;c<=controle;c++){
				System.out.print(c+" ");
			}
			controle--;
		}
	}
}

