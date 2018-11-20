import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {

    private ArrayList<String> palavrasLidas = new ArrayList<String>();
	
	private void LerArquivo() throws Exception{
		FileReader arq = new FileReader("C:/Users/Felipe/workspace/Jogo das palavras embaralhadas/src/Base.txt");
	    BufferedReader lerArq = new BufferedReader(arq);			 
	    
	    String linha = lerArq.readLine();
	    	    
	    while (linha != null) {
		    palavrasLidas.add(linha);
	        linha = lerArq.readLine(); // lê da segunda até a última linha
	    }
	    	    
		arq.close();
	}
	
	public int getQtdPalavras(){
		return palavrasLidas.size();
	}
	
	public String getPalavraSorteada() throws Exception {
		LerArquivo();
		Random gerador = new Random();
		String retorno = palavrasLidas.get(gerador.nextInt(getQtdPalavras()));
		return retorno;
	}
}
