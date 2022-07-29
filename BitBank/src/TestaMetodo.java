
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoCris = new Conta();
		contaDoCris.saldo += 100;
		
		contaDoCris.deposita(100);
		System.out.println(contaDoCris.saldo);
		
		boolean conseguiuRetirar = contaDoCris.saca(20);
		System.out.println(contaDoCris.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaKetlin = new Conta();
		contaDaKetlin.deposita(1000);
		
		/*if(contaDaKetlin.transfere(200, contaDoCris)) {
			System.out.println("Transferência realizada com sucesso!");
		}*/
		
		boolean tranferenciaComSucesso = contaDaKetlin.transfere(50, contaDoCris);
		
		if(tranferenciaComSucesso) {
			System.out.println("Transferência realizada com sucesso!");
		}else {
			System.out.println("Faltou dinheiro!!!");
		}
		System.out.println(contaDoCris.saldo);
		System.out.println(contaDaKetlin.saldo);
	}
}
