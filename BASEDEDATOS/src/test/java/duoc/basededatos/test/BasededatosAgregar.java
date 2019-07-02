package duoc.basededatos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basededatos.main.base.BaseDeDatos;
import duoc.basededatos.main.dato.Dato;

public class BasededatosAgregar {

	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
		this.base.agregar(new Dato("Dato 1","Informacion dato 1"));
	}

	@Test
	public void cuandoAgrega1EntoncesRetornaTrue() {
		boolean retorno = this.base.agregar(new Dato("Dato 2","Informacion dato 2"));
		assertTrue(retorno);
	}
	
	@Test
	public void cuandoAgrega1ExistenteEntoncesRetornaFalse() {
		boolean retorno = this.base.agregar(new Dato("Dato 1","Informacion del dato 1"));
		assertFalse(retorno);
	}

}
