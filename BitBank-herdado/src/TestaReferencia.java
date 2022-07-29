
public class TestaReferencia {

	public static void main(String[] args) {

		Funcionario g1 = new Gerente();

		g1.setNome("Edenilson");
		g1.setSalario(2000);

		Funcionario ev = new EditorVideo();
		ev.setSalario(3000);
		
		Funcionario p = new Programador();
		p.setSalario(5000);

		ControleBonus controle = new ControleBonus();

		controle.registraFuncionarios(g1);
		controle.registraFuncionarios(ev);
		controle.registraFuncionarios(p);
		
		System.out.println(controle.getSoma());
	}
}
