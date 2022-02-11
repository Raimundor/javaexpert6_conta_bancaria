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

	public ContaBancaria(String numero, double saldo, Cliente cliente, double limiteEspecial, String tipo, int agencia,
			Banco banco) {
		super();
		this.numero = numero;
		this.saldo = saldo;
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

	public String definirLimite(double valor) {
		if (valor >= 0) {
			if (this.tipo.equals("corrente")) {
				this.limiteEspecial = valor;
				return "Operação realizada com sucesso";
			}
			return "Tipo de Conta Inválida";
		}
		return "Valor de limite Inválido";
	}

	public String  deposito(double valor) {
		this.saldo = this.saldo + valor;
		return "Depósito no valor de " + valor + " efetuado com Sucesso.";
	}

	public String saque(double valor) {
		if (valor > (this.saldo + this.limiteEspecial)) {
			return "Valor indisponível para Saque. Sem Saldo";
		} else {
			this.saldo = this.saldo - valor;
			extrato();
			return "Saque no valor de " + valor + " efetuado com Sucesso.";
		}
	}

	public void extrato() {
		System.out.println(
				"Conta: " + this.numero + " Cliente: " + this.cliente.getNome() + " Limite: " + this.limiteEspecial
						+ " Saldo: " + this.saldo + " Agencia: " + this.agencia + " Banco: " + this.banco.getRazao());
	}

}
