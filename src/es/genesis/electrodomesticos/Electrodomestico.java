package es.genesis.electrodomesticos;

public class Electrodomestico {
	
	//atributos que hacemos constantes para las clases del paquete y las  subclases
	protected double PRECIO_BASE_DEF = 100.0;
	protected Color COLOR_DEF = Color.BLANCO;
	protected char CONSUMO_ENERGETICO_DEF = 'F';
	protected final static double PESO_DEF = 5.0;
	
	//atributos accesibles desde el paquete y las subclases
	protected double precioBase;
	protected Color color;
	protected char consumoEnergetico;
	protected double peso;
	
	private enum Color{
		BLANCO,
		NEGRO,
		ROJO,
		AZUL,
		GRIS;
	}



	//constructores
	
	
	// constructor con valores por defecto
	/*
	 * en vez de asignar  los valores a los archivos uno a uno podemos lllamra 
	 * al constructo de la propa clase
	 * this(PRECIO_BASE_DEF;PESO:DEF;COSNUMO_ENERGETICO_DEF;COLOR_DEF);
	 */
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEF;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.peso = PESO_DEF;
		
	}
	
	/*
	 * constructor con el precio y el peso
	 * y el resto por defecto
	 */
	public Electrodomestico(double precio ,double peso) {
		this.precioBase = precio;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.peso = peso;
	}
	
	//constructor con todos los atributos
	public Electrodomestico(double pRECIO_BASE_DEF, Color cOLOR_DEF, char cONSUMO_ENERGETICO_DEF) {
		super();
		PRECIO_BASE_DEF = pRECIO_BASE_DEF;
		COLOR_DEF = cOLOR_DEF;
		CONSUMO_ENERGETICO_DEF = cONSUMO_ENERGETICO_DEF;
	}



	//getters de todos los atributos
	public double getPRECIO_BASE_DEF() {
		return PRECIO_BASE_DEF;
	}



	public Color getCOLOR_DEF() {
		return COLOR_DEF;
	}



	public char getCONSUMO_ENERGETICO_DEF() {
		return CONSUMO_ENERGETICO_DEF;
	}


	public static double getPesoDef() {
		return PESO_DEF;
	}
	
	  //metodos
	/*
	 * comprobarConsumoEnergetico(char letra): comprueba que la letra es
	correcta, es decir, si está dentro del rango A-F; si no es correcta usará la
	letra por defecto. Se invocara al crear el objeto y no será visible.
	 */
	
	
	
	// lo cambie de private de public por que la clase Lavadora no lo ve
	public char comprobarConsumoEnergetico(char letra) {
		char letraComprobacion = Character.toUpperCase(letra);
		if( letraComprobacion >= 'A' && letraComprobacion <= 'F') {
			return letraComprobacion;
		}
		 return CONSUMO_ENERGETICO_DEF;
	}
	
	
	/*comprobarColor(String color): comprueba que el color es correcto, es
	decir, es uno de los establecidos en el atributo color, si no lo es usa el
	color por defecto. Se invocara al crear el objeto y el método no será
	visible.

	 * 
	 */
	
	
	
	// lo cambie de private de public por que la clase Lavadora no lo ve
	public Color  comprobarColor(String color) {
		if(color == null) {
			return COLOR_DEF;
		}
		try{
			return Color.valueOf(color.toUpperCase());
		}catch(Exception e){
			
			//no creará un string que este presente en el num del color
			return COLOR_DEF;
			
		}
	}
	
	
	/*
	 * precioFinal(): según el consumo energético, aumentará su precio, y
	según su tamaño, también. Se muestran abajo las tablas con los precios
	establecidos para consumo energético y tamaño.
	 */
	
	public double precioFinal() {
		double precioF = 0;
		
		
		//incrementa por consumo energetico
		
		switch(this.consumoEnergetico) {
		case 'A': precioF += 100; break;
		case 'B': precioF += 80; break;
		case 'C': precioF += 60; break;
		case 'D': precioF += 50; break;
		case 'E': precioF += 30; break;
		case 'F': precioF += 10; break;
		}
		
		// Incrementa por tamaño 
		
		if(this.peso >= 0 && this.peso <=19) {
		  precioF += 10;
		}else if(this.peso >= 20 && this.peso <=49) {
			precioF += 50;
		}else if(this.peso >=50 && this.peso <=79) {
			precioF += 80;
		}else if(this.peso >= 80) {
			precioF += 80;
		}
		
		return this.precioBase + precioF;
	}
	
	
	
}
