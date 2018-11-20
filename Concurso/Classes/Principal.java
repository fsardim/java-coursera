import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		List<Candidato> lista = new ArrayList<>();
		lista.add(new Candidato(80,30,true));
		lista.add(new Candidato(80,25,false));
		lista.add(new Candidato(80,28,false));
		lista.add(new Candidato(90,20,false));
		
		Collections.sort(lista);
		
		for(Candidato c: lista){
			System.out.println(c);
		}
	}

}
