import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner recebeValor = new Scanner(System.in)) {
			int fn1 = 0;
			int fn2 = 0;
			int result = 1;
			int valor = 0;
			System.out.println("Digite at� que termo da sequ�ncia de Fibonacci gostaria de saber: ");
			valor = recebeValor.nextInt();
			System.out.println("----------------------------------------------");
			System.out.println(fn1);
			System.out.println(result);
			for(int i = 1; i < valor; i++) {
				fn1 = result;
				result = fn1 + fn2;
				System.out.println(result);
				fn2 = fn1;
			}
		}
	}
}
