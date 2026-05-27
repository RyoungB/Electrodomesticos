package es.genesis.electrodomesticos;
import static es.genesis.utilidades.Colores.*;

import es.genesis.utilidades.Colores;
public class MainApplication {

	public static void main(String[] args) {
	//Array de 10 Electrodomesticos
		Electrodomestico [] electrodomestico = new Electrodomestico[10];
		
	 electrodomestico[0] = new Electrodomestico (111,222);
	 electrodomestico[1] = new Electrodomestico (120,10);
	 electrodomestico[2] = new Lavadora (603,10);
	 electrodomestico[3] = new Lavadora (990,10);
	 electrodomestico[4] = new Television (888,40);
	 electrodomestico[5] = new Lavadora (89,10);
	 electrodomestico[6] = new Television (260,140);
	 electrodomestico[7] = new Television (55,20);
	 electrodomestico[8] = new Electrodomestico (100,10);
	 electrodomestico[9] = new Lavadora (33,36);
	 
	 
	double sumaElectrodomestico = 0.0;
	double sumaLavadora = 0.0;
	double sumaTelevisiones = 0.0;
	
	
	 //Recorrer el array y ejcutar preciofinal()
	for (Electrodomestico electrodom : electrodomestico) {
		double precio = electrodom.precioFinal();
		
		
		if(electrodom instanceof Lavadora) {
			sumaLavadora += precio;
		}else if( electrodom instanceof Television) {
			sumaTelevisiones += precio;
		}else {
			sumaElectrodomestico += precio;
		}
		
		// usando libreria con las utilidades
		/*
		 * Como lo coloque en static no debo hacer la llamada con el nombre de la clase y la variable
		 * sino colocar la variable
		 */
		//System.out.println(WHITE_BACKGROUND_BRIGHT+ANSI_BLUE+ANSI_NEGRITA+ "   FACTURA DE ELECTRODOMÉTICOS  ");
		
		//configuracion con los colores y background dependiendo del tipo de electrodomestico
		String nombreTipo = "Electrodomestico";
		String colorTexto = ANSI_GREEN ;
		String background = WHITE_BACKGROUND_BRIGHT;
		//String formato = "%s%-27s%7.2f%n";
		
		if (electrodom instanceof Lavadora) {
			nombreTipo = "Lavadora    ";
			colorTexto =  ANSI_BLUE;
			background = WHITE_BACKGROUND_BRIGHT;
			//formato = "%s";
		}else if(electrodom instanceof Television) {
			nombreTipo = "Television    ";
			colorTexto =  ANSI_PURPLE;
			background = WHITE_BACKGROUND_BRIGHT;
			//formato = "%s";
		}
		
		
	/*System.out.printf(formato+background + colorTexto + ANSI_NEGRITA+  nombreTipo
				+"  | Peso:  "+ electrodom.getPeso() + " kg"
				+"  | Precio Final: " + electrodom.getPrecioBase() + " Euros " + ANSI_RESET);*/
		
		System.out.printf("%s%s%s%-16s   |   Peso: %6.1f kg   |   Precio Final: %6.2f Euros %s\n",
		                  background,colorTexto,ANSI_NEGRITA,nombreTipo,electrodom.getPeso(),precio, ANSI_RESET);
	}
		
	
	
	 //Mostrar resultados
	System.out.println("   Total Electrodomestico:   " + sumaElectrodomestico);
	System.out.println("   Total Lavadoras:   "+ sumaLavadora);
	System.out.println("   Total Televisiones:   "+ sumaTelevisiones);
	System.out.println("   Total de todos los productos:   "+(sumaElectrodomestico+sumaLavadora+sumaTelevisiones));
	
	
	
	
	

	}

}
