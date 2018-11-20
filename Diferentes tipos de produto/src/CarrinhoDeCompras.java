import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	
	private int quantidade = 0;
	private Map<ProdutoComTamanho, Integer> carrinho = new HashMap<>();

	public void adicionaProduto(ProdutoComTamanho produto, int qtd){
		if (carrinho.containsKey(produto)){
			int qtdAtual = carrinho.get(produto);
			qtdAtual += qtd;
			carrinho.put(produto, qtdAtual);
		} else {
			carrinho.put(produto, qtd);
		}
	}
	
	public void removeProduto(ProdutoComTamanho produto, int qtd){
		int qtdAtual = carrinho.get(produto);
		qtdAtual -= qtd;
		
		if (qtdAtual > 0)
			carrinho.put(produto, qtdAtual);
		else
			carrinho.remove(produto);
	}

	public int getValorTotalDaCompra(){
		int valor = 0;
		
		for (ProdutoComTamanho produto : carrinho.keySet()){
			valor += carrinho.get(produto) * produto.getPreco();
		}	
		return valor;
	}
	
	public int getQtdProdutosNoCarrinho(){
		return carrinho.size();
	}

	public int getQtdItensDoProduto(ProdutoComTamanho produto){
		return carrinho.get(produto);
	}
}
