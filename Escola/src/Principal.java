
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno guerra = new Aluno();
		guerra.bim1 = 70;
		guerra.bim2 = 60;
		guerra.bim3 = 80;
		guerra.bim4 = 70;
		
		System.out.println(VerificadoraDeNotas.mediaAluno(guerra));
		System.out.println(VerificadoraDeNotas.passouDeAno(guerra));
		
		System.out.println(guerra.media());
		System.out.println(guerra.passouDeAno());
	}

}
