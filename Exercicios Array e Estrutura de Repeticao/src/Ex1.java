
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario = 1000.00;
		int anoAtual = 2020;
		double aumento = 1.015;
		System.out.println("O salário do funcionário em 1995 era de: " + salario);
		for(int i = 1996; i <= anoAtual; i++) {
			salario = salario * aumento;
			System.out.println("O salário do funcionário em " + i + " era de: " + salario);
			aumento = aumento * 2;
		}
	}

}
