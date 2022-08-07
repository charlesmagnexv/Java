/*
 * Lista05Ex01.java
 * 
 * Marco VInicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 1) Criar uma classe para representar uma lâmpada vendida em um supermercado.
	Além de marca, modelo
	e tipo, esta deve conter um atributo que indique um dos dois possíveis estados da lâmpada (acesa ou
	apagada)
 * 
 * 
 */


public class Lampada {
	private String marca, modelo, tipo;
	private boolean apagadaOuAcessa;
	
	public Lampada(){
		marca = "MarcasGuara";
		modelo = "BulboLed";
		tipo = "LED";
		this.apagadaOuAcessa = false;
	}
	public void setMarca ( String marcaSet ) {
		marca = marcaSet;
	}
	public void setModelo ( String modeloSet ) {
		modelo = modeloSet;
	}
	public void setTipo ( String tipoSet ) {
		tipo = tipoSet;
	}
	public void setApagadaOuAcessa ( boolean apagadaAcessaSet ) {
		apagadaOuAcessa = apagadaAcessaSet;
	}
	public String getMarca () {
		return marca;
	}
	public String getModelo () {
		return modelo;
	}
	public String getTipo () {
		return tipo;
	}
	public boolean getApagadaOuAcessa () {
		return apagadaOuAcessa;
	}
	public boolean acenderLampada () {
		return apagadaOuAcessa = true;
	}
	public boolean apagarLampada () {
		return apagadaOuAcessa = false;
	}
	@Override
	public String toString () {
		return "Marca: " + getMarca () + 
			   "\nModelo: " + getModelo () + 
			   "\nTipo: " + getTipo () + 
			   "\nEstado: " + ( getApagadaOuAcessa() ? "Acessa" : "Apagada" );
	}
}

