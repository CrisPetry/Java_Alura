
public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Programador();

		funcionario.setNome("Cristian Guilherme Petry");
		funcionario.setCpf("055.027.800-70");
		funcionario.setSalario(1500.00);


		System.out.format("Nome : %s \nCPF : %s \nBônus : %s \nSalário total: %s", funcionario.getNome(),
				funcionario.getCpf(), funcionario.getBonus(), (funcionario.getBonus() + funcionario.getSalario()));
	}
}
