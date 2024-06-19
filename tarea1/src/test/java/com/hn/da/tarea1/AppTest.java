package com.hn.da.tarea1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import org.junit.function.ThrowingRunnable;


/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(28.27, App.calcularAreaCirculo(3), 0.01);
        assertEquals(50.27, App.calcularAreaCirculo(4), 0.01);
        assertEquals(78.54, App.calcularAreaCirculo(5), 0.01);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(9.0, App.calcularAreaCuadrado(3), 0.01);
        assertEquals(16.0, App.calcularAreaCuadrado(4), 0.01);
        assertNotEquals(26.0, App.calcularAreaCuadrado(5), 0.01);
    }
    @Test
    public void testCalcularAreaCuadrado2() {
        assertNotEquals(0, App.calcularAreaCuadrado(3), 0.01);
        assertNotEquals(15.0, App.calcularAreaCuadrado(4), 0.01);
        assertNotEquals(24.0, App.calcularAreaCuadrado(5), 0.01);
    }

    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(6.0, App.calcularAreaRectangulo(2, 3), 0.01);
        assertEquals(20.0, App.calcularAreaRectangulo(4, 5), 0.01);
        assertEquals(30.0, App.calcularAreaRectangulo(5, 6), 0.01);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(3.0, App.calcularAreaTriangulo(2, 3), 0.01);
        assertEquals(10.0, App.calcularAreaTriangulo(4, 5), 0.01);
        assertEquals(15.0, App.calcularAreaTriangulo(5, 6), 0.01);
    }
    
    @Test
    public void testCalcularAreaCirculoconnegativos() {
        assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
			    App.calcularAreaCirculo(-1);
			}
		});
    }

    @Test
    public void testCalcularAreaCuadradocinnegativos() {
        assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				App.calcularAreaCuadrado(-1);
			}
		});
    }

    @Test
    public void testCalcularAreaRectanguloconnegativos() {
        assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				App.calcularAreaRectangulo(-1, 2);
			}
		});
    }

    @Test
    public void testCalcularAreaTrianguloconnegativos() {
        assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				App.calcularAreaTriangulo(-1, 2);
			}
		});
    }
}