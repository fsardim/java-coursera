import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutenticador {

	@Test
	public void testeLoginSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senha");
		assertEquals("guerra", u.getLogin());
	}

	@Test
	public void testeInformacaoErro() {
		try {
			Autenticador a = new Autenticador();
			Usuario u = a.logar("guerra", "senha errada");
			fail();
		} catch (LoginException e) {
			assertEquals("guerra", e.getLogin());
		}
	}
	
}
