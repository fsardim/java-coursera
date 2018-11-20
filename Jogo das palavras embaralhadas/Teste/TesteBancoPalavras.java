import static org.junit.Assert.*;

import org.junit.Test;

public class TesteBancoPalavras {

	@Test
	public void test() throws Exception {
		BancoDePalavras b = new BancoDePalavras();
		b.getPalavraSorteada();
		assertEquals(20, b.getQtdPalavras());
	}

}
