package duoc.basededatos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basededatos.main.base.BaseDeDatos;
import duoc.basededatos.main.dato.Dato;

public class BasededatosModificar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
		this.base.agregar(new Dato("Dato 1","Informacion Dato 1"));
		this.base.agregar(new Dato("Dato 2","Informacion Dato 2"));
		this.base.agregar(new Dato("Dato 3","Informacion Dato 3"));
		this.base.agregar(new Dato("Dato 4","Informacion Dato 4"));
		this.base.agregar(new Dato("Dato 5","Informacion Dato 5"));
		
	}
	
	@Test
	public void cuandoModificaEntoncesTrue() {
		boolean resultado = this.base.modificar(new Dato("Dato 3", "Informacion Mod"));
		assertTrue(resultado);
	}
	@Test
	public void cuandoNoModificaEntoncesFalse() {
		boolean resultado = this.base.modificar(new Dato("Dato no existente", "Informacion Mod"));
		assertFalse(resultado);
	}
}
