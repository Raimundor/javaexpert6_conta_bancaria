package implementacao;

import beans.ContaBancaria;
import util.Input;

public class ExecutarConta {

	public static void main(String[] args) {
		
		ContaBancaria cc = new ContaBancaria();
		
		cc.setCliente(Input.texto("Informe o Cliente: "));
		cc.setNumero(Input.texto("Informe o numero da conta"));
		cc.setLimiteEspecial(Input.decimalDouble("Informe o Limite Especial: "));
		cc.deposito(Input.decimalDouble("Depósito"));
		cc.saque(Input.decimalDouble("Saque"));
		
		cc.extrato();

	}

}
