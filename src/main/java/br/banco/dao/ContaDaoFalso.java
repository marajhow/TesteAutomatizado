package br.banco.dao;

import java.util.ArrayList;
import java.util.List;

import br.banco.dominio.Conta;


public class ContaDaoFalso implements Dao{

	private static List<Conta> leiloes = new ArrayList<Conta>();
	
	public void salvaConta(Conta conta) {
		leiloes.add(conta);
	}

	public List<Conta> getContas(){
		return leiloes;
	}
	
	
	public void atualizaConta(Conta conta) { 

	
		
	}
}