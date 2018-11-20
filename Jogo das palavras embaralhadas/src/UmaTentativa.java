//Mecanica que permite apenas um erro, mas com pontuacao na potência de 2
public class UmaTentativa implements MecanicaDoJogo {
	
	private int tentativas, pontuacao;

	public UmaTentativa() {
		this.tentativas = 1;
		this.pontuacao = 1;
	}
	
	public String getNomeMecanica(){
		return "Uma Tentativa, Pontuação Exponencial";
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
		pontuacao *= 2;
	}

	@Override
	public void computarErro() {
		tentativas--;
	}
	
}
