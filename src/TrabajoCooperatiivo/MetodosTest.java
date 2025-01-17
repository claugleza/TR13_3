package src.TrabajoCooperatiivo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MetodosTest {
	@Test
	void testRealizarSuma() {
		fail("Not yet implemented");
	}

	@Test
	void testRealizarResta() {
		fail("Not yet implemented");
	}

	@Test
	void testRealizarMultiplicacion() {
		fail("Not yet implemented");
	}

	@Test
	void testRealizarDivision() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularAreaTriangulo() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularFactorial() {
		int valor_esperado=120;
		int resultado = Metodos.calcularFactorial(5);
		assertEquals(valor_esperado, resultado, "El factorial de 5 debería ser 120, ya que 120 = 5x4x3x2x1");
	}

	@Test
	void testCalcularPotencia() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularRaizCuadrada() {
		double valorEsperado = 9;
		double resultado = Metodos.calcularRaizCuadrada(81);
		
		assertEquals(valorEsperado,resultado,"La raiz cuadrada de 81 deberia ser 9");
		
	}

	@Test
	void testCalcularValorAbsoluto() {
		fail("Not yet implemented");
	}

	@Test
	void testVerificarNumeroPrimo() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularMCM() {
		//Caso de prueba 1: num1 > num2		
        int resultado1 = Metodos.calcularMCM(12, 8);
        assertEquals(24, resultado1, "El MCM de 12 y 6 debería ser 24");

        // Caso de prueba 2: num2 > num1
        int resultado2 = Metodos.calcularMCM(10, 15);
        assertEquals(30, resultado2, "El MCM de 15 y 10 debería ser 30");

        // Caso de prueba 3: num1 == num2
        int resultado3 = Metodos.calcularMCM(9, 9);
        assertEquals(9, resultado3, "El MCM de 9 y 9 debería ser 9");
	}

	@Test
	void testCalcularMCD() {
		//Caso de prueba 1: num1 > num2
		
        int resultado1 = Metodos.calcularMCD(12, 8, true);
        assertEquals(4, resultado1, "El MCD de 12 y 8 debería ser 4");

        // Caso de prueba 2: num2 > num1
        int resultado2 = Metodos.calcularMCD(15, 10, true);
        assertEquals(5, resultado2, "El MCD de 15 y 10 debería ser 5");

        // Caso de prueba 3: num1 == num2
        int resultado3 = Metodos.calcularMCD(9, 9, true);
        assertEquals(9, resultado3, "El MCD de 9 y 9 debería ser 9");
	}

	@Test
	void testConvertirCelsiusAFahrenheit() {
		fail("Not yet implemented");
	}

	@Test
	void testConvertirFahrenheitACelsius() {
		//caso prueba1
		double resultado = Metodos.convertirFahrenheitACelsius(32);
		assertEquals(0, resultado, "32ºFahrenheit al pasarlo a ºCelsius deberia ser 0ºc");
		//caso prueba2
		double resultado2 = Metodos.convertirFahrenheitACelsius(-4);
		assertEquals(-20, resultado2, "-4ºFahrenheit al pasarlo a ºCelsius deberian ser -20.0ºc");
		//caso prueba2
		double resultado3 = Metodos.convertirFahrenheitACelsius(-65,447);
		assertEquals(-54.13722, resultado3, "-65,447ºFahrenheit al pasarlo a ºCelsius deberian ser -54.13722ºc");
	}

	@Test
	void testSecuenciaFibonacci() {
		fail("Not yet implemented");
	}

	@Test
	void testConversorEurosDolares() {
		fail("Not yet implemented");
	}

	@Test
	void testConversorEurosLibras() {
		fail("Not yet implemented");
	}

}
