/*
 * Ex30.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 30) Escreva um programa em Java que imprima sequência 6:
	1, 1
	2, 2 4
	3, 1 3 5
	4, 2 4 6 8
	5, 1 3 5 7 9
	6, 2 4 6 8 10 12
	7, 1 3 5 7 9 11 13
	8, 2 4 6 8 10 12 14 16
	9, 1 3 5 7 9 11 13 15 17
	10, 2 4 6 8 10 12 14 16 18 20
	 * 
 * 
 */


public class Ex30 {
	
	public static void main (String[] args) {
		for(int i=1;i<=10;i++){
			System.out.print("\n");
			System.out.print(i+", ");
			if(i%2==0){
				for(int c=2;c<=i*2;c+=2){
					System.out.print(c+" ");
				}
			}else{
				for(int c=1;c<=i*2;c+=2){
					System.out.print(c+" ");
				}
			}
		}
	}
}

