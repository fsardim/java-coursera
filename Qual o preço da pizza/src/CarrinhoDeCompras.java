import java.util.HashMap;

public class CarrinhoDeCompras {

	static HashMap<Integer, Pizza> listaPizzas = new HashMap<Integer, Pizza>();
	static int indicePizza = 1;

	public void AdicionarCarrinho(Pizza p){
		if (p.getPizzaComIngrediente()) {
			listaPizzas.put(indicePizza, p);
			indicePizza++;
		}
		else
			System.out.println("Não pode adicionar pizza sem ingredientes!");
	}

	public void ImprimirValorCompra(){
		System.out.println("Valor total da compra: "+getTotalDaCompra());
	}
	
	public int getTotalDaCompra(){
		int valorCompra = 0;
		
		for (int i = 1;i <= listaPizzas.size();i++){
			valorCompra += listaPizzas.get(i).getPreco();	
		}
	
		return valorCompra;
	}
	
	public int getTotalDePizzas(){
		return listaPizzas.size();
	}
}
