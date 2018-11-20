import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception{
		
		FabricaMecanicaDoJogo m = new FabricaMecanicaDoJogo();
		System.out.println("Jogo iniciado.\nMecânica de jogo: "+m.getNomeMecanica());
				
		while(!m.fimJogo()){
			BancoDePalavras b = new BancoDePalavras();
			String palavraCorreta = b.getPalavraSorteada();

			FabricaEmbaralhador f = new FabricaEmbaralhador(palavraCorreta);
			System.out.println("\nPalavra embaralhada: "+f.getEmbaralhador());
			
			System.out.println("Adivinhe a palavra:");
			Scanner in = new Scanner(System.in);
			String palavraDigitada = in.nextLine();
			
			m.RodarJogo(palavraDigitada, palavraCorreta);
			System.out.println(m.getResultado(palavraDigitada, palavraCorreta));
		}
		
		System.out.println("\nFim do jogo. Sua pontuação foi: "+m.getPontuacao());

	}
	
}
