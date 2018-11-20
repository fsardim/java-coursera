
public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(5);
		p.empilhar("Felipe");
		p.empilhar("Thais");
		p.empilhar("José");
		p.empilhar("");
		p.incluirNoFim("Aline");
		p.incluirNoDez("");
		p.imprimir();

		System.out.println("-------");
//		p.desempilhar();
//		p.imprimir();
		
//		System.out.println("-------");
//		p.empilhar("Olavo");
		
//		p.imprimir();
	}

}
