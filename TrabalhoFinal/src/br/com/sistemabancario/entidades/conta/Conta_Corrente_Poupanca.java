package br.com.sistemabancario.entidades.conta;

import br.com.sistemabancario.entidades.auxiliares.Tipo;

public class Conta_Corrente_Poupanca extends Conta{
		
	public Conta_Corrente_Poupanca(String numConta, String nome, String senhaCad, Tipo tipo, float saldo) {
		super(numConta, nome, senhaCad, tipo, saldo);

	}


}