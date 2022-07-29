
public class ControleBonus {

	private double soma;

	public void registraFuncionarios(Funcionario f) {
		double bonus = f.getBonus();
		this.soma += bonus;
	}

	public double getSoma() {
		return soma;
	}
}
