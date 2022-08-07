/*
 * Ex53.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 53) Imprima os números da sequência de Fibonacci que estão presentes na faixa de 1 até 250.
 * 
 * 
 */

public class Ex53 {
	
	public static void main (String[] args) {
		int fibonacci=0,termoAnterior=0,fAtual=1;
		System.out.print("0 ");
		for(int i=1;i<=13;i++){
			fibonacci=termoAnterior+fAtual;
			fAtual=termoAnterior;
			termoAnterior=fibonacci;
			System.out.print(fibonacci+" ");
			fibonacci=0;
		}
	}
}

