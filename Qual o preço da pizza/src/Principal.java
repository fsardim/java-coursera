
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Palmito");
		p1.adicionaIngrediente("Cebola");
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Palmito");	
		p2.adicionaIngrediente("Cebola");
		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Queijo cheddar");
		p3.adicionaIngrediente("Tomate");
		p3.adicionaIngrediente("Cebola");
		p3.adicionaIngrediente("Palmito");
		p3.adicionaIngrediente("Calabresa");
		p3.adicionaIngrediente("Queijo");
		
		Pizza p4 = new Pizza();
		
		c1.AdicionarCarrinho(p1);
		c1.AdicionarCarrinho(p2);
		c1.AdicionarCarrinho(p3);
		c1.AdicionarCarrinho(p4);
		
		c1.ImprimirValorCompra();
		Pizza.ListarIngredientes();
	}

}
