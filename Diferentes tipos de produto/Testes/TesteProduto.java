import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TesteProduto {

	Produto p1, p2, p3;
	CarrinhoDeCompras c;
	
	@Before
	public void Before(){
		p1 = new Produto("Produto 1", "P001", 10);
		p2 = new Produto("Produto 2", "P001", 15);
		p3 = new Produto("Produto 3", "P003", 20);
		c = new CarrinhoDeCompras();
	}
	
	@Test
	public void testeIgualdade() {
		assertTrue(p1.equals(p2));
	}
	
	@Test
	public void testeDiferente(){
		assertFalse(p1.equals(p3));
	}
	
	@Test
	public void testeObjetosClassesDiferentes(){
		assertFalse(p1.equals(c));
	}

}
