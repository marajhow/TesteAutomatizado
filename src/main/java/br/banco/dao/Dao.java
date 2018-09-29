package br.banco.dao;

import java.util.List;

import javax.management.RuntimeErrorException;

import br.banco.dominio.Conta;

public interface Dao {

	List<Conta> getContas();

	void atualizaConta(Conta conta) throws RuntimeErrorException;

	void salvaConta(Conta conta);

}