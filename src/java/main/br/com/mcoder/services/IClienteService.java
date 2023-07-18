/**
 * 
 */
package br.com.mcoder.services;

import br.com.mcoder.domain.Cliente;
import br.com.mcoder.exceptions.DAOException;
import br.com.mcoder.exceptions.TipoChaveNaoEncontradaException;
import br.com.mcoder.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
