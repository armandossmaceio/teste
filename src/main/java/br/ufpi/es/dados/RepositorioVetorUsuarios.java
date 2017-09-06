package br.ufpi.es.dados;

import java.util.List;
import java.util.Vector;

public class RepositorioVetorUsuarios implements IRepositorioUsuario{
	private List<Usuario> repositorio = new Vector<Usuario>();
	
	public void inserir(Usuario u) {
		repositorio.add(u);
	}

	public List<Usuario> listar() {
		return repositorio;
	}

	public Usuario buscar(Usuario u) {
		// TODO Auto-generated method stub
		return null;
	}

	public void alterar(Usuario original, Usuario novo) {
		// TODO Auto-generated method stub
		
	}

}
