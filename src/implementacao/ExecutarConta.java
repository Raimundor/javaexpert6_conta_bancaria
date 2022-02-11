package implementacao;

import beans.Banco;
import beans.Cliente;
import beans.ContaBancaria;
import util.Input;

public class ExecutarConta {

	public static void main(String[] args) {
		
		Banco banco = new Banco(Input.texto("Informe o Banco"), 1);
		Cliente cliente = new Cliente("74789809898-23", Input.texto("Informe o Cliente: "),"999909000");
		
		ContaBancaria cc = new ContaBancaria(Input.texto("Informe o numero da conta")
										   , 0
										   , cliente
										   , Input.decimalDouble("Informe o Limite Especial: ")
										   , Input.texto("Informe tipo 'corrrente' ou 'poupança'")
										   , Input.inteiro("Informe a agencia: ")
										   , banco);

		cc.deposito(Input.decimalDouble("Depósito"));
		cc.saque(Input.decimalDouble("Saque"));
		
		cc.extrato();

	}

}
