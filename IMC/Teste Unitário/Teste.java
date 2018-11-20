import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {
	
	private static double tolerancia = 0.01;

	@Test
	public void testBPMG() {
		Paciente p = new Paciente(40, 1.60);
		assertEquals("Baixo peso muito grave", p.diagnostico());
		assertEquals(15.62, p.calcularIMC(), tolerancia);
	}
	
	@Test
	public void testBP() {
		Paciente p = new Paciente(45, 1.60);
		assertEquals("Baixo peso", p.diagnostico());
		assertEquals(17.57, p.calcularIMC(), tolerancia);
	}
	
	@Test
	public void testPN() {
		Paciente p = new Paciente(55, 1.65);
		assertEquals("Peso normal", p.diagnostico());
		assertEquals(20.20, p.calcularIMC(), tolerancia);
	}
	
	@Test
	public void testSP() {
		Paciente p = new Paciente(80, 1.70);
		assertEquals("Sobrepeso", p.diagnostico());
		assertEquals(27.68, p.calcularIMC(), tolerancia);
	}

	@Test
	public void testObI() {
		Paciente p = new Paciente(80, 1.60);
		assertEquals("Obesidade grau I", p.diagnostico());
		assertEquals(31.24, p.calcularIMC(), tolerancia);
	}
	
	@Test
	public void testObII() {
		Paciente p = new Paciente(90, 1.60);
		assertEquals("Obesidade grau II", p.diagnostico());
		assertEquals(35.15, p.calcularIMC(), tolerancia);
	}
	
	@Test
	public void testObIII() {
		Paciente p = new Paciente(105, 1.60);
		assertEquals("Obesidade grau III (obesidade mórbida)", p.diagnostico());
		assertEquals(41.01, p.calcularIMC(), tolerancia);
	}
	
}
