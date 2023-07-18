/**
 * 
 */
package br.com.mcoder.services;

import br.com.mcoder.dao.IProdutoDAO;
import br.com.mcoder.domain.Produto;
import br.com.mcoder.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
