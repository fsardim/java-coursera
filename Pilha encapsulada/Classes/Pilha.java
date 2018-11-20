import java.util.Arrays;

public class Pilha {

	private Object[] elementos;
	private int topo = 0;
	
	public Pilha(int maximo) {
		elementos = new Object[maximo];
	}

	public void empilhar(Object elemento){
		elementos[topo] = elemento;
		topo++;
	}
	
	public Object desempilhar(){
		topo--;
		elementos[topo]=null;
		return elementos[topo];
	}
	
	public Object topo(){
		return elementos[topo-1];
	}
	
	public int tamanho(){
		return topo;
	}

	public Object[] getElementos() {
		return elementos;
	}

	public void setElementos(Object[] elementos) {
		this.elementos = elementos;
	}

	private void setTopo(int topo) {
		this.topo = topo;
	}
	
	public void imprimir(){
		for (int i=0;i<elementos.length;i++){
			System.out.println("Posicao "+i+": "+elementos[i]);
		}
	}
	
	public void incluirNoDez(Object o){
		if (elementos.length <= 10)
			incluirNoFim(o);
		else {
			setTopo(10);
			empilhar(o);
		}
	}
	
	public void incluirNoFim(Object o){
		setTopo(elementos.length-1);
		empilhar(o);
	}
}
