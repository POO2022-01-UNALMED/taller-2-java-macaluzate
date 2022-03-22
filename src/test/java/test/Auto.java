package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	// Methods
	
	int cantidadAsientos() {
		
		int contadorasiento=0;
		
		for (int i=0; i< asientos.length;i++) {
			if (asientos[i] != null) {
				contadorasiento++;
				
				
			}
		}
		
		return contadorasiento;
	}
	
	
	String verificarIntegridad()
	{
		
		
		if (registro == motor.registro) 
		{
			for(Asiento  asiento: asientos) 
			{
				
				if (asiento != null)
				{
					if (registro != asiento.registro)
					{
						return "Las piezas no son originales";
						
					}
				}
			}
			return "Auto original";
			
						
		}
}
}