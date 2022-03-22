package test;
public class Asiento {
	
	/*Attributes*/
	
	 String color;
	 int precio;
	 int registro;
	 	
	
	/*Methods*/
	 
	 void Cambiarcolor(String color) {
		 if (color.equals("rojo" )|| color.equals("verde") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco")) {
			 
			 this.color=color;
		 
		
		 }
		 }		 
}