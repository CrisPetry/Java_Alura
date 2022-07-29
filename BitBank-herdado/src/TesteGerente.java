
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		
		FuncionarioAutenticavel referencia = new Cliente();
		
		g1.setNome("Kétlin");
		g1.setCpf("010.721.790-24");
		g1.setSalario(1500);
		g1.setSenha(1234);
		referencia.setSenha(4323);

		System.out.println(g1.getNome() + "\n" + g1.getCpf() + "\n" + g1.getSalario() + "\n" + g1.getBonus() + "\n"
				+ g1.autentica(1234) + referencia.autentica(4321));

	}

}
