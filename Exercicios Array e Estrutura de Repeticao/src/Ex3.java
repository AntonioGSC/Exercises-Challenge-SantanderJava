import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		try (Scanner recebeValor = new Scanner(System.in)) {
			int valor = 0;
			int result = 0;
			System.out.println("Digite um n�mero");
			valor = recebeValor.nextInt();
			for(int i = 1; i <= valor; i++) {
				result = i;
				for(int j = 1; j < i; j++) {
					result *= j;
				}
				System.out.println("O fatorial de " + i + " � " + result);
			}
		}
	}
}

