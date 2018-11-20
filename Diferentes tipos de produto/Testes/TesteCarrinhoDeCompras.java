import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

ProdutoComTamanho p1, p2, p3, p4, p5;
CarrinhoDeCompras carrinho;

	@Before
	public void Before(){
		p1 = new ProdutoComTamanho("Produto 1", "P001", 10, "P");
		p2 = new ProdutoComTamanho("Produto 2", "P001", 15, "P");
		p3 = new ProdutoComTamanho("Produto 3", "P001", 20, "G");
		p4 = new ProdutoComTamanho("Produto 4", "P002", 20, "P");
		p5 = new ProdutoComTamanho("Produto 4", "P003", 20, "M");		
		carrinho  = new CarrinhoDeCompras();
	}
	
	@Test
	public void CarrinhoVazio(){
		assertEquals(0, carrinho.getQtdProdutosNoCarrinho());
	}
	
	@Test
	public void AdicionarUmProduto(){
		carrinho.adicionaProduto(p1, 20);
		assertEquals(1, carrinho.getQtdProdutosNoCarrinho());
		assertEquals(20,carrinho.getQtdItensDoProduto(p1));
	}

	@Test
	public void AdicionarDoisProdutos(){
		carrinho.adicionaProduto(p1, 20);
		carrinho.adicionaProduto(p3, 20);
		assertEquals(2, carrinho.getQtdProdutosNoCarrinho());
		assertEquals(20,carrinho.getQtdItensDoProduto(p1));
		assertEquals(20,carrinho.getQtdItensDoProduto(p3));
	}
	
	@Test
	public void AdicionarDoisProdutosIguais(){
		carrinho.adicionaProduto(p1, 20);
		carrinho.adicionaProduto(p1, 10);
		assertEquals(1, carrinho.getQtdProdutosNoCarrinho());
		assertEquals(30,carrinho.getQtdItensDoProduto(p1));
	}

	@Test
	public void RemoverQtdTotalDeProduto(){
		carrinho.adicionaProduto(p1, 20);
		carrinho.adicionaProduto(p3, 20);
		assertEquals(2, carrinho.getQtdProdutosNoCarrinho());
		
		carrinho.removeProduto(p1, 20);
		assertEquals(1, carrinho.getQtdProdutosNoCarrinho());
		assertEquals(20,carrinho.getQtdItensDoProduto(p3));
	}
	
	@Test
	public void RemoverQtdParcialDeProduto(){
		carrinho.adicionaProduto(p1, 20);
		carrinho.adicionaProduto(p3, 20);
		assertEquals(2, carrinho.getQtdProdutosNoCarrinho());
		
		carrinho.removeProduto(p1, 10);
		assertEquals(2, carrinho.getQtdProdutosNoCarrinho());
		assertEquals(10,carrinho.getQtdItensDoProduto(p1));
		assertEquals(20,carrinho.getQtdItensDoProduto(p3));
	}

	@Test
	public void ValorCompraUmItemUmaUnidade(){
		carrinho.adicionaProduto(p1, 1);
		assertEquals(10, carrinho.getValorTotalDaCompra());
	}
	
	@Test
	public void ValorCompraUmItemMaisUnidades(){
		carrinho.adicionaProduto(p1, 10);
		assertEquals(100, carrinho.getValorTotalDaCompra());
	}
	
	@Test
	public void ValorCompraDoisItens(){
		carrinho.adicionaProduto(p1, 10);
		carrinho.adicionaProduto(p3, 10);
		assertEquals(300, carrinho.getValorTotalDaCompra());
	}
	
	@Test
	public void AdicionarItensIguaisCarrinho(){
		carrinho.adicionaProduto(p1, 5);
		carrinho.adicionaProduto(p2, 15);
		
		assertEquals(1, carrinho.getQtdProdutosNoCarrinho());
		assertEquals(20,carrinho.getQtdItensDoProduto(p1));
	}
}
