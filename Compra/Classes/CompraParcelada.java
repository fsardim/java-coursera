import java.math.*;
public class CompraParcelada extends Compra {

	protected double percJuros;
	protected int qtdParcelas;
	
	public CompraParcelada(double valor, int parcelas, double juros) {
		super(valor);
		this.qtdParcelas = parcelas;
		this.percJuros = juros;
	}
	
	@Override
	protected double total(){

		double var = 1.00;
		
		for (int i=0;i<qtdParcelas;i++){
			//juros *= (1+percJuros);
			var = var*(1+percJuros);
		}
		//j = v*(1+i)^n
		
		return var*valorCompra;
		
	}

}
