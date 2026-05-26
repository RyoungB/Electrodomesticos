package es.genesis.electrodomesticos;

public class Television extends Electrodomestico {
	//atributos que hacemos constantes para las clases del paquete y las  subclases
	protected int RESOLUCION_DEF;
	protected boolean SINTONIZADORTDT_DEF;


	
	//atributos accesibles desde el paquete y las subclases
	protected int resolucion = 20 ;
	protected boolean sintonizadorTDT = false;
	
	
	
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
	 * Un constructor con la resolucion, sintonizador TDT y el resto de atributos heredados. Recuerda 
		que debes llamar al constructor de la clase padre
	 */
	public Television(int resolucion, boolean sintonizadorTDT, double precioBase,double peso, String color,char consumoEnergetico) {
		super();
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		
	}


	//metodo get de resolucion y sintonizadorTDT
	public int getResolucion() {
		return resolucion;
	}


	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	
	
	//metodo PrecioFinal
	public static double PrecioFinal(Television Electrodomestico) {
		if (Electrodomestico.resolucion > 40) {
			Electrodomestico.precioBase *=1.30;
		}
		
		if(Electrodomestico.sintonizadorTDT) {
			Electrodomestico.precioBase += 50.00;
		}
		
		
		return Electrodomestico.precioBase;
	}
	
	

	
	
	
}
