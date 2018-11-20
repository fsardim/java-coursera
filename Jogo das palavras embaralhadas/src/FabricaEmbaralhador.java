import java.util.Random;

public class FabricaEmbaralhador {
	
	private Embaralhador embaralhador;
	
	public FabricaEmbaralhador(Embaralhador embaralhador){
		this.embaralhador = embaralhador;
	}
	
	public FabricaEmbaralhador(String palavra){
		Random gerador = new Random();
		if (gerador.nextBoolean())
			this.embaralhador = new InverterPalavra(palavra);
		else
			this.embaralhador = new VogaisPrimeiro(palavra);
	}

	public String getEmbaralhador(){
		return embaralhador.EmbaralharPalavra();
	}

}