
public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException {
		if (login.equalsIgnoreCase("GUERRA") && senha.equalsIgnoreCase("Senha"))
			return new Usuario(login);
		throw new LoginException("Usuario e senha não conferem! ", login);
	}
}
