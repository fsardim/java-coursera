import static org.junit.Assert.*;

import org.junit.Test;

public class TesteInverterPalavra {

	@Test
	public void teste1Palavra() {
		FabricaEmbaralhador f = new FabricaEmbaralhador(new InverterPalavra("Thais"));
		assertEquals("siahT", f.getEmbaralhador());
	}

	@Test
	public void teste2Palavras() {
		FabricaEmbaralhador f = new FabricaEmbaralhador(new InverterPalavra("S„o Paulo"));
		assertEquals("oluaP o„S", f.getEmbaralhador());
	}

}
