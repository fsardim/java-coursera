import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Teste {
	
	Pessoa p1, p2, p3, p4;
	
	@Before
	public void before(){
		p1 = new Pessoa(18,9,1989);
		p2 = new Pessoa(22,8,1964);
		p3 = new Pessoa(25,2,2000);
		p4 = new Pessoa(20,1,2000);
	}

	@Test
	public void testeIdade() {
		assertEquals(27,p1.getIdade());
		assertEquals(52,p2.getIdade());
		assertEquals(17,p3.getIdade());
		assertEquals(17,p4.getIdade());
	}
	
	@Test
	public void testeSigno(){
		assertEquals("Virgem",p1.getSigno());
		assertEquals("Leão",p2.getSigno());
		assertEquals("Peixes",p3.getSigno());
		assertEquals("Capricórnio", p4.getSigno());
	}
}
