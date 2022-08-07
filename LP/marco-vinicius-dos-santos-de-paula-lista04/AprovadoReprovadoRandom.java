/*
 * AprovadoReprovadoRandom.java
 * Marco Vinicius dos Santos de Paula
 */


public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		int nota = (int)(Math.random()*10);//o (int) serve para converter o random, que é double, para guardá-lo num inteiro
		if(nota < 6){
			System.out.println("REPROVADO");
		}else{
			System.out.println("APROVADO");
		}
	}
}

