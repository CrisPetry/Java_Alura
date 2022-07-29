
public class TestaClasses {

	public static void main(String[] args) {
		Cliente cris = new Cliente();
		cris.nome = "Cristian Petry";
		cris.cpf = "027.055.700-80";
		cris.profissao = "Desenvolvedor";
		
		Conta contaDoCris = new Conta();
		contaDoCris.deposita(10);
		
		contaDoCris.titular = cris;
		
		System.out.println(contaDoCris.titular.cpf);
		
	}
}
