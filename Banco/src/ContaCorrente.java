
public class ContaCorrente {
	
	int saldo = 0;
	
	public ContaCorrente(int valor){
		saldo = valor;
	}
	
	public int sacar(int valor){
		if(valor > saldo)
			return 0;
		else{
			saldo -= valor;
			return valor;
		}
			
	}
	
	public void depositar(int valor){
		saldo += valor;
	}
	
	public int getSaldo(){
		return saldo;
	}
}
