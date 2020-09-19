import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Nome> lista = new ArrayList<>();
		
		lista.add(new Nome("Antonio"));
		lista.add(new Nome("Carvalho"));
		
		Nome nome = lista.get(0);
		Nome sobrenome = lista.get(1);
		
		Sobrenome sobrenome2 = new Sobrenome("Santos");
		
		Mostrar<Nome> mostrar = new Mostrar<Nome>();
		mostrar.getPalavra(sobrenome);
	}

}
