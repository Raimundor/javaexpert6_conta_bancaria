package beans;

public class ContaBancaria {
	private String numero;
	private double saldo;
	private String cliente;
	private double limiteEspecial;
	private String tipo;

	public ContaBancaria() {
	}

	public ContaBancaria(String numero, String cliente, double limiteEspecial, String tipo) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.limiteEspecial = limiteEspecial;
		this.tipo = tipo;
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

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
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
	

	public void definirLimite(double valor) {
		if (valor < (this.limiteEspecial = 0)){
			System.out.println("inválido");
		}else {
			System.out.println("ok");
		}

	}

	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Depósito no valor de " + valor + " efetuado com Sucesso.");
	}

	public void saque(double valor) {
		if (valor > (this.saldo + this.limiteEspecial)) {
			System.out.println("Valor indisponível para Saque. Sem Saldo");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println("Saque no valor de " + valor + " efetuado com Sucesso.");
		}
	}

	public void extrato() {
		System.out.println("Cliente: " + this.cliente + " Conta: " + this.numero + " Limite: " + this.limiteEspecial
				+ " Saldo: " + this.saldo);
	}

}
