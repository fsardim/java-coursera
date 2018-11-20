
public class Candidato implements Comparable<Candidato> {
	
	private int nota, idade;
	private boolean deficiente;

	public Candidato(int nota, int idade, boolean deficiente) {
		this.nota = nota;
		this.idade = idade;
		this.deficiente = deficiente;
	}

	public int getNota() {
		return nota;
	}

	public int getIdade() {
		return idade;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	//sort usa o CompareTo
	@Override
	public int compareTo(Candidato outro) {
		if (nota == outro.getNota()){
			if (deficiente == outro.isDeficiente()){
				return idade - outro.getIdade();
			}else{
				if (deficiente)
					return 1;
				else
					return -1;
			}
		}else{
			return nota - outro.getNota();
		}
	}
	
	@Override
	public String toString(){
		return nota+";"+deficiente+";"+idade;
	}

}
