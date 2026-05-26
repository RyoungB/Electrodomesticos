package es.genesis.electrodomesticos;

public class Television extends Electrodomestico {
	//atributos que hacemos constantes para las clases del paquete y las  subclases
	protected int RESOLUCION_DEF  = 20;
	protected boolean SINTONIZADORTDT_DEF  = false;


	
	//atributos accesibles desde el paquete y las subclases
	protected int resolucion;
	protected boolean sintonizadorTDT;
	
	
	
	// Constructores
	//valores por defecto
	
	public Television() {
		super();
	}
	
	
	/*
	 * constructor con el precio y el peso
	 */
	
	public Television(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		
		
	}
	
	
	/*
	 * Un constructor con la carga y el resto de atributos heredados. Recuerda 
		que debes llamar al constructor de la clase padre
	 */
	

}
