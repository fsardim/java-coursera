import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Teste {

	Pizza p1, p2, p3;
	CarrinhoDeCompras c;
	
	@Before
	public void Before(){
		
		Pizza.LimparRegistroDeIngredientes();
		
		p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Palmito");
		p1.adicionaIngrediente("Cebola");
		
		p2 = new Pizza();
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Bacon");
		p2.adicionaIngrediente("Azeitona");
		
		p3 = new Pizza();
		
		c = new CarrinhoDeCompras();
	}
	
	@Test
	public void testPreco() {
		assertEquals(20, p1.getPreco());
	}

	@Test
	public void testQuantidadeIngredientes() {
		assertEquals(3, p1.getQtdIngredientes());
	}
	
	@Test
	public void testPrecoTotalPizzas(){		
		c.AdicionarCarrinho(p1);
		c.AdicionarCarrinho(p2);
		
		assertEquals(p1.getPreco() + p2.getPreco(), c.getTotalDaCompra());
	}
	
	@Test
	public void testPizzaSemIngrediente(){		
		c.AdicionarCarrinho(p3);
		
		assertEquals(0, c.getTotalDePizzas());
		assertEquals(0, c.getTotalDaCompra());
	}
}
