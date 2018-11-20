//Inverter palavra
public class InverterPalavra implements Embaralhador {
	
	private String palavra;
	
	public InverterPalavra(String palavra) {
		this.palavra = palavra;
	}

	@Override
	public String EmbaralharPalavra() {
		char[] palavraChar = palavra.toCharArray();
		String palavraEmbaralhada = "";
		
		for (int i=0;i<palavra.length();i++){
			palavraEmbaralhada += palavraChar[palavra.length()-i-1];
		}
		
		return palavraEmbaralhada;
	}
	
}
