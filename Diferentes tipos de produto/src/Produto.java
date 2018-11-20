import java.util.Objects;
public class Produto {
	
	protected String nome, codigo;
	protected int preco;
	
	public Produto(String nome, String codigo, int preco){
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}

	@Override
	public boolean equals(Object o){
		
		if (o == this)
			return true;
		if (!(o instanceof Produto))
			return false;
		
		Produto OutroProduto = (Produto) o;
		return (this.codigo == OutroProduto.codigo);
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(codigo);
	}
	
	public int getPreco(){
		return preco;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCodigo(){
		return codigo;
	}
	
}
