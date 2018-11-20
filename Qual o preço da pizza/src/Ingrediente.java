
public class Ingrediente {
	String nomeIngrediente;
	int qtdIngrediente;
	
	public Ingrediente(String s){
		nomeIngrediente = s;
		qtdIngrediente = 1;
	}
	
	public String getIngrediente(){
		return nomeIngrediente;
	}
	
	public int getQtdIngrediente(){
		return qtdIngrediente;
	}
	
	public void IncrementaIngrediente(){
		qtdIngrediente++;
	}
	
	public void ImprimirDadosIngrediente(){
		System.out.println("Ingrediente: "+nomeIngrediente+", Quantidade: "+qtdIngrediente);
	}

}
