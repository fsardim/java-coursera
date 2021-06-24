//Colocar primeiro as vogais, depois as consoantes
public class VogaisPrimeiro implements Embaralhador {

	private String palavra;
	
	public VogaisPrimeiro(String palavra){
		this.palavra = palavra.toLowerCase();
	}

	@Override
	public String EmbaralharPalavra() {
		char[] palavraChar = palavra.toCharArray();
		String vogais = "", consoantes = ""; 
			
		for (int i=0; i < palavra.length(); i++) {
			if (this.identificaVogal(palavraChar[i])) {
				vogais += palavraChar[i];				
			} else {
				consoantes += palavraChar[i]; 
			}
		}
		return vogais + consoantes;
	}

	public boolean identificaVogal(char letra) {
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
			return true;
		return false;
	}
	
}
