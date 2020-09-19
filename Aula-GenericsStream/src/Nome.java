
public class Nome implements Palavra{
	
	private String nome;

	public Nome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getTexto() {
		return nome;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
