package duoc.basededatos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.basededatos.main.base.BaseDeDatos;
import duoc.basededatos.main.dato.Dato;

public class BasededatosListar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void cuandoNoAgregaEntoncesRetornaListaSize0() {
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 0", largo == 0);
	}
	@Test
	public void cuandoAgrega1EntoncesRetornaListaSize1() {
		this.base.agregar(new Dato("Dato 2","Informacion Dato 2"));
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 1", largo == 1);
	}
	@Test
	public void cuandoAgrega5EntoncesRetornaListaSize5() {
		this.base.agregar(new Dato("Dato 1","Informacion Dato 1"));
		this.base.agregar(new Dato("Dato 2","Informacion Dato 2"));
		this.base.agregar(new Dato("Dato 3","Informacion Dato 3"));
		this.base.agregar(new Dato("Dato 4","Informacion Dato 4"));
		this.base.agregar(new Dato("Dato 5","Informacion Dato 5"));
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 5", largo == 5);
	}

}
