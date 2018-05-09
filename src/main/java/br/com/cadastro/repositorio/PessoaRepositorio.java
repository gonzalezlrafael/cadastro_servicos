package br.com.cadastro.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.cadastro.model.Pessoa;

/**
 * Interface que representa o repositorio de pessoas
 * @author gonzalez
 */
public interface PessoaRepositorio extends CrudRepository<Pessoa, Long> {

	
}
