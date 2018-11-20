//Colocar primeiro as vogais, depois as consoantes
public class VogaisPrimeiro implements Embaralhador {

	private String palavra;
	
	public VogaisPrimeiro(String palavra){
		this.palavra = palavra;
	}
	
	@Override
	public String EmbaralharPalavra() {
		char[] palavraChar = palavra.toCharArray();
		String palavraEmbaralhada = "";
		
		for (int i=0;i<palavra.length();i++){
			if (palavraChar[i] == 'a' || palavraChar[i] == 'A' ||
				palavraChar[i] == 'e' || palavraChar[i] == 'E' ||
				palavraChar[i] == 'i' || palavraChar[i] == 'I' ||
				palavraChar[i] == 'o' || palavraChar[i] == 'O' ||
				palavraChar[i] == 'u' || palavraChar[i] == 'U' )
					palavraEmbaralhada += palavraChar[i];
		}
		
		for (int i=0;i<palavra.length();i++){
			if (palavraChar[i] != 'a' && palavraChar[i] != 'A' &&
				palavraChar[i] != 'e' && palavraChar[i] != 'E' &&
				palavraChar[i] != 'i' && palavraChar[i] != 'I' &&
				palavraChar[i] != 'o' && palavraChar[i] != 'O' &&
				palavraChar[i] != 'u' && palavraChar[i] != 'U' )
					palavraEmbaralhada += palavraChar[i];
		}
		
		return palavraEmbaralhada;	
	}

}
