package es.genesis.electrodomesticos;

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
	 
	 
	double sumaElectrodomestico = 0;
	double sumaLavadora = 0;
	double sumaTelevisiones = 0;
	
	
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
	}
		
	
	
	
	
	 //Mostrar resultados
	System.out.println("Total Electrodomestico: " + sumaElectrodomestico);
	System.out.println("Total Lavadoras: "+ sumaLavadora);
	System.out.println("Total Televisiones: "+ sumaTelevisiones);
	System.out.println("Total de todos los productos: "+(sumaElectrodomestico+sumaLavadora+sumaTelevisiones));
	
	
	
	
	

	}

}
