package beans;

public class ContaBancaria {
	private String numero;
	private double saldo;
	private Cliente cliente;
	private double limiteEspecial;
	private String tipo;
	private int agencia;
	private Banco banco;

	public ContaBancaria() {
	}

	public ContaBancaria(String numero, Cliente cliente, double limiteEspecial, String tipo, int agencia, Banco banco) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.limiteEspecial = limiteEspecial;
		this.tipo = tipo;
		this.agencia = agencia;
		this.banco = banco;
	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public void definirLimite(double valor) {
		if (valor < (this.limiteEspecial = 0)){
			System.out.println("inv�lido");
		}else {
			System.out.println("ok");
		}

	}

	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Dep�sito no valor de " + valor + " efetuado com Sucesso.");
	}

	public void saque(double valor) {
		if (valor > (this.saldo + this.limiteEspecial)) {
			System.out.println("Valor indispon�vel para Saque. Sem Saldo");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println("Saque no valor de " + valor + " efetuado com Sucesso.");
		}
	}

	public void extrato() {
		System.out.println( "Conta: " + this.numero +" Cliente: " + this.cliente.getNome() + " Limite: " + this.limiteEspecial
				+ " Saldo: " + this.saldo + " Agencia: "+ this.agencia + " Banco: " + this.banco.getRazao());
	}

}
