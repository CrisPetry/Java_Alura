
public class Administrador extends Funcionario implements FuncionarioAutenticavel {

	private Autenticador autenticador;

	Administrador() {
		this.autenticador = new Autenticador();
	}

	@Override
	public double getBonus() {
		return 50;
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
