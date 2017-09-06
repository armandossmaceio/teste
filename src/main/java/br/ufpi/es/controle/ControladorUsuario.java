package br.ufpi.es.controle;

import java.util.List;

import br.ufpi.es.dados.IRepositorioUsuario;
import br.ufpi.es.dados.Usuario;

public class ControladorUsuario {
	private IRepositorioUsuario repositorio;
	
	public ControladorUsuario(IRepositorioUsuario tipo){
		this.repositorio = tipo;
	}
	
	public void insere(Usuario u){
		repositorio.inserir(u);
	}
	
	public List<Usuario> lista(){
		return repositorio.listar();
	}
}
