
public class RegistroPontos {
	
	private CalculadoraBonus b;
	
	public RegistroPontos(CalculadoraBonus cb){
		b = cb;
	}
	
	public void fazerUmComentario(Usuario u){
		u.pontos += 3*b.bonus(u);
	}
	
	public void criarUmTopico(Usuario u){
		u.pontos += 5*b.bonus(u);
	}
	
	public void darUmLike(Usuario u){
		u.pontos += 1*b.bonus(u);
	}
}
