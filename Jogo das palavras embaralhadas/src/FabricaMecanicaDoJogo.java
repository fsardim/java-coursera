import java.util.Random;

public class FabricaMecanicaDoJogo {

	private MecanicaDoJogo mecanica;
	
	public FabricaMecanicaDoJogo(MecanicaDoJogo mecanica){
		this.mecanica = mecanica;
	}
	
	public FabricaMecanicaDoJogo(){
		Random gerador = new Random();
		if (gerador.nextBoolean())
			this.mecanica = new TresTentativas();
		else
			this.mecanica = new UmaTentativa();
	}

	public void RodarJogo(String palavraDigitada, String palavraCorreta) {
		if (palavraDigitada.contentEquals(palavraCorreta))
			mecanica.computarAcerto();
		else
			mecanica.computarErro();
	}
	
	public String getResultado(String palavraDigitada, String palavraCorreta) {
		if (palavraDigitada.contentEquals(palavraCorreta))
			return "Resposta certa!";
		else
			return "Resposta errada! Tentativas restantes: "+mecanica.getTentativas();
	}
	
	public String getNomeMecanica(){
		return mecanica.getNomeMecanica();
	}

	public boolean fimJogo(){
		if (mecanica.getTentativas() == 0)
			return true;
		return false;
	}
	
	public int getPontuacao(){
		return mecanica.getPontuacao();
	}
}
