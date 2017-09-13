package br.ufpi.es.dados;

import java.util.List;

public interface IRepositorioUsuario {
	public void inserir(Usuario valor);
	public List<Usuario> listar();
	public Usuario buscar(Usuario valor);
	public void alterar(Usuario original, Usuario novo);
}
