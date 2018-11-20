import static org.junit.Assert.*;

import org.junit.Test;

public class TesteVogaisPrimeiro {

	@Test
	public void teste1Palavra() {
		FabricaEmbaralhador f = new FabricaEmbaralhador(new VogaisPrimeiro("Thais"));
		assertEquals("aiThs", f.getEmbaralhador());
	}

	@Test
	public void teste2Palavras() {
		FabricaEmbaralhador f = new FabricaEmbaralhador(new VogaisPrimeiro("S�o Paulo"));
		assertEquals("oauoS� Pl", f.getEmbaralhador());
	}

}
