package duoc.basededatos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basededatos.main.base.BaseDeDatos;
import duoc.basededatos.main.dato.Dato;

public class BasededatosEliminar {

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
	public void cuandoElimina1EntoncesRetorna4() {
		this.base.eliminar("Dato 3");
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 4",largo == 4);
	}
	@Test
	public void cuandoElimina1EntoncesRetornaTrue() {
		boolean respuesta = this.base.eliminar("Dato 3");
		assertTrue(respuesta);
	}
	@Test
	public void cuandoNoEliminaEntoncesFalse() {
		boolean respuesta = this.base.eliminar("Dato 8");
		assertFalse(respuesta);
	}

}
