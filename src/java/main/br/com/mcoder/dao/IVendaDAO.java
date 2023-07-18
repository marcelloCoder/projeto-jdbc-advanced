/**
 * 
 */
package br.com.mcoder.dao;

import br.com.mcoder.dao.generic.IGenericDAO;
import br.com.mcoder.domain.Venda;
import br.com.mcoder.exceptions.DAOException;
import br.com.mcoder.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
