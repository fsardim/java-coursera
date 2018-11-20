//Mecanica que permite até 3 erros e dá 5 pontos por acerto
public class TresTentativas implements MecanicaDoJogo {
	
	private int tentativas, pontuacao;

	public TresTentativas() {
		this.tentativas = 3;
		this.pontuacao = 0;
	}
	
	public String getNomeMecanica(){
		return "Tres Tentativas, Cinco Pontos";
	}

	@Override
	public int getPontuacao() {
		return pontuacao;
	}
	
	@Override
	public int getTentativas() {
		return tentativas;
	}

	@Override
	public void computarAcerto() {
		pontuacao += 5;
	}

	@Override
	public void computarErro() {
		tentativas--;
	}
	
}
