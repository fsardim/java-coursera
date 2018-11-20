import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCompra {

	CompraParcelada p0,p1,p2,p5,p10;
	Compra p;
	double tolerancia = 0.005;
	
	@Before
	public void before(){
		p = new Compra(100);
		p0 = new CompraParcelada(100, 1, 0);
		p1 = new CompraParcelada(100, 1, 0.10);
		p2 = new CompraParcelada(100, 2, 0.10);
		p5 = new CompraParcelada(100, 5, 0.10);
		p10 = new CompraParcelada(100, 10, 0.10);
	}
	
	@Test
	public void testeCompra0() {
		assertEquals(100,p0.total(),tolerancia);
	}

	@Test
	public void testeCompra1() {
		assertEquals(110,p1.total(),tolerancia);
	}
	
	@Test
	public void testeCompra2() {
		assertEquals(121,p2.total(),tolerancia);
	}
	
	@Test
	public void testeCompra5() {
		assertEquals(161.051,p5.total(),tolerancia);
	}

	@Test
	public void testeCompra10() {
		assertEquals(259.37,p10.total(),tolerancia);
	}
	
	@Test
	public void testeCompra(){
		assertEquals(100,p.total(),tolerancia);
	}
}
