
public class AliquotaComIfs {

	public static void main(String[] args) {
		double salario = 4500.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("O IR é de 7.5% e" + " pode deduzir na declaração o valor de " + " R$ 142");
		} else if (salario >= 2800.1 && salario <= 3751.0) {
			System.out.println("O IR é de 15% e" + " pode deduzir R$ 350");
		} else if (salario >= 3751.1 && salario <= 4664.00)
			System.out.println("O IR é de 22.5% e" + " pode deduzir R$ 636");
	}
}
