import java.util.HashMap;

public class Pizza {

	private int qtdIngredientes = 0;
	public static int indiceIngrediente = 1;
	static HashMap<Integer, Ingrediente> listaIngredientes = new HashMap<Integer, Ingrediente>(); 
	
	public void adicionaIngrediente(String ing){
		qtdIngredientes++;
		contabilizaIngrediente(ing);
	}

	public int getPreco(){
		if (qtdIngredientes <= 2)
			return 15;
		else if (qtdIngredientes <= 5)
			return 20;
		else 
			return 23;
	}
	
	public int getQtdIngredientes(){
		return qtdIngredientes;
	}
	
	public boolean getPizzaComIngrediente(){
		if (getQtdIngredientes() > 0)
			return true;
		return false;
	}
	
	private void contabilizaIngrediente(String ing){
		int contaOcorrencias = 0;
		
		for (int i = 1;i <= listaIngredientes.size();i++){
			if (ing == listaIngredientes.get(i).getIngrediente()){
				contaOcorrencias = i;
				i = listaIngredientes.size();
			}
		}
		
		if (contaOcorrencias > 0)
			listaIngredientes.get(contaOcorrencias).IncrementaIngrediente();
		else {
			//Lógica para incluir membro na lista
			Ingrediente ingrediente = new Ingrediente(ing);
			listaIngredientes.put(indiceIngrediente, ingrediente);
			indiceIngrediente++;
		}
		
	}

	public static void ListarIngredientes(){
		for (int i = 1;i <= listaIngredientes.size();i++){
			listaIngredientes.get(i).ImprimirDadosIngrediente();
		}
	}
	
	public static void LimparRegistroDeIngredientes(){
		listaIngredientes.clear();
		indiceIngrediente = 1;
	}

}
