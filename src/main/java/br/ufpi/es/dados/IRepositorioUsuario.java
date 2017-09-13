package br.ufpi.es.dados;

import java.util.List;

public interface IRepositorioUsuario {
	public void inserir(Usuario usuario);
	public List<Usuario> listar();
	public Usuario buscar(Usuario usuario);
	public void alterar(Usuario original, Usuario novo);
}
