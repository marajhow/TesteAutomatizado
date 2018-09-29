package br.banco.builder;

import java.util.ArrayList;
import java.util.List;

import br.banco.dominio.Conta;
import br.banco.dominio.Usuario;

public class ContaBuilder {
	
	private List<Conta> contas;
	private Usuario usuario;
	
	public ContaBuilder(){
		contas = new ArrayList<Conta>();
	}
	
	public ContaBuilder addConta(Conta conta, Usuario usuario){
		conta.setUsuario(usuario);
		this.contas.add(conta);
		return this;
	}
	
	public List<Conta> constroi() {
		return this.contas;
	}
	
}