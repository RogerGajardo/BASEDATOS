package duoc.basededatos.main;

import duoc.basededatos.main.base.BaseDeDatos;
import duoc.basededatos.main.dato.Dato;

public class Main {

	public static void main(String[] args) {
		BaseDeDatos base  = new BaseDeDatos();
		base.agregar(new Dato("Dato 1","Informacion Dato 1"));
		base.agregar(new Dato("Dato 2","Informacion Dato 2"));
		base.agregar(new Dato("Dato 3","Informacion Dato 3"));
		base.agregar(new Dato("Dato 4","Informacion Dato 4"));
		base.agregar(new Dato("Dato 5","Informacion Dato 5"));
		
		System.out.println("Lista Datos: "+ base.listar());
		
		base.eliminar("Dato 4");
		base.modificar(new Dato("DATO n5", "Informacion Modificada"));
		
		System.out.println("Lista Datos: "+ base.listar());
		
		
	}

}
