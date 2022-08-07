/*
 * UsarLampada.java
 * 
 * 
 */


public class UsarLampada {
	
	public static void main (String[] args) {
		Lampada lampada = new Lampada();
		System.out.println( "Lampada!\n " + lampada );
		lampada.acenderLampada();
		System.out.println( "\n\nLampada!\n " + lampada );
	}
}

