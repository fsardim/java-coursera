import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	ProdutoComTamanho p1, p2, p3, p4, p5;
	CarrinhoDeCompras c;
	
	@Before
	public void Before(){
		p1 = new ProdutoComTamanho("Produto 1", "P001", 10, "P");
		p2 = new ProdutoComTamanho("Produto 2", "P001", 15, "P");
		p3 = new ProdutoComTamanho("Produto 3", "P001", 20, "G");
		p4 = new ProdutoComTamanho("Produto 4", "P002", 20, "P");
		p5 = new ProdutoComTamanho("Produto 4", "P003", 20, "M");	
		c = new CarrinhoDeCompras();
	}
	
	@Test
	public void testeIgualdade() {
		assertTrue(p1.equals(p2));
	}
	
	@Test
	public void testeMesmoCodigoTamanhoDiferente(){
		assertFalse(p1.equals(p3));
	}
	
	@Test
	public void testeCodigoDiferenteTamanhoIgual(){
		assertFalse(p1.equals(p4));
	}
	
	@Test
	public void testeCodigoDiferenteTamanhoDiferente(){
		assertFalse(p1.equals(p5));
	}
	
	@Test
	public void testeObjetosClassesDiferentes(){
		assertFalse(p1.equals(c));
	}
}
