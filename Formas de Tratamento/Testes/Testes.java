import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Testes {

	Autoridade a1, a2, a3, a4;

	@Before
	public void before(){
		a1 = new Autoridade("Ayrton", "Senna", new Respeitoso('M'));
		a2 = new Autoridade("Evita", "Perón", new ComTitulo("Adorável"));
		a3 = new Autoridade("Felipe","Sardim", new Informal());
	}
	
	@Test
	public void testeInformal() {
		assertEquals("Felipe", a3.getTratamento());
	}
	
	@Test
	public void testeComTitulo() {
		assertEquals("Adorável Evita Perón", a2.getTratamento());
	}

	@Test
	public void testeRespeitoso(){
		assertEquals("Sr. Senna", a1.getTratamento());
	}
	
}
