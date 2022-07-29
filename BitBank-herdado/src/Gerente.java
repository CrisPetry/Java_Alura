
public class Gerente extends Funcionario implements FuncionarioAutenticavel {

	private Autenticador autenticador;

	Gerente() {
		this.autenticador = new Autenticador();
	}

	public double getBonus() {
		return super.getSalario();
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
