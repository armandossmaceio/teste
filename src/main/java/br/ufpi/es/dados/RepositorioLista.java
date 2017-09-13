package br.ufpi.es.dados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioLista implements IRepositorioUsuario{
	private List<Usuario> lista = new LinkedList<Usuario>();
	
	public void inserir(Usuario u) {
		lista.add(u);
	}

	public List<Usuario> listar() {
		return lista;
	}

	public Usuario buscar(Usuario u) {
		int index = lista.indexOf(u);
		return lista.get(index);
	}

	public void alterar(Usuario o, Usuario n) {
		// TODO Auto-generated method stub
	}

}
