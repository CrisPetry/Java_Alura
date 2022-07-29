
public class TestandoContaSemCliente {

	public static void main(String[] args) {
		Conta contaDoCris = new Conta();
		System.out.println(contaDoCris.getSaldo());
		
		contaDoCris.titular = new Cliente();
		System.out.println(contaDoCris.titular);
			
		contaDoCris.titular.nome = "Cristian";
		
		System.out.println(contaDoCris.titular.nome);
		
		
	}
}
