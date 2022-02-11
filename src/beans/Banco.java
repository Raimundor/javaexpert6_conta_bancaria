package beans;

public class Banco {
	private String razao;
	private int idBancario;
	
	public Banco() {}

	public Banco(String razao, int idBancario) {
		super();
		this.razao = razao;
		this.idBancario = idBancario;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public int getIdBancario() {
		return idBancario;
	}

	public void setIdBancario(int idBancario) {
		this.idBancario = idBancario;
	}
	
	
	
	

}
