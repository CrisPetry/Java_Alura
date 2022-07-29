
public class TestaEscopoVar {

	public static void main(String[] args) {
		System.out.println("Testando condicionais: ");
		int idade = 19;
		boolean acompanhado = true;
		
		if(idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		}else {
			System.out.println("Infelizmente, você não pode entrar!");
		}
	}
}
