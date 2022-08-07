/*
 * Numero.java
 * 
 * 4) Elabore um programa em java que contenha um método que aceite um valor 
 * inteiro e retorne o número com os dígitos invertidos. O valor deve ser solicitado ao usuário.
 * 
 */


public class Numero {
	private int numero;
	private String numeroParaString, numeroParaStringInvertido;
	public Numero () {
		numero = 123;
		numeroParaString = "";
		numeroParaStringInvertido = "";
	}
	public void setNumero( int numero ){
		this.numero = numero;
	}
	public int getNumero(){
		return numero;
	}
	
	public int inverter(){
		numeroParaString = Integer.toString(numero);
		for( int i = numeroParaString.length() - 1 ; i >= 0 ; i -- ){
			numeroParaStringInvertido += numeroParaString.charAt(i);
		}
		return Integer.parseInt( numeroParaStringInvertido );
	}
}

