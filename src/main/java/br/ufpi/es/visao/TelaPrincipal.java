package br.ufpi.es.visao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.ufpi.es.controle.ControladorUsuario;
import br.ufpi.es.dados.IRepositorioUsuario;
import br.ufpi.es.dados.RepositorioLista;
import br.ufpi.es.dados.RepositorioVetorUsuarios;
import br.ufpi.es.dados.Usuario;

public class TelaPrincipal {
	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		//cria usuarios
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		
		u1.setId(1);
		u1.setNome("Maria");
		u2.setId(2);
		u2.setNome("Francisca");

		//cria repositorio
		IRepositorioUsuario repositorioLista = new RepositorioLista();
		IRepositorioUsuario repositorioVetor = new RepositorioVetorUsuarios();
		
		//cria o controlador
		ControladorUsuario controlador = new ControladorUsuario(repositorioVetor);
		
		//insere usuarios
		controlador.insere(u1);
		controlador.insere(u2);
		
		//lista usuarios
		List<Usuario> lista = controlador.lista();
		for(Usuario u : lista){
			System.out.println("Id: " + u.getId() + " - " + u.getNome());
		}

		logger.debug("Registro de debug");
		logger.info("Registro de informação");
		logger.error("Registro de erro");
		logger.info("novo log");
	}

}
