package es.genesis.electrodomesticos;



public class Lavadora extends Electrodomestico {
	//atributos que hacemos constantes para las clases del paquete y las  subclases
		//protected int CARGA_DEF = 5;
	
		
		//atributos accesibles desde el paquete y las subclases
		protected int carga = 5;
		
		
		//#########################
		/*
		 * constructores
		 * VALORES POR DEFECTO
		 */
		public Lavadora() {
			super();
		}
		
		
		
		/*
		 * constructor con el precio y el peso
		 */
		
		public Lavadora(double precioBase, double peso) {
			super();
			this.precioBase = precioBase;
			this.peso = peso;
			
			
		}
		
		/*
		 * Un constructor con la carga y el resto de atributos heredados. Recuerda 
			que debes llamar al constructor de la clase padre
		 */
		public Lavadora(int carga, double precioBase, double peso,String color, char consumoEnergetico) {
			this.precioBase = precioBase;
			this.color = comprobarColor(color);
			this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
			this.peso = peso;
			this.carga = carga;
			
		}



		//METODOS
		
		public int getCarga() {
			return carga;
		}
		
		
		
		//PRECIOFINAL
		public static double PrecioFinal(Lavadora Electrodomestico) {
			if(Electrodomestico.carga> 30) {
				Electrodomestico.precioBase += 50.00;
				
			}
			return Electrodomestico.precioBase;
		}
		
		
		

}
