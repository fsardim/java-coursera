import java.util.Objects;

public class ProdutoComTamanho extends Produto {

	private String tamanho;
	
	public ProdutoComTamanho(String nome, String codigo, int preco, String tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}
	
	@Override
	public boolean equals(Object o){
		
		if (o == this)
			return true;
		if (!(o instanceof Produto))
			return false;
		
		ProdutoComTamanho OutroProduto = (ProdutoComTamanho) o;
		return (this.codigo == OutroProduto.codigo && this.tamanho == OutroProduto.tamanho);
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(codigo);
	}
	
	public String getTamanho(){
		return tamanho;
	}

}
