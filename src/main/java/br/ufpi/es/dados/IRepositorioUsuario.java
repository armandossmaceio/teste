package br.ufpi.es.dados;

import java.util.List;

public interface IRepositorioUsuario {
	public void inserir(Usuario u);
	public List<Usuario> listar();
	public Usuario buscar(Usuario u);
	public void alterar(Usuario original, Usuario novo);
}
