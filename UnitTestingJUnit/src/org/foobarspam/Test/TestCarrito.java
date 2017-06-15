package org.foobarspam.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestCarrito {

	@Test
	public void testTotal() {
		//Entradas
		Carrito carrito = new Carrito();
		
		carrito.add(new Producto("fast and furious", 1170), 2);
		carrito.add(new Producto("smartwatch", 4480),1);
		
		Assert.assertEquals((1170 * 2 + 4480), carrito.total());
		
	}

}
