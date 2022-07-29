
public class Cliente implements FuncionarioAutenticavel {

	private Autenticador autenticador;

	Cliente() {
		this.autenticador = new Autenticador();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}

}
