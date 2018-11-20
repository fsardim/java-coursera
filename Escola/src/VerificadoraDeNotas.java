
public class VerificadoraDeNotas {

	public static int mediaAluno(Aluno a){
		int total = 0;
		total = a.bim1 + a.bim2 + a.bim3 + a.bim4;
		return total / 4;
	}
	
	public static boolean passouDeAno(Aluno a){
		int media = mediaAluno(a);
		if (media > 60)
			return true;
		else
			return false;
	}
}
